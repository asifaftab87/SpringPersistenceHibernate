package org.liferayasif.backend.util.time;

public class JavaPrac {

	public static void main(String[] args) {
		
		System.out.println("hi");
		for(int i=5;i<0;i--)
		{
			for(int j=1;j<i;j++)
			{
				System.out.println(" * ");
			}
			System.out.println(" ");
		}
		
	}
}

	
	
	
	
	















/*
*****switch case****

System.out.println("where do you want to spent ur holiday?");
System.out.println("I ill tell you the amount of money yu need to cary");
System.out.println("1. singapore 2.UAE  3.America  4.London 5.None");
System.out.println("please input respective number");

Scanner sc=new Scanner(System.in);
int n =sc.nextInt();

switch(n)
{
	case(1):
	{
		System.out.println("as you selected one i.e. Singapore you need 25k....!!! have a hapy trip");
		break;
	}
	case(2):
	{
		System.out.println("as you selected Two i.e. UAE you need 50k....!!! have a hapy trip");break;
	}
	case(3):
	{
		System.out.println("as you selected Three i.e. America  you need 70k....!!! have a hapy trip");break;
	}
	case(4):
	{
		System.out.println("as you selected Four i.e. London you need 150k....!!! have a hapy trip");break;
	}
	case(5):
	{
		System.out.println("as you selected Five i.e. None you need 10 ruppess for a chips to relax and enjoy at home....!!! enjoy ur money save it its precious");break;
	}
	default:
	{
		System.out.println(n+" : is an invaid selection.....Sorry you selected an invalid input please chck and try with option 1-5");
	}
}

*/




/****reverse a number***
	System.out.println("please input a no to reverse");
	Scanner sc=new Scanner(System.in);
	int input=sc.nextInt();
	
	int remainder=0,reverse=0;
	while(input!=0)
	{
		remainder=input%10;
		reverse=remainder+reverse*10;
		input=input/10;
	}
	
	System.out.println(""+reverse);*/
