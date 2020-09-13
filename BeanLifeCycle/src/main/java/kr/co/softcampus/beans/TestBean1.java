package kr.co.softcampus.beans;

public class TestBean1 {
	
		public TestBean1() {
			System.out.println("TestBean 객체 생성!");
		}
		
		//init-method : 셍성자 호출 이후 자동으로 호출된다.
		public void bean1_init() {
			System.out.println("TestBean1의 init 메서드");
		}
		
		//destroy-method : 객체가 소멸될 때 자동으로 호출된다. 
		public void bean1_destroy() {
			System.out.println("TestBean1의 destroy 메서드");
		}
}
