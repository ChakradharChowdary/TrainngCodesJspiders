package com.constructor.ul;

import com.costructor.bl.Book;

public class StationaryShop 
{
	public static void main(String[] args)
	{
		System.out.println("main starts");
		Book b1=new Book(2,600,550);
		Book b2=new Book(3,650,560);
		Book b3=new Book(180);
		Book b4=new Book(160);
		Book b5=new Book("Rama",4,880,700);
		Book b6=new Book("Raja",5,890,750);
		Book b7=new Book("Mahi",6,900,800);
		Book b8=new Book("Oracle","Ramesh",7,980,850);
	    b1.bookInfo();
		b2.bookInfo();
		b3.bookInfo();
		b4.bookInfo();
		b5.bookInfo();
		b6.bookInfo();
		b7.bookInfo();
		b8.bookInfo();
		System.out.println("main ends");
	}
}
