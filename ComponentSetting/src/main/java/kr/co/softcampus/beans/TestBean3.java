package kr.co.softcampus.beans;

import org.springframework.context.annotation.Lazy;
import org.springframework.stereotype.Component;

@Component
//Lazy : getBean메서드를 호출할 때 객체 생성
//Singleton
@Lazy
public class TestBean3 {

	public TestBean3() {
		System.out.println("TestBean3의 생성자!");
	}
}
