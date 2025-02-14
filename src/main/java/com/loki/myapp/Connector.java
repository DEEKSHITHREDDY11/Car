package com.loki.myapp;


import org.springframework.stereotype.Component;

import java.util.Scanner;

@Component
public class Connector 
{	
	private User user;
	private Admin admin;
	private Cars car;

	Scanner sc = new Scanner(System.in);

	
	public Connector(User user, Admin admin,Cars car)
	{
		this.admin=admin;
		this.user=user;
		this.car=car;
	}
	
	public Boolean check(String emailId, String password)
	{
		boolean isval = admin.match(emailId, password);
		boolean isval2 = user.match(emailId, password);
		
		if(isval)
		{
			return true;
		}
		else if(isval2)
		{
			return true;
		}
		else
		{
			return false;
		}
	}
	
	public String check(String emailId)
	{
		String us = user.type(emailId);
		if(us.equals("user"))
		{
			return us;
		}
		else
		{
			return "admin";
		}
	}
	
	public Boolean tell(String emailId)
	{
		boolean us = user.userRental(emailId);
		if(us)
		{
			return true;
		}
		else
		{
			return false;
		}
	}
	
	public void rentedUser(String emaiId)
	{
		int ucarid = user.userstatus(emaiId);
		car.details(ucarid);
	}

	public void map()
	{
		System.out.println();
		System.out.println("1. User-Car Map");
		System.out.println("2. Exit");
		System.out.print("Enter your choice: ");
		int choice = sc.nextInt();
		System.out.println();
		switch (choice)
		{
			case 1:
				user.carMap();
				break;
			case 2:
				System.out.println("Thank You!...");
				break;
			default:
				System.out.println("enter a correct choice");
		}

	}
}
