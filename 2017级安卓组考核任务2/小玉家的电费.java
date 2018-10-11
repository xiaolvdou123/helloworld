import java.io.*;
import java.util.*;
public class Main 
{
	public static void main(String[] args)
	{
		Scanner cin=new Scanner(System.in);
        int a=cin.nextInt();
        Double result;
        if(a<=150&&a>0)
        {
        	result=a*0.4463;
        }
        else if(a>150&&a<=400)
        {
        	result=(a-150)*0.4663+66.945;
        }
        else
        {
        	result=(a-400)*0.5663+116.575+66.945;
        }
        System.out.printf("%.1f", result);
        
	}
}