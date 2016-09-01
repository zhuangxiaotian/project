/**
 * 
 */
package topdeep.common.mg.util;

import java.net.InetAddress;
import java.net.NetworkInterface;
import java.util.Enumeration;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import common.util.StringUtils;

/**
 * @author niexin
 *
 */
public class TopdeepUtils {

	private static Log logger = LogFactory.getLog(TopdeepUtils.class); 
	
	/**
	 * 
	 */
	public TopdeepUtils() {
		// TODO Auto-generated constructor stub
	}
	
	public static String getLocalIp(){
    	try{
			Enumeration<NetworkInterface> e=NetworkInterface.getNetworkInterfaces();
	        while(e.hasMoreElements())
	        {
	        	try{
	            	NetworkInterface networkInterface = e.nextElement();
	//            	logger.debug(networkInterface.getName()+"-start");
	            	if(!networkInterface.isUp() || networkInterface.isLoopback() || networkInterface.isVirtual()){
	            		continue;
	            	}
	            	Enumeration<InetAddress> addresses = networkInterface.getInetAddresses();
	            	while(addresses.hasMoreElements()){
	            		InetAddress address = addresses.nextElement();
	            		if(!address.isLoopbackAddress() && !address.isLinkLocalAddress() && address.isSiteLocalAddress()){
	            			return address.getHostAddress();
	            		}
	            	}
	//            	logger.debug(networkInterface.getName()+"-end");
	        	}catch(Exception ex){
	        		logger.error("getLocalIp error: "+ex.getMessage(), ex);
	        	}
	        }
    	}catch(Exception ex){
    		logger.error("getLocalIp error: "+ex.getMessage(), ex);
    	}
        //can't find ip
        return "no_ip_found";
	}

	public static boolean isAbsolutePath(String path){
		if(StringUtils.isNullOrEmpty(path)){
			return false;
		}
		if(path.startsWith("/")){
			return true;
		}
		if(path.length() < 3){
			return false;
		}
		path = path.substring(0,3).toLowerCase();
		String[] pans = new String[]{"a","b","c","d","e","f","g","h","i","j","k","l","m","n","o","p","q","r","s","t","u","v","w","x","y","z"};
		for(String item : pans){
			if(path.equals(item+":/")){
				return true;
			}else if(path.equals(item+":\\")){
				return true;
			}
		}
		return false;
	}
}
