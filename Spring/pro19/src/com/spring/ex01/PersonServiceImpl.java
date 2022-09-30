package com.spring.ex01;

public class PersonServiceImpl implements PersonService{
	
	/*09/27 실습*/
	private String name;
	private int age;
	
	public void setName(String name) {
		System.out.println("setName 출력");
		this.name = name;
	}
	
	@Override
	public void sayHello() {
		// TODO Auto-generated method stub
		
		System.out.println("이름 : "+ name);
		System.out.println("나이 : "+ age);
		
	}
	
	/*09/28 실습*/
	
	PersonServiceImpl(){
		
	}
	
	PersonServiceImpl(String name){
		System.out.println("String 생성자");
		this.name = name;
	}
	
	PersonServiceImpl(String name, int age){
		System.out.println("String,int 생성자");
		this.name = name;
		this.age = age;
	}

}
