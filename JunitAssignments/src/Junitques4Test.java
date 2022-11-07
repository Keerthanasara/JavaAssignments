import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class Junitques4Test {
 
	Junitques4 obj=new Junitques4();
	@BeforeAll
	static void beforeallmethods() {
		System.out.println("print this before the object instantiated");
	}
	
	@AfterAll
	static void afterallmethods() {
		System.out.println("print this after the object instantiated");
	}
	 @BeforeEach
	 void clear() {
		 System.out.println("clearing");
	 }
	 @AfterEach
	 void afterall() {
		 System.out.println("after all");
	 }
	@Test
	void testadd() {
		assertEquals(2,obj.add(1, 1));
	}
	
	@Test
	void testsub() {
		assertEquals(0,obj.sub(1, 1));
	}
	
	@Test
	void testmul() {
		assertEquals(1,obj.mul(1, 1));
	}
	
	@Test
	void testdiv() {
		assertEquals(10,obj.div(100, 10));
	}
	
	

}
