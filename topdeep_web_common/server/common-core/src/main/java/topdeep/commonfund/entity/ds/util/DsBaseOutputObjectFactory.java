package topdeep.commonfund.entity.ds.util;
import topdeep.commonfund.entity.ds.def.*;
/**
 * Json对象工厂
 */
public class DsBaseOutputObjectFactory extends DsBaseObjectFactory {
	
	protected Object createBaseObject() {
		return new DsBaseOutput();
	}
	
	protected Object createObject(String funcCode) {
		if ("u00".equals(funcCode)) {
			return new DsLoginOutput();
		}
		if ("u01".equals(funcCode)) {
			return new DsCustInfoQueryOutput();
		}
		if ("u02".equals(funcCode)) {
			return new DsOpenAccountOutput();
		}
		if ("u03".equals(funcCode)) {
			return new DsPasswordUpdateOutput();
		}
		if ("u04".equals(funcCode)) {
			return new DsSmsCodeSendOutput();
		}
		if ("u05".equals(funcCode)) {
			return new DsSmsCodeValidOutput();
		}
		if ("u06".equals(funcCode)) {
			return new DsAuthenticationOutput();
		}
		if ("u07".equals(funcCode)) {
			return new DsTransactionsAccountQueryOutput();
		}
		if ("n00".equals(funcCode)) {
			return new DsFundListQueryOutput();
		}
		if ("u08".equals(funcCode)) {
			return new DsFundPurchaseOutput();
		}
		if ("u09".equals(funcCode)) {
			return new DsFundCurrencyPurchaseOutput();
		}
		if ("u0a".equals(funcCode)) {
			return new DsFundRedeemOutput();
		}
		if ("u0b".equals(funcCode)) {
			return new DsFundCurrencyRedeemOutput();
		}
		if ("u0c".equals(funcCode)) {
			return new DsMyAssetsQueryOutput();
		}
		if ("u0d".equals(funcCode)) {
			return new DsFundShareTransferOutput();
		}
		if ("u0e".equals(funcCode)) {
			return new DsTodayApplicationQueryOutput();
		}
		return this.createBaseObject();
	}
}
