package com.loki.myapp;

import java.util.Scanner;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class MyappApplication 
{
	public static void main(String[] args) 
	{
		ApplicationContext con = SpringApplication.run(MyappApplication.class, args);
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter your Email-Id: ");
		String emailId = sc.nextLine();
		
		System.out.print("Enter the password: ");
		String password = sc.nextLine();
		
		Connector conn = con.getBean(Connector.class);
		boolean isvalid = conn.check(emailId,password);
		
		if(isvalid)
		{
			System.out.println("Login Successful");
			Cars car = con.getBean(Cars.class);
			
			String type = conn.check(emailId);
			
			if(type.equals("admin"))
			{
				System.out.println();
				System.out.println("CARS WE HAVE");
				System.out.println("ID"+"  "+"NAME");
				car.display();
				System.out.print("Enter your Choice: ");
				int ch = sc.nextInt();
				System.out.println();

				car.show(ch);
				String status = car.status(ch);

				if(!status.equals("Rented"))
				{
					car.modify(ch);
				}
				conn.map();
			}
			else
			{
				boolean us = conn.tell(emailId);
				if (us)
				{
					conn.rentedUser(emailId);
				}
				else
				{
					System.out.println();
					System.out.println("CARS WE HAVE");
					System.out.println("ID"+"  "+"NAME");
					car.display();
					System.out.print("Enter your Choice: ");
					int ch = sc.nextInt();
					System.out.println();
					car.show(ch);
					car.revenue(ch);
				}
			}
		}
		else
		{
			System.out.println("Invalid Credentials");
			System.out.println("no user named:"+emailId);
		}
		sc.close();
	}
}