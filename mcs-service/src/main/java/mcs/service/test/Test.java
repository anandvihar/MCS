package mcs.service.test;

import java.util.UUID;

import mcs.service.dao.admin.AdminDaoServiceImpl;



import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/*ApplicationContext applicationContext = new ClassPathXmlApplicationContext(
				"database-mgmt.xml");
	AdminDaoServiceImpl dao = applicationContext.getBean("adminDao", AdminDaoServiceImpl.class);
	
	dao.insertUser("sahil",1);
	System.out.println("User inserted with id= ");	
		/*
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
	*/
		
		System.out.println(UUID.nameUUIDFromBytes("sahil".getBytes()).toString());
		System.out.println(UUID.nameUUIDFromBytes("sahil".getBytes()).toString());
		System.out.println(UUID.nameUUIDFromBytes("sahil".getBytes()).toString());
		
		//System.out.println(UUID.fromString("Sahil").toString());
		
	}

}
