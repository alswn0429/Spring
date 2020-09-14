package kr.co.softcampus.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Lazy;
import org.springframework.context.annotation.Primary;
import org.springframework.context.annotation.Scope;

import kr.co.softcampus.beans.TestBean1;
import kr.co.softcampus.beans.TestBean2;
import kr.co.softcampus.beans.TestBean3;
import kr.co.softcampus.beans.TestBean4;

@Configuration
public class BeanConfigClass {
	
	//TestBean1타입의 메서드 java1();
	//메서드의 이름이 빈의 이름이 된당
	@Bean
	public TestBean1 java1() {
		TestBean1 t1 = new TestBean1();
		return t1;
	}
	
	//Bean(name = " ") : bean의 이름 새롭게 정의! 
	@Bean(name = "java600")
	public TestBean1 java500() {
		TestBean1 t1 = new TestBean1();
		return t1;
	}
	
	//@Lazy : Xml을 로딩할때 객체가 생성되는게 아니라 getBean할때 생성!
	@Bean
	@Lazy
	public TestBean2 java2() {
		TestBean2 t2 = new TestBean2();
		return t2;
	}
	
	//@Scpoe : bean의 scope속성 지정
	//prototype은 getBean할때마다 객체 새로 생성
	//prototype안쓰면 Singleton이라 객체 하나만 생성돼!
	@Bean
	@Scope("prototype")
	public TestBean3 java3() {
		TestBean3 t3 = new TestBean3();
		return t3;
	}
	
	@Bean
	public TestBean4 java4() {
		TestBean4 t4 = new TestBean4();
		return t4;
	}
	
	//같은 클래스 타입의 빈이 여러개 정의되면 사용할 빈에 @Primary어노테이션을 줘야해!
	@Bean
	@Primary
	public TestBean4 java5() {
		TestBean4 t4 = new TestBean4();
		return t4;
	}
}
