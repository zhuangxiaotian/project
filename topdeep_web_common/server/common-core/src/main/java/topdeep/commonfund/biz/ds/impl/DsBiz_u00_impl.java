package topdeep.commonfund.biz.ds.impl;

import java.text.SimpleDateFormat;
import java.util.Date;

import topdeep.commonfund.biz.ds.DsBiz_u00;
import topdeep.commonfund.entity.ds.def.DsAuthenticationInput;
import topdeep.commonfund.entity.ds.def.DsAuthenticationOutput;
import topdeep.commonfund.entity.ds.def.DsCustInfoQueryInput;
import topdeep.commonfund.entity.ds.def.DsCustInfoQueryOutput;
import topdeep.commonfund.entity.ds.def.DsCustInfoQueryOutputFundAccountDetail;
import topdeep.commonfund.entity.ds.def.DsFundCurrencyPurchaseInput;
import topdeep.commonfund.entity.ds.def.DsFundCurrencyPurchaseOutput;
import topdeep.commonfund.entity.ds.def.DsFundPurchaseInput;
import topdeep.commonfund.entity.ds.def.DsFundPurchaseOutput;
import topdeep.commonfund.entity.ds.def.DsLoginInput;
import topdeep.commonfund.entity.ds.def.DsLoginOutput;
import topdeep.commonfund.entity.ds.def.DsOpenAccountInput;
import topdeep.commonfund.entity.ds.def.DsOpenAccountOutput;
import topdeep.commonfund.entity.ds.def.DsPasswordUpdateInput;
import topdeep.commonfund.entity.ds.def.DsPasswordUpdateOutput;
import topdeep.commonfund.entity.ds.def.DsSmsCodeSendInput;
import topdeep.commonfund.entity.ds.def.DsSmsCodeSendOutput;
import topdeep.commonfund.entity.ds.def.DsSmsCodeValidInput;
import topdeep.commonfund.entity.ds.def.DsSmsCodeValidOutput;
import topdeep.commonfund.entity.ds.def.DsTransactionsAccountQueryInput;
import topdeep.commonfund.entity.ds.def.DsTransactionsAccountQueryOutput;
import topdeep.commonfund.entity.ds.def.DsTransactionsAccountQueryOutputDetail;
import topdeep.commonfund.entity.hundsun.B022Input;
import topdeep.commonfund.entity.hundsun.B022Output;
import topdeep.commonfund.entity.hundsun.B026Input;
import topdeep.commonfund.entity.hundsun.B026Output;
import topdeep.commonfund.entity.hundsun.B040Input;
import topdeep.commonfund.entity.hundsun.B040Output;
import topdeep.commonfund.entity.hundsun.B041Input;
import topdeep.commonfund.entity.hundsun.B041Output;
import topdeep.commonfund.entity.hundsun.C010Input;
import topdeep.commonfund.entity.hundsun.C010Output;
import topdeep.commonfund.entity.hundsun.C034Input;
import topdeep.commonfund.entity.hundsun.C034Output;
import topdeep.commonfund.entity.hundsun.C034OutputTradeaccolist;
import topdeep.commonfund.entity.hundsun.HundsunCallSession;
import topdeep.commonfund.entity.hundsun.P003Input;
import topdeep.commonfund.entity.hundsun.P003Output;
import topdeep.commonfund.entity.hundsun.V012Input;
import topdeep.commonfund.entity.hundsun.V012Output;
import topdeep.commonfund.entity.hundsun.V013Input;
import topdeep.commonfund.entity.hundsun.V013Output;

import common.util.StringUtils;

public class DsBiz_u00_impl extends FundBizImplBase implements DsBiz_u00 {

	public DsLoginOutput login(DsLoginInput inputParam) {
		DsLoginOutput output = new DsLoginOutput();
		try {
			P003Input in = new P003Input();// 现支持无密码登录
			in.setLognumber(inputParam.getIdNo());
			in.setPassword(inputParam.getPassword());
			in.setCertificatetype(inputParam.getIdType());
			if (inputParam.getIdType().equals("F")) {
				in.setLogtype("1");
			} else {
				in.setLogtype("2");
			}
			in.setSystype("");
			in.setChannel(inputParam.getZ_tradeType());
			in.setMerid("ccbfund");
			HundsunCallSession callSession = new HundsunCallSession();
			callSession.setMerid("ccbfund");
			callSession.setMerPassword("ccbfund");
			P003Output out = tradeDao.p003(in, callSession);
			output.setCustomerId(out.getSessionkey());
			setSuccess(output);
		} catch (Exception ex) {
			logger.error(ex.getMessage(), ex);
			setCodeMsg(output, ex);
		}
		return output;
	}

