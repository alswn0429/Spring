package kr.co.softcampus.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import kr.co.softcampus.beans.TestBean1;

@Configuration
public class BeanConfigClass {
	
	//initMehod : 객체가 생성될때 자동 호출
	//destroyMethod : 객체가 소멸될 때 자동 호출
	@Bean(initMethod="init", destroyMethod="destroy")
	public TestBean1 java1() {
		return new TestBean1(); 
	}
}
