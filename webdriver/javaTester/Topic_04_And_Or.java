package javaTester;

import org.testng.Assert;

public class Topic_04_And_Or {

	public static void main(String[] args) {
		// male
		boolean firstStatus = true;
		
		// female
		boolean secondStatus = false;
		
		//AND: true & false = false
		System.out.println("----AND----");
		System.out.println(firstStatus & secondStatus);
		
		//AND: false & true = false
		firstStatus = false;
		secondStatus = true;
		System.out.println(firstStatus & secondStatus);
		
		//AND: false & false = false
		firstStatus = false;
		secondStatus = false;
		System.out.println(firstStatus & secondStatus);
		
		//AND: true & true = true
		firstStatus = true;
		secondStatus = true;
		System.out.println(firstStatus & secondStatus);
		
		//OR: true & false = true
		firstStatus = true;
		secondStatus = false;
		System.out.println("----OR----");
		System.out.println(firstStatus | secondStatus);
		
		//OR: false & true = true
		firstStatus = false;
		secondStatus = true;
		System.out.println(firstStatus | secondStatus);
		
		//OR: false & false = false
		firstStatus = false;
		secondStatus = false;
		System.out.println(firstStatus | secondStatus);
				
		//OR: true & true = true
		firstStatus = true;
		secondStatus = true;
		System.out.println(firstStatus | secondStatus);
	}

}
