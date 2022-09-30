package com.spring.ex03;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.FileSystemResource;

import com.spring.ex03.MemberService;

public class MemberTest1 {

	public static void main(String[] args) {
		
		System.out.println("1");
		BeanFactory factory = new XmlBeanFactory(new FileSystemResource("member.xml"));

		System.out.println("2");
	    MemberService ms = (MemberService) factory.getBean("memService");

	    System.out.println("3");
	    ms.callListMembers();
		
		
	}

}
