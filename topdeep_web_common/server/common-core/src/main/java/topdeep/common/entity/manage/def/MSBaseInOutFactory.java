package topdeep.common.entity.manage.def;

public class MSBaseInOutFactory {

	public static MSBaseInOut createObject(String command) {
		if ("c01Req".equals(command)) {
			return new MSReloadSystemParamsInput();
		}
		if ("c01Resp".equals(command)) {
			return new MSReloadSystemParamsOutput();
		}
		if ("c02Req".equals(command)) {
			return new MSReloadCacheInput();
		}
		if ("c02Resp".equals(command)) {
			return new MSReloadCacheOutput();
		}
		if ("c03Req".equals(command)) {
			return new MSUnbindCustomerInput();
		}
		if ("c03Resp".equals(command)) {
			return new MSUnbindCustomerOutput();
		}
		if ("c04Req".equals(command)) {
			return new MSReloadDictInput();
		}
		if ("c04Resp".equals(command)) {
			return new MSReloadDictOutput();
		}
		if ("c05Req".equals(command)) {
			return new MSReloadAllInput();
		}
		if ("c05Resp".equals(command)) {
			return new MSReloadAllOutput();
		}
		return null;
	}
}
