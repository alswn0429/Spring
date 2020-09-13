package kr.co.softcampus.beans;

public class TestBean2 {

	public TestBean2() {
		System.out.println("TestBean2의 생성자");
	}
	
	//bean에 init-method, destro-method를 정의하지 않았다면 
	//beans설정에 default-init-method, default-destroy-method 속성을 넣어 사용 가능!
	public void default_init() {
		System.out.println("TestBean2의 default_init");
	}
	
	public void default_destroy() {
		System.out.println("TestBean2의 default_destroy");
	}
}
