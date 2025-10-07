package demotest;

import org.junit.Ignore;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.RepeatedTest;
import org.junit.jupiter.api.Test;

public class demo {
	@RepeatedTest(2)
	@Test
	public void show() {
		System.out.println("this is show method");
	}
	@Ignore
	void sayHi()
	{
		System.out.println("this is Hii method");
	}
	@DisplayName("junittesting2")
	@Test
	void hello() {
		System.out.println("this is helo method");
	}
	

}
