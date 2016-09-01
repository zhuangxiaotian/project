package topdeep.common.mg.biz;

import java.util.Date;
import java.util.Properties;

import javax.mail.Authenticator;
import javax.mail.Message;
import javax.mail.MessagingException;
import javax.mail.Multipart;
import javax.mail.PasswordAuthentication;
import javax.mail.Session;
import javax.mail.Transport;
import javax.mail.internet.AddressException;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeBodyPart;
import javax.mail.internet.MimeMessage;
import javax.mail.internet.MimeMultipart;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import topdeep.common.mg.biz.common.CommonMgSystemParamBiz;

/**
 * 
 * @author shidewen
 * 
 */
@Service("commonSendEmailBiz")
public class CommonSendEmailBiz {

	@Autowired
	@Qualifier("commonMgSystemParamBiz")
	private CommonMgSystemParamBiz commonMgSystemParamBiz;

	public void send(final String from, final String pwd, String toEmail, String content) throws AddressException, MessagingException {
		Session session = getSession(from, pwd);

		Message msg = new MimeMessage(session);

		// Set message attributes
		msg.setFrom(new InternetAddress(from));
		InternetAddress[] address = {
			new InternetAddress(toEmail)
		};
		msg.setRecipients(Message.RecipientType.TO, address);
		msg.setSubject("玄谷信息科技有限公司");
		msg.setSentDate(new Date());
		Multipart mp = new MimeMultipart("related");
		MimeBodyPart mbp = new MimeBodyPart();
		mbp.setContent(content.toString(), "text/html;charset=utf-8");
		mp.addBodyPart(mbp);
		msg.setContent(mp);

		// Send the message
		Transport.send(msg);

	}

	/**
	 * 获取Session
	 * 
	 * @return
	 */
	private Session getSession(final String from, final String pwd) {
		Properties props = new Properties();
		props.put("mail.smtp.host", commonMgSystemParamBiz.getCommonMgApplicationParam().getSmtpHost());// 设置服务器地址
		props.put("mail.smtp.port", commonMgSystemParamBiz.getCommonMgApplicationParam().getSmtpPort());// 设置端口
		props.put("mail.smtp.auth", commonMgSystemParamBiz.getCommonMgApplicationParam().getSmtpAuth());

		Authenticator authenticator = new Authenticator() {

			@Override
			protected PasswordAuthentication getPasswordAuthentication() {
				return new PasswordAuthentication(from, pwd);
			}

		};
		Session session = Session.getDefaultInstance(props, authenticator);

		return session;
	}

}