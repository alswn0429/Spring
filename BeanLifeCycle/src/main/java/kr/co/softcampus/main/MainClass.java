package kr.co.softcampus.main;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import kr.co.softcampus.beans.TestBean1;
import kr.co.softcampus.beans.TestBean2;
import kr.co.softcampus.beans.TestBean3;
import kr.co.softcampus.beans.TestBean4;

public class MainClass {

	public static void main(String[] args) {
		//Bean불러오기 : init-lazy="true"가 아닌 생성자들 호출!
		ClassPathXmlApplicationContext ctx = new ClassPathXmlApplicationContext("kr/co/softcampus/config/beans.xml");
		
		//getBean을 통해 init-lazy="true"인 객체들 생성!
		//여기서 init-method자동으로 호출
		TestBean1 t1 = ctx.getBean("t1", TestBean1.class);
		System.out.printf("t1 : %s\n", t1);
		
		
		System.out.println("------------------------------------");
		
		TestBean2 t2 = ctx.getBean("t2", TestBean2.class);
		System.out.printf("t2: %s\n" ,t2);
		
		System.out.println("------------------------------------");

		TestBean3 t3 = ctx.getBean("t3", TestBean3.class);
		System.out.printf("t3: %s\n", t3);

		System.out.println("------------------------------------");
		
		TestBean4 t4 = ctx.getBean("t4", TestBean4.class);
		System.out.printf("t4: %s\n", t4);
		
		System.out.println("------------------------------------");
		
		
		//IoC컨테이너 닫기 - 이때 객체들 소멸(destroy-method)
		ctx.close();
	}
}
 