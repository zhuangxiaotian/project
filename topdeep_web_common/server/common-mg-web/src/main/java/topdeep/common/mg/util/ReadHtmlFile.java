package topdeep.common.mg.util;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.Reader;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

public class ReadHtmlFile {

	private static final Log logger = LogFactory.getLog(ReadHtmlFile.class);

	// 读取普通文件
	public static String readFile(String filename) {
		File file = new File(filename);
		Reader reader = null;
		StringBuffer stb = new StringBuffer();
		int charread = 0;
		char[] temps = new char[100];
		try {
			reader = new InputStreamReader(new FileInputStream(file));
			while ((charread = reader.read(temps)) != -1) {
				if (charread == temps.length) {
					stb.append(temps);
					temps = new char[100];
					charread = 0;
				}
			}
			stb.append(temps);
			reader.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
		String str = stb.toString();
		return str;
	}

	// 读取普通文件
	public static String readFile(InputStream is) {
		StringBuffer stb = new StringBuffer();
		BufferedReader  reader = null;
		String line;
		try {
			reader = new BufferedReader(new InputStreamReader(is, "UTF-8"));
			line = reader.readLine();
			while(line != null){
				stb.append(line);
				line = reader.readLine();
			}
		} catch (IOException e) {
			logger.error("readFile"+e.getMessage(), e);
		}finally{
			if(reader != null){
				try {
					reader.close();
				} catch (IOException e) {
				}
			}
		}
		return stb.toString();
	}

}