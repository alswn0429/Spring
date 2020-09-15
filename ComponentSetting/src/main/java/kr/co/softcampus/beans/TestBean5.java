package kr.co.softcampus.beans;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

import org.springframework.context.annotation.Lazy;
import org.springframework.stereotype.Component;

@Component
@Lazy
public class TestBean5 {

	public TestBean5() {
		System.out.println("TestBean5의 생성자!");
	}
	
	@PostConstruct
	public void init() {
		System.out.println("init메서드 호출!");
	}
	
	@PreDestroy
	public void destroy() {
		System.out.println("destroy메서드 호출!");
	}
}
