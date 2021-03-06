package com.ssm.shiro.test;

import org.apache.shiro.crypto.hash.SimpleHash;
import org.apache.shiro.util.ByteSource;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.ssm.shiro.service.UserService;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration({"classpath:applicationContext.xml","classpath:spring-servlet.xml"})
public class TestSpring {
		
	@Autowired
    UserService  userService ;
	
	 @Test
	 public void testSaveUsers(){
		 System.out.println(userService.selectByPrimaryKey(1));
	 }
	 
	 public static void main(String [] args){
		 String algorithmName="MD5";
		 ByteSource salt=ByteSource.Util.bytes("test");
		 Object source="test";
		int hashIterations=1024;
		 System.out.println(new SimpleHash(algorithmName, source, salt, hashIterations));
	 }

}
