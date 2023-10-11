

Sahil kotekar


Q1]

import java.util.*;

class MyArithException extends Exception
{
	public MyArithException (String mess)
	{
	 super (mess);
	}
}
class Calculator
{
	 static int calDouble(int k) throws MyArithException
	{
		 if(k==0)
		 {
			 throw new MyArithException("Zero Not Allwed");
		 }
		 if(k<0) 
		 {
			 throw new MyArithException("nigative not allowed");
		 }
		 
		return k+k;
	}
}
public class MyCalcApp
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("enter a number");
		int a=sc.nextInt();
		try
		{
			int k=Calculator.calDouble(a);
			System.out.println(k);
		}
		catch(MyArithException m)
		{
			System.out.println(m);
		}
	
		System.out.println("Done");
	}
}



Q2]

package dev;

public class NumberNotDivisibleBySevenException extends Exception
{
	public NumberNotDivisibleBySevenException(String mess)
	{
		super(mess);
	}
}


//Client Side

package client;

import dev.NumberNotDivisibleBySevenException;

public class MyMath 
{
	public static void disp(int num) throws NumberNotDivisibleBySevenException
	{
			if(num%7!=0)
			{
				throw new NumberNotDivisibleBySevenException("num is not divisible by 7");
			}
			System.out.println(num);
	}
}

import java.util.Scanner;

public class Demo {

	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("enter a number");
		int a=sc.nextInt();
	
		try
		{
			MyMath.disp(a);		
		}
		catch(NumberNotDivisibleBySevenException m)
		{
			System.out.println(m);
		}
		System.out.println(num/7);
	}

}


Q3]
import java.util.Scanner;

class MyException extends Exception
{
	public MyException(String mess)
	{
		super(mess);
	}
}
public class Demo
{
	public void show1(int k) 
	{
		try 
		{
		show2(k);
		}
		catch(MyException m)
		{
			System.out.println(m);
		}
		
	}
	public void show2(int k) throws MyException
	{
		show3(k);
	}
	public void show3(int k) throws MyException
	{
		if(k>10)
		{
			throw new MyException("no is gretter than 10");
		}
		else
			System.out.println(k);
	}
public static void main(String[] args) 
	{
	Scanner sc=new Scanner(System.in);
	System.out.println("enter a number");
	int a=sc.nextInt();
		Demo d=new Demo();
		d.show1(a);
	}
}


Q4]


//Developer side
package ddd;


public class InvalidLengthException extends Exception
{
   public InvalidLengthException(String Mess)
   {
	   super(Mess);
   }
}

//Client Side
package client;

import java.util.Scanner;
import java.util.stream.IntStream;

import ddd.InvalidLengthException;

public class Authenticator 
{
	private String Password;
	public Authenticator(String Password) throws InvalidLengthException
	{
		if(Password.length()<5||Password.length()>9)
		{
			throw new InvalidLengthException("Invalide Password");
		}
		this.Password=Password;
	}
	static void Done()
	{
		System.out.println("successful authentication");
	}
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("enter Password");
		String Pass=sc.next();
		
		try
		{
			Authenticator A1=new Authenticator(Pass);
			Done();
		}
		catch(InvalidLengthException m)
		{
			System.out.println(m);
		}
	}
}

	


Q5]

import java.util.Scanner;

class ResourceNotAllocatedException extends Exception
{
	public ResourceNotAllocatedException(String Mess)
	{
		super (Mess);
	}
}
class MyResource implements AutoCloseable
{
	public MyResource(int capacity) throws ResourceNotAllocatedException
	{
		if(capacity>100)
		{
			throw new ResourceNotAllocatedException("not sufficient space");
		}
	}
    public void disp()
    {
    	System.out.println("successful");
    }
	@Override
	public void close()  {
		System.out.println("resource is closed");
		
	}
}
public class Demo 
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("File size");
		int cap=sc.nextInt();
		try
		{
		MyResource M1=new MyResource(cap);
		M1.disp();
		M1.close();
		}
		catch(ResourceNotAllocatedException m)
		{
			System.out.println(m);
		}
	}
}
 
