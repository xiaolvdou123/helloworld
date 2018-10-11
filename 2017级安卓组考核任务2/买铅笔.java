import java.io.*;
import java.util.*;
public class Main 
{
	public static void main(String[] args)
	{
		Scanner cin=new Scanner(System.in);
		int n=cin.nextInt();
		int num1=cin.nextInt(),price1=cin.nextInt();
		int num2=cin.nextInt(),price2=cin.nextInt();
		int num3=cin.nextInt(),price3=cin.nextInt();
		int count=0;
		int money=0;
		while(true)
		{
			count++;
			money+=price1;
			if(count*num1>=n)	break;
		}
		int min=money;
		money=0;
		count=0;
		while(true)
		{
			count++;
			money+=price2;
			if(count*num2>=n)	break;
		}
		if(money<min)	min=money;
		money=0;
		count=0;
		while(true)
		{
			count++;
			money+=price3;
			if(count*num3>=n)	break;
		}
		if(money<min)	min=money;
		System.out.println(min);
		
	}
}
