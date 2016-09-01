package topdeep.common.mg.action.verifycode;

import java.awt.image.BufferedImage;

import javax.imageio.ImageIO;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import topdeep.common.mg.action.base.BaseAction;

@Controller
@RequestMapping(value = {
		"/v", "/verfycode"
})
public class VerifyCodeServlet extends BaseAction {

	/**
	 * runMode[normal|test|autotest]
	 */
	@Value("#{application['runMode']?:'normal'}")
	protected String runMode;

	private org.apache.commons.logging.Log log = org.apache.commons.logging.LogFactory.getLog(VerifyCodeServlet.class);

	private static final long serialVersionUID = 1L;

	@RequestMapping(value = "VerifyCodeServlet", method = {
		RequestMethod.GET
	}, produces = "image/jpeg")
	@ResponseBody
	public void image(HttpServletRequest request, HttpServletResponse response) {
		response.setContentType("image/jpeg");// 设置相应类型,告诉浏览器输出的内容为图片
		response.setHeader("Pragma", "No-cache");// 设置响应头信息，告诉浏览器不要缓存此内容
		response.setHeader("Cache-Control", "no-cache");
		response.setDateHeader("Expire", 0);
		RandomValidateCode randomValidateCode = new RandomValidateCode();
		try {
			String randStr = "";
			if (runMode.equals("autotest")) {
				randStr = "1234";
			} else {
				randStr = randomValidateCode.getRandomCode();
			}
			BufferedImage image = randomValidateCode.getImage(randStr);// 输出图片方法
			webUserRuntimeBiz.set("pictureValidatecode", randStr);
			ImageIO.write(image, "JPEG", response.getOutputStream());// 将内存中的图片通过流动形式输出到客户端
		} catch (Exception e) {
			log.debug(e.getMessage(), e);
		}
	}
}
