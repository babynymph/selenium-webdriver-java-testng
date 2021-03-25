package javaTester;

import org.testng.Assert;

public class Topic_03_String {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String name = "Hello \"John\", What ";
		String hello = "'s happened?";
		String address = "US";
		
		System.out.println(name.concat(hello).concat(address));
		
	}

}
