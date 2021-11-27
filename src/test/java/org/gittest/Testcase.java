package org.gittest;
import org.base.Base;
import org.testng.annotations.Test;

public class Testcase extends Base{
public static void main(String[] args) {
	Testcase t=new Testcase();
	t.testcase1();
	t.testcase2();
	t.testcase3();
	}
private void testcase1() {
		
	System.out.println("java");
	System.out.println("selenium");
	System.out.println("cucumber");
	
	
}
private void testcase2() {
	System.out.println("java1");
	System.out.println("selenium1");
	System.out.println("cucumber1");
	
}
private void testcase3() {
	System.out.println("java2");
	System.out.println("selenium2");
	System.out.println("cucumber3");
	
}
}
