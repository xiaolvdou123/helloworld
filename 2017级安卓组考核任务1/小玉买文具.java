import java.io.*;
import java.util.*;
public class Main 
{
	public static void main(String[] args)
	{
		Scanner cin=new Scanner(System.in);
        int a = cin.nextInt()*10;
        int b;
        if(cin.hasNext())	b = cin.nextInt();
        else	b=0;
        int c=a+b;
        Double r=new Double(Math.floor(c/19));
        int result=r.intValue();
        System.out.println(result);
	}
}