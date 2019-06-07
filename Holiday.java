import java.io.*;
import java.util.*;
public class Holiday
{
   public static void main(String args[])
   {
	Scanner input=new Scanner(System.in);
	String str=input.nextLine();
	if((str.equalsIgnoreCase("saturday"))||str.equalsIgnoreCase("sunday"))
	{
		System.out.println("yes");
	}
	else
	{
		System.out.println("no");
	}
    }
}
