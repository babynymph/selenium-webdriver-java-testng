package javaTester;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.remote.RemoteWebDriver;

public class Topic_01_Data_Type {
	//chứa những ký tự (duy nhất 1 ký tự)
	//char
	char a= 'c';
	
	//Chứa số nguyên (k có dấu)
	//byte
	byte byteNumber = 127;
	
	//short
	short shortNumber = 6300;
	
	//int
	int intNumber = 500;
	
	//long 
	long longNumber = 5000000;
	
	//Chứa số thực (có dấu)
	//float
	float floatNumber = 59.635F;
	
	//double
	double doubleNumber = 5659.3659D;
	
	//Luận lý (đúng/sai)
	//boolean
	boolean status = true;
	
	//Chứa những chuỗi ký tự (số/chữ/đặc biệt)
	//String
	String name = "Nguyen Thi Khanh Van";
	String address = "47 Phú Viên, Long Bien, Ha Noi";
	String password = "123456@";
	
	//Kiểu class
	//Class
	Topic_01_Data_Type topic01;
	
	//Kiểu đối tượng
	//Object
	
	//Kiểu mảng
	//Array
	String[] students = {"Khanh Van","Address","Password"};
	int[] salary = {1600,1500,1000};
	
	//Kiểu Interface
	//Interface
	WebDriver driver;
	RemoteWebDriver remoteDriver;
	
	//Kiểu tập hợp (List/set/Queue: Interface)
	//List: ArrayList/ LinkedList/...
	//Collection
	List<String> studentName = new ArrayList<String>();
	
}
