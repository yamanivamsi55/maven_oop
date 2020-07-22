package project;

import static org.junit.Assert.*;

import org.junit.Test;

public class gifttest {

	@Test
	public void test() {
		project1 t=new project1();
		Candies c[]=new Candies[5];
		c[0]=new Candies("toffee",3);
		 c[1]=new Candies("kitkat",6);
		c[2]=new Candies("dairymilk",8);
		c[3]=new Candies("melody",4);
		c[4]=new Candies("lotte",3);
		
		String output=t.display(c,3,5);
		assertEquals("toffee melody lotte ",output);
		
	}

}
