package topdeep.common.util;

import org.testng.annotations.Test;

public class UUIDGeneratorTest {

	private void debug(String msg) {
		System.out.println(msg);
	}

	@Test
	public void getUUID24() {
		debug(UUIDGenerator.getUUID24());
		debug(UUIDGenerator.getUUID24());
		debug(UUIDGenerator.getUUID24());
		debug(UUIDGenerator.getUUID24());
		debug(UUIDGenerator.getUUID24());
		debug(UUIDGenerator.getUUID24());
		debug(UUIDGenerator.getUUID24());
	}

	@Test
	public void getUUID32() {
		debug(UUIDGenerator.getUUID32());
		debug(UUIDGenerator.getUUID32());
		debug(UUIDGenerator.getUUID32());
		debug(UUIDGenerator.getUUID32());
		debug(UUIDGenerator.getUUID32());
	}

}
