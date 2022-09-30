package com.spring.ex01;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.FileSystemResource;

public class PersonTest {

	public static void main(String[] args) {
		
		//"이것이 자바다" 방법
//		PersonServiceImpl psi = new PersonServiceImpl();
//		psi.setName("김세종");
//		psi.sayHello();
		//원래 했던방식인 이렇게 직접하지말고 .xml을 이용해보자
		
		// 의존성 주입
		BeanFactory factory = new XmlBeanFactory(new FileSystemResource("person.xml"));
		System.out.println("before");
	    PersonService person = (PersonService) factory.getBean("personService");
	    person.sayHello();
	    
/*09/28 실습*/
	    System.out.println("\n--- person1 시작 ---");
	    PersonService person1 = (PersonService) factory.getBean("personService1");
	    person1.sayHello();
	    
	    System.out.println("\n--- person2 시작 ---");
	    PersonService person2 = (PersonService) factory.getBean("personService2");
	    person2.sayHello();
	    /*String, int 순서대로 들어가는 것 같음 순서를 바꾸니 에러가 남*/
	    
 	}

}
