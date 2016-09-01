/**
 * 
 */
package topdeep.common.web.util.lock;

import java.io.FileNotFoundException;
import java.io.IOException;

/**
 * @author niexin
 *
 */
public class MakeLock implements Runnable {

	private String threadID = "";

	public void run() {
		try {
			while (true) {
				test2(threadID);
				Thread.sleep(200);
			}
		} catch (IOException e) {
			System.out.println(e);
			e.printStackTrace();
		} catch (InterruptedException e) {
			System.out.println(e);
		}
	}

	public void test2(String threadID) throws FileNotFoundException, IOException, InterruptedException {
		Lock lock = new MakeLock(threadID).getLock("lockfile001.lock", threadID);
		System.out.println(threadID + ":obtain...");
		boolean b = lock.obtain();
		// 当有重叠时会发生等待，所以外侧先执行isLocked()判断
		System.out.println(threadID + ":obtained   " + b);
		if (b) {// 执行业务逻辑
			System.out.println(threadID + ":执行业务逻辑...");
			Thread.sleep(390);
			for (int i = 0; i < Integer.MAX_VALUE; i++) {
				;
			}
			lock.unlock();
		}
		lock = null;

	}

	public MakeLock(String threadID) {
		this.threadID = threadID;
	}

	public Lock getLock(String name, String threadID) {
		final StringBuffer buf = new StringBuffer();
		return FileProgrameLock.get(name, threadID);
	}
}
