package kr.co.softcampus.beans;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class TestBean3 {

	private int data1;
	private String data2;
	private DataBean4 data3;
	private DataBean5 data4;
	
	//반드시 주입받아야 할 빈은 생성자를 통해서 주입받으면 돼!
	public TestBean3(@Value("100") int data1, @Value("Hello") String data2, DataBean4 data3, DataBean5 data4) {
		this.data1 = data1;
		this.data2 = data2;
		this.data3 = data3;
		this.data4 = data4;
	}
	
	
	public int getData1() {
		return data1;
	}
	public String getData2() {
		return data2;
	}
	public DataBean4 getData3() {
		return data3;
	}
	public DataBean5 getData4() {
		return data4;
	}
	
}
