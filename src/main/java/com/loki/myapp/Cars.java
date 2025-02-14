package com.loki.myapp;

import java.util.Scanner;


import org.springframework.stereotype.Component;

@Component
public class Cars 
{
	private CarDetails car1;
	private CarDetails car2;
	private CarDetails car3;
	private CarDetails car4;
	private CarDetails car5;
	private CarDetails car6;
	private CarDetails car7;
	private CarDetails car8;
	private CarDetails car9;
	private CarDetails car10;

	Scanner sc = new Scanner(System.in);
	
	public Cars()
	{
		car1 = new CarDetails(1,"BMW","Rented",20000,1);
		car2 = new CarDetails(2,"AUDI","Not Rented",10000,0);
		car3 = new CarDetails(3,"BENZ","Not Rented",15000,0);
		car4 = new CarDetails(4,"FORTUNER","Not Rented",20000,0);
		car5 = new CarDetails(5,"NANO","Rented",2000,4);
		car6 = new CarDetails(6,"CURVE","Not Rented",3000,0);
		car7 = new CarDetails(7,"JAZZ","Not Rented",2000,0);
		car8 = new CarDetails(8,"LAMBO","Not Rented",50000,0);
		car9 = new CarDetails(9,"PORCHE","Not Rented",40000,0);
		car10 = new CarDetails(10,"BUGATTI","Not Rented",60000,0);
	}
	
	public void display()
	{
		System.out.println(car1.getCarId()+" : "+car1.getCarName());
		System.out.println(car2.getCarId()+" : "+car2.getCarName());
		System.out.println(car3.getCarId()+" : "+car3.getCarName());
		System.out.println(car4.getCarId()+" : "+car4.getCarName());
		System.out.println(car5.getCarId()+" : "+car5.getCarName());
		System.out.println(car6.getCarId()+" : "+car6.getCarName());
		System.out.println(car7.getCarId()+" : "+car7.getCarName());
		System.out.println(car8.getCarId()+" : "+car8.getCarName());
		System.out.println(car9.getCarId()+" : "+car9.getCarName());
		System.out.println(car10.getCarId()+" : "+car10.getCarName());
		System.out.println("11"+" : "+"Exit");
	}
	
	public void details(int id)
	{
		if(car1.getCarId() == id)
		{
			print(car1);
		}
		else if(car2.getCarId() == id)
		{
			print(car2);
		}
		else if(car3.getCarId() == id)
		{
			print(car3);
		}
		else if(car4.getCarId() == id)
		{
			print(car4);
		}
		else if(car5.getCarId() == id)
		{
			print(car5);
		}
		else if(car6.getCarId() == id)
		{
			print(car6);
		}
		else if(car7.getCarId() == id)
		{
			print(car7);
		}
		else if(car8.getCarId() == id)
		{
			print(car8);
		}
		else if(car9.getCarId() == id)
		{
			print(car9);
		}
		else if(car10.getCarId() == id)
		{
			print(car10);
		}
	}
	private void print(CarDetails car)
	{
		if(car.getStatus().equals("Rented"))
		{
			System.out.println(car.getCarName() + " : "+car.getPrice() + " : " +car.getStatus());
		}
		else
		{
			System.out.println("AVAILABLE: "+car.getStatus());
			System.out.println("PRICE: "+car.getPrice());
		}
	}
	
	
	public void show(int ch)
	{

		switch(ch)
		{
		case 1:
			details(ch);
			break;
		case 2:
			details(ch);
			break;
		case 3:
			details(ch);
			break;
		case 4:
			details(ch);
			break;
		case 5:
			details(ch);
			break;
		case 6:
			details(ch);
			break;
		case 7:
			details(ch);
			break;
		case 8:
			details(ch);
			break;
		case 9:
			details(ch);
			break;
		case 10:
			details(ch);
			break;
		case 11:
			System.out.println("Thank you for coming!");
			break;
		default :
			System.out.println("Enter a correct choice: ");
			break;
		}
	}

	public String status(int id)
	{
		if (car1.getCarId() == id)
		{
			return stat(car1);
		} else if (car2.getCarId() == id) {
			return stat(car2);
		} else if (car3.getCarId() == id) {
			return stat(car3);
		} else if (car4.getCarId() == id) {
			return stat(car4);
		} else if (car5.getCarId() == id) {
			return stat(car5);
		} else if (car6.getCarId() == id) {
			return stat(car6);
		} else if (car7.getCarId() == id) {
			return stat(car7);
		} else if (car8.getCarId() == id) {
			return stat(car8);
		} else if (car9.getCarId() == id) {
			return stat(car9);
		} else if (car10.getCarId() == id) {
			return stat(car10);
		}
		else
		{
			return "null";
		}
	}

	private String stat(CarDetails car)
	{
		return car.getStatus();
	}


	public void modify(int ch)
	{
		System.out.println();
		System.out.println("1. Change the car price ");
		System.out.println("2. Exit");
		System.out.print("Enter your choice: ");
		int choice = sc.nextInt();
		System.out.println();

		switch(choice)
		{
			case 1:
				change(ch);
				break;
			case 2:
				System.out.println("Thank you Sir!...");
				break;
			default:
				System.out.println("Enter a correct option");
		}
	}

	public void change(int ch)
	{
		int id = ch;
		if(car1.getCarId() == id)
		{
			carPrice(car1);
		}
		else if(car2.getCarId() == id)
		{
			carPrice(car2);
		}
		else if(car3.getCarId() == id)
		{
			carPrice(car3);
		}
		else if(car4.getCarId() == id)
		{
			carPrice(car4);
		}
		else if(car5.getCarId() == id)
		{
			carPrice(car5);
		}
		else if(car6.getCarId() == id)
		{
			carPrice(car6);
		}
		else if(car7.getCarId() == id)
		{
			carPrice(car7);
		}
		else if(car8.getCarId() == id)
		{
			carPrice(car8);
		}
		else if(car9.getCarId() == id)
		{
			carPrice(car9);
		}
		else if(car10.getCarId() == id)
		{
			carPrice(car10);
		}
	}

	private void carPrice(CarDetails car) {
		System.out.println("Car-Name: " + car.getCarName() + ", Car-price: " + car.getPrice());
		System.out.print("Enter the new price for the car: ");
		int change = sc.nextInt();
		System.out.println();
		car.setPrice(change);
		System.out.println("Car-Name: " + car.getCarName() + ", Car-price: " + car.getPrice());
	}

	public void revenue(int id)
	{
		if(car1.getCarId() == id)
		{
			price(car1);
		}
		else if(car2.getCarId() == id)
		{
			price(car2);
		}
		else if(car3.getCarId() == id)
		{
			price(car3);
		}
		else if(car4.getCarId() == id)
		{
			price(car4);
		}
		else if(car5.getCarId() == id)
		{
			price(car5);
		}
		else if(car6.getCarId() == id)
		{
			price(car6);
		}
		else if(car7.getCarId() == id)
		{
			price(car7);
		}
		else if(car8.getCarId() == id)
		{
			price(car8);
		}
		else if(car9.getCarId() == id)
		{
			price(car9);
		}
		else if(car10.getCarId() == id)
		{
			price(car10);
		}
	}

	private void price(CarDetails car)
	{
		int gst = 1000;
		int revenue = car.getPrice() + gst;

		System.out.println();
		System.out.println("Car Price: "+car.getPrice());
		System.out.println("GST: "+gst);
		System.out.println(("- - - - - -"));

		System.out.println("Revenue: "+revenue);
	}
}
