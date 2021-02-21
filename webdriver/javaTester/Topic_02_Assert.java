package javaTester;

import org.testng.Assert;

public class Topic_02_Assert {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String errorMessages = "This is a required field.";
		boolean status = true;
		//2 data = nhau hay k
		Assert.assertEquals("This is a required field", errorMessages);
		
		//Kiểm tra 1 điều kiện mong muốn trả về là đúng
		Assert.assertTrue(status);
		
		//Kiểm tra 1 điều kiện mong muốn trả về là sai
		status = false;
		Assert.assertFalse(status,"False");
	}

}
