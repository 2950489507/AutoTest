package com.autotest.testng;

import org.testng.annotations.AfterClass;
import org.testng.annotations.Test;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class TestNGDemo {

	//ִ��˳��  Suite->Test->Class->Method
	//һ�������׼��а������������Test,һ��Test�п��԰�������࣬һ�����п��԰���������Է���
	@Test //�����Եķ���
	public void testCase1() {
		System.out.println("This is TestCase1");
	}
	
	@BeforeMethod //�ڲ��Է���ִ��֮ǰִ��
	public void beforeMethod() {
		System.out.println("Run before the Test Method Everytime!");
	}
	
	@AfterMethod//�ڲ��Է���ִ��֮��ִ��
	public void afterMethod() {
		System.out.println("Run after the Test Method Everytime!");
	}
	
	@BeforeClass //�ڲ��Է���������ִ��֮ǰִ��
	public void beforeClass() {
		System.out.println("Run before the Class");
	}
	
	@AfterClass //�ڲ��Է���������ִ��֮��ִ��
	public void afterClass() {
		System.out.println("Run after the Class");
	}
	
	@BeforeSuite //�ڲ����׼�ִ��֮ǰִ�� ����֮ǰ
	public void beforeSuite() {
		System.out.println("Run before the Suite");
	}
	
	@AfterSuite //�ڲ����׼�ִ��֮��ִ��
	public void afterSuite() {
		System.out.println("Run after the Suite");
	}
	
	@BeforeTest //���׼��е�һ������ִ��֮ǰִ��
	public void beforeTest() {
		System.out.println("run before test");
	}
	@AfterTest //���׼��е�һ������ִ��֮��ִ��
	public void afterTest() {
		System.out.println("run after test");
	}
}

