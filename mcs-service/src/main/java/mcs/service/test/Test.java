package mcs.service.test;

import org.apache.jcs.JCS;
import org.apache.jcs.access.CacheAccess;
import org.apache.jcs.access.exception.CacheException;

public class Test {

	 private JCS bookCache;
	
	
	public static void main(String[] args) throws Exception, CacheException {
		// TODO Auto-generated method stub

		
		
		Test test=new Test();
		test.bookCache=JCS.getInstance("default");
	test.bookCache.put("1", "val1");
	test.bookCache.put("2", "val1");
	test.bookCache.put("2", "val2");
	System.out.println(test.bookCache.get("2"));
	test.bookCache.put("3", "val3");
	//test.bookCache.put("4", "val1");
	test.bookCache.putSafe("3", "val3");
	System.out.println(test.bookCache.get("3"));
	System.out.println(test.bookCache.get("4"));
	System.out.println(test.bookCache.get("4"));
	test.bookCache.putInGroup("4", "session", "req1");
	test.bookCache.putInGroup("5", "session", "req1");
	test.bookCache.getGroupKeys("session");
	
	}

}
