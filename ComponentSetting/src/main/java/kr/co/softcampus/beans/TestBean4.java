package kr.co.softcampus.beans;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
//prototype : getBean 메서드가 실행될 때 마다 새로운 객체 생성
@Scope("prototype")
public class TestBean4 {

	public TestBean4() {
		System.out.println("TestBean4의 생성자!");
	}
}
