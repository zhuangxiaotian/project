package topdeep.commonfund.entity.ds.util;
import topdeep.commonfund.entity.ds.def.*;
/**
 * Json对象工厂
 */
public class DsBaseInputObjectFactory extends DsBaseObjectFactory {
	
	protected Object createBaseObject() {
		return new DsBaseInput();
	}
	
	protected Object createObject(String funcCode) {
		if ("u00".equals(funcCode)) {
			return new DsLoginInput();
		}
		if ("u01".equals(funcCode)) {
			return new DsCustInfoQueryInput();
		}
		if ("u02".equals(funcCode)) {
			return new DsOpenAccountInput();
		}
		if ("u03".equals(funcCode)) {
			return new DsPasswordUpdateInput();
		}
		if ("u04".equals(funcCode)) {
			return new DsSmsCodeSendInput();
		}
		if ("u05".equals(funcCode)) {
			return new DsSmsCodeValidInput();
		}
		if ("u06".equals(funcCode)) {
			return new DsAuthenticationInput();
		}
		if ("u07".equals(funcCode)) {
			return new DsTransactionsAccountQueryInput();
		}
		if ("n00".equals(funcCode)) {
			return new DsFundListQueryInput();
		}
		if ("u08".equals(funcCode)) {
			return new DsFundPurchaseInput();
		}
		if ("u09".equals(funcCode)) {
			return new DsFundCurrencyPurchaseInput();
		}
		if ("u0a".equals(funcCode)) {
			return new DsFundRedeemInput();
		}
		if ("u0b".equals(funcCode)) {
			return new DsFundCurrencyRedeemInput();
		}
		if ("u0c".equals(funcCode)) {
			return new DsMyAssetsQueryInput();
		}
		if ("u0d".equals(funcCode)) {
			return new DsFundShareTransferInput();
		}
		if ("u0e".equals(funcCode)) {
			return new DsTodayApplicationQueryInput();
		}
		return this.createBaseObject();
	}
}
