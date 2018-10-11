import java.io.*;
import java.util.*;
public class Main 
{
	public static void main(String[] args)
	{
		Scanner cin=new Scanner(System.in);
        int a,b,sum;
        int max=0;
        int day=0;
        for(int i=1;i<=7;i++)
        {
        	a=cin.nextInt();
        	b=cin.nextInt();
        	sum=a+b;
        	if(sum>max)
        	{
        		max=sum;
        		day=i;
        	}
        }
        System.out.println(day);
	}
}