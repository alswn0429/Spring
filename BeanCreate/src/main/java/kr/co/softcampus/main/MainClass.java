package kr.co.softcampus.main;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import kr.co.softcampus.beans.TestBean;

public class MainClass {

	public static void main(String[] args) {
		ClassPathXmlApplicationContext ctx = new ClassPathXmlApplicationContext("kr/co/softcampus/config/beans.xml");
		
		//id가 test1인 빈객체의 주소값을 받아온다.
		TestBean t1 = ctx.getBean("test1", TestBean.class);
		System.out.printf("t1 : %s\n", t1);
		
		TestBean t2 = ctx.getBean("test1", TestBean.class);
		System.out.printf("t2 : %s\n", t2);
		
		//id가 test2인 bean객체의 주소값을 받아온다.
		TestBean t3 = ctx.getBean("test2", TestBean.class);
		System.out.printf("t3 : %s\n", t3);
		
		//싱글톤이기 때문에 새로운 객체가 생성되지 않음
		TestBean t4 = ctx.getBean("test2", TestBean.class);
		System.out.printf("t4 : %s\n", t4);
		
		//id가 test3인 bean객체의 주소값을 받아온다.
		TestBean t5 = ctx.getBean("test3", TestBean.class);
		System.out.printf("t5 : %s\n", t5);
		
		//prototype은 getBean메서드를 호출할 때 마다 새로운 객체 생성
		TestBean t6 = ctx.getBean("test3", TestBean.class);
		System.out.printf("t6 : %s\n", t6);
		
		ctx.close();
	}
}
