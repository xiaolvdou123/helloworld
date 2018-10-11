import java.io.*;
import java.util.*;
public class Main 
{
	public static void main(String[] args)
	{
		Scanner cin=new Scanner(System.in);
        int a=cin.nextInt(),b=cin.nextInt(),c=cin.nextInt(),d=cin.nextInt();
        int m1=a*60+b;
        int m2=c*60+d;
        int dd=m2-m1;
        Double hh=Math.floor(dd/60);
        int hour=hh.intValue();
        int minute=dd%60;
        System.out.printf("%d %d",hour,minute);
	}
}