	public DsOpenAccountOutput openAccount(DsOpenAccountInput inputParam) {
		// TODO Auto-generated method stub
		return null;
	}

	public DsPasswordUpdateOutput passwordUpdate(DsPasswordUpdateInput inputParam) {
		// TODO Auto-generated method stub
		return null;
	}

	public DsSmsCodeSendOutput smsCodeSend(DsSmsCodeSendInput inputParam) {
		DsSmsCodeSendOutput output = new DsSmsCodeSendOutput();
		HundsunCallSession callSession = new HundsunCallSession();
		callSession.setMerid("ccbfund");
		callSession.setMerPassword("ccbfund");
		try {

			// 判断资金方式
			if ("3".equals(inputParam.getCapitalMode())) {
				V012Input in1 = new V012Input();
				in1.setIdentityno(inputParam.getIdNo());
				in1.setIdentitytype(inputParam.getIdType());
				in1.setMobile(inputParam.getMobile());
				in1.setSendintent("openacco");
				in1.setWay("0");
				V012Output out1 = tradeDao.v012(in1, callSession);
				setSuccess(output);
			}
			// 建行直连调用
			else if ("005".equals(inputParam.getBankNo()) && "B".equals(inputParam.getCapitalMode())) {
				B040Input in1 = new B040Input();
				// in1.setAccoreqserial(value);
				// in1.setAmount(value);
				in1.setBankacco(inputParam.getBankAccount());
				in1.setBankserial(inputParam.getBankNo());
				in1.setCapitalmode(inputParam.getCapitalMode());
				in1.setCustomername(inputParam.getCustName());
				in1.setIdentityno(inputParam.getIdNo());
				in1.setIdentitytype(inputParam.getIdType());
				in1.setMobile(inputParam.getMobile());
				in1.setUseflag("openacco");
				in1.setUsertype("p");
				B040Output out1 = tradeDao.b040(in1, callSession);
				setSuccess(output);
			}
			// 工行直连
			else {
				if ("3".equals(inputParam.getCapitalMode())) {
				V012Input in1 = new V012Input();
				in1.setIdentityno(inputParam.getIdNo());
				in1.setIdentitytype(inputParam.getIdType());
				in1.setMobile(inputParam.getMobile());
				in1.setSendintent("openacco");
				in1.setWay("0");
				V012Output out1 = tradeDao.v012(in1, callSession);
				setSuccess(output);
				}
			}
		} catch (Exception ex) {
			logger.error(ex.getMessage(), ex);
			setCodeMsg(output, ex);
		}
		return output;
	}

	/**
	 * 验证短信验证码同时去鉴权
	 */
	public DsSmsCodeValidOutput smsCodeValid(DsSmsCodeValidInput inputParam) {
		DsSmsCodeValidOutput output = new DsSmsCodeValidOutput();
		HundsunCallSession callSession = new HundsunCallSession();
		callSession.setMerid("ccbfund");
		callSession.setMerPassword("ccbfund");
		try {
			if ("3".equals(inputParam.getCapitalMode())) {
				V013Input v013In = new V013Input();
				v013In.setAuthcode(inputParam.getSmsCode());
				v013In.setMobile(inputParam.getMobile());
				v013In.setIdentitytype(inputParam.getIdType());
				v013In.setIdentityno(inputParam.getIdNo());
				V013Output v013out = tradeDao.v013(v013In, callSession);

				B026Input in = new B026Input();
				in.setBusintype("OPENTRADEACCO");
				in.setBankacco(inputParam.getBankAccount());
				in.setBankserial(inputParam.getBankNo());
				in.setCustomerappellation(inputParam.getCustName());
				in.setEmail("123@qq.com");
				in.setIdentitytype(inputParam.getIdType());
				in.setIdentityno(inputParam.getIdNo());
				in.setMobile(inputParam.getMobile());
				int sexNo = 0;
				// 根据证件号码算出这个人的性别，身份证适用
				if ("0".equals(inputParam.getIdType())) {
					if (inputParam.getIdNo().length() == 15) {
						sexNo = Integer.valueOf(inputParam.getIdNo().substring(14));
					} else if (inputParam.getIdNo().length() == 18) {
						sexNo = Integer.valueOf(inputParam.getIdNo().substring(16, 17));
					}
					sexNo = Integer.valueOf(sexNo) % 2;
					if (sexNo != 0) {
						in.setSex("1");
					} else {
						in.setSex("0");
					}
				} else {
					in.setSex("1");
				}
				B026Output out = tradeDao.b026(in, callSession);

				// 银联验证完验证码立刻鉴权
				setSuccess(output);
			}
			// 建行直连用４１验证
			else if ("005".equals(inputParam.getBankNo()) && "B".equals(inputParam.getCapitalMode())) {
				B041Input in1 = new B041Input();
				int random = (int) (Math.random() * 1000000);
				in1.setAccoreqserial(new SimpleDateFormat("yyyyMMddHHmmss").format(new Date()) + "" + random);
				// in1.setAmount(value);
				in1.setBankacco(inputParam.getBankAccount());
				in1.setBanksessionid(inputParam.getBankSeriseId());
				in1.setCapitalmode("B");
				in1.setIdentityno(inputParam.getIdNo());
				in1.setIdentitytype(inputParam.getIdType());
				in1.setCustomername(inputParam.getCustName());
				in1.setMobile(inputParam.getMobile());
				in1.setMobileauthcode(inputParam.getSmsCode());
				B041Output out1 = tradeDao.b041(in1, callSession);
				setSuccess(output);
			}

			// 工行验证验证码和鉴权
			else {
				V013Input v013In = new V013Input();
				v013In.setAuthcode(inputParam.getSmsCode());
				v013In.setMobile(inputParam.getMobile());
				v013In.setIdentitytype(inputParam.getIdType());
				v013In.setIdentityno(inputParam.getIdNo());
				V013Output v013out = tradeDao.v013(v013In, callSession);

				B022Input in1 = new B022Input();
				in1.setBankacco(inputParam.getBankAccount());
				in1.setBankserial(inputParam.getBankNo());
				if (inputParam.getBankNo().equals("002")) {
					in1.setCapitalmode("4");
				} else if (inputParam.getBankNo().equals("005")) {
					in1.setCapitalmode("B");
				}
				in1.setCustname(inputParam.getCustName());
				in1.setIdentityno(inputParam.getIdNo());
				in1.setIdentitytype(inputParam.getIdType());
				in1.setMobile(inputParam.getMobile());
				B022Output out1 = tradeDao.b022(in1, callSession);

			}
		} catch (Exception ex) {
			logger.error(ex.getMessage(), ex);
			setCodeMsg(output, ex);
		}
		return output;
	}

	public DsAuthenticationOutput authentication(DsAuthenticationInput inputParam) {
		DsAuthenticationOutput output = new DsAuthenticationOutput();
		HundsunCallSession callSession = new HundsunCallSession();
		callSession.setMerid("ccbfund");
		callSession.setMerPassword("ccbfund");
		try {
			// 银联鉴权
			if ("3".equals(inputParam.getCapitalMode())) {
				B026Input in = new B026Input();
				in.setBusintype("OPENTRADEACCO");
				in.setBankacco(inputParam.getBankAccount());
				in.setBankserial(inputParam.getBankNo());
				in.setCustomerappellation(inputParam.getCustName());
				in.setEmail("123@qq.com");
				in.setIdentitytype(inputParam.getIdType());
				in.setIdentityno(inputParam.getIdNo());
				in.setMobile(inputParam.getMobile());
				int sexNo = 0;
				// 根据证件号码算出这个人的性别，身份证适用
				if ("0".equals(inputParam.getIdType())) {
					if (inputParam.getIdNo().length() == 15) {
						sexNo = Integer.valueOf(inputParam.getIdNo().substring(14));
					} else if (inputParam.getIdNo().length() == 18) {
						sexNo = Integer.valueOf(inputParam.getIdNo().substring(16, 17));
					}
					sexNo = Integer.valueOf(sexNo) % 2;
					if (sexNo != 0) {
						in.setSex("1");
					} else {
						in.setSex("0");
					}
				} else {
					in.setSex("1");
				}
				B026Output out = tradeDao.b026(in, callSession);
				setSuccess(output);
			} else {
				B022Input in1 = new B022Input();
				in1.setBankacco(inputParam.getBankAccount());
				in1.setBankserial(inputParam.getBankNo());
				if (inputParam.getBankNo().equals("002")) {
					in1.setCapitalmode("4");
				} else if (inputParam.getBankNo().equals("005")) {
					in1.setCapitalmode("B");
				}
				in1.setCustname(inputParam.getCustName());
				in1.setIdentityno(inputParam.getIdNo());
				in1.setIdentitytype(inputParam.getIdType());
				in1.setMobile(inputParam.getMobile());
				B022Output out1 = tradeDao.b022(in1, callSession);
				setSuccess(output);
			}
		} catch (Exception ex) {
			logger.error(ex.getMessage(), ex);
			setCodeMsg(output, ex);
		}
		return output;
	}

	public DsTransactionsAccountQueryOutput transactionsAccountQuery(DsTransactionsAccountQueryInput inputParam) {
		DsTransactionsAccountQueryOutput output = new DsTransactionsAccountQueryOutput();
		HundsunCallSession callSession = new HundsunCallSession();
		callSession.setMerid("ccbfund");
		callSession.setMerPassword("ccbfund");
		try {

			C034Input in = new C034Input();
			in.setSessionkey(inputParam.getCustomerId());
			in.setState("0");
			in.setChannel(inputParam.getZ_tradeType());
			in.setMerid("ccbfund");
			in.setIdentitytype(inputParam.getIdType());
			in.setLognumber(inputParam.getIdNo());

			if (!StringUtils.isNullOrEmpty(inputParam.getIdType()) && inputParam.getIdType().equals("F")) {
				in.setLogtype("1");
			} else {
				in.setLogtype("2");
			}
			C034Output out = tradeDao.c034(in, callSession);
			for (C034OutputTradeaccolist item : out.getTradeaccolist()) {
				if (!item.getInternet().equals("1")) {
					continue;
				}
				if (!item.getState().equals("0")) {
					continue;
				}
				if (!item.getNeedbindcard().equals("0")) {
					continue;
				}
				DsTransactionsAccountQueryOutputDetail detail = new DsTransactionsAccountQueryOutputDetail();
				detail.setTransactionAccount(item.getTradeacco());
				detail.setBankName(item.getBankname());
				detail.setCapitalmode(item.getCapitalmode());
				detail.setBankNo(item.getBankserial());
				detail.setBankAccount(item.getBankacco());
				output.getDetail().add(detail);
			}
			setSuccess(output);
		} catch (Exception ex) {
			logger.error(ex.getMessage(), ex);
			setCodeMsg(output, ex);
		}
		return output;
	}

	public DsCustInfoQueryOutput custInfoQuery(DsCustInfoQueryInput inputParam) {
		DsCustInfoQueryOutput output = new DsCustInfoQueryOutput();
		try {
			C010Input in = new C010Input();
			in.setSessionkey(inputParam.getZ_sessionKey());
			in.setCusttype("1");
			in.setChannel(inputParam.getZ_tradeType());
			in.setMerid("ccbfund");
			HundsunCallSession callSession = new HundsunCallSession();
			callSession.setMerid("ccbfund");
			callSession.setMerPassword("ccbfund");
			C010Output out = tradeDao.c010(in, callSession);
			output.setCustNo(out.getCustno());
			output.setMobile(out.getHandset());
			output.setIdNo(out.getIdno());
			output.setIdType(out.getIdtype());
			output.setCustRiskLevel(out.getRiskability());
			output.setCustName(out.getCustomerappellation());
			if (out.getFundacco() == null) {
				out.setFundacco("");
			}
			for (String str : out.getFundacco().split(",", -1)) {
				DsCustInfoQueryOutputFundAccountDetail detail = new DsCustInfoQueryOutputFundAccountDetail();
				detail.setFundAccount(str);
				output.getFundAccountDetail().add(detail);
			}
			setSuccess(output);
		} catch (Exception ex) {
			logger.error(ex.getMessage(), ex);
			setCodeMsg(output, ex);
		}
		return output;
	}

	public DsFundPurchaseOutput fundPurchase(DsFundPurchaseInput inputParam) {
		// TODO Auto-generated method stub
		return null;
	}

	public DsFundCurrencyPurchaseOutput fundCurrencyPurchase(DsFundCurrencyPurchaseInput inputParam) {
		// TODO Auto-generated method stub
		return null;
	}

}
