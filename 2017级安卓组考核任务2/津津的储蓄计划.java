import java.io.*;
import java.util.*;
public class Main 
{
	public static void main(String[] args)
	{
		Scanner cin=new Scanner(System.in);
		int sum=300;
		int money_use=0;
		int money_self=0;
		int money_cun=0;
		int flag=0;
        for(int i=1;i<=12;i++)
        {
        	money_use=cin.nextInt();
        	money_self+=sum-money_use;
        	if(money_self<0&&flag==0)
        	{
        		flag=-i;
        	}
        	if(money_self>=100)
        	{
        		money_cun+=money_self-money_self%100;
        		money_self=money_self%100;
        	}
        }
        if(flag==0)
        {
        	Double money_sum=money_self+money_cun*1.2;
        	System.out.println(money_sum.intValue());
        }
        else
        {
        	System.out.println(flag);
        }
	}
}