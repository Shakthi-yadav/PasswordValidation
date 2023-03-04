package movie;

import java.util.*;
import java.util.regex.Pattern;



class wrong
{
	public static void wrongpasswd()
	{
System.out.println("Re-enter valid passwd \n");
mainpasswd.passwd();
	}
}

class timeout
{
	public static void sleep()
	{
		System.out.println("Number of attempts exceded... TRY AGAIN LATER");
	}
}
class mainpasswd
{static String pass= null;
	static int count=0;
	static final String r="^(?=.*\\d)(?=\\S+$)(?=.*[@#$%^&+=])(?=.*[a-z])(?=.*[A-Z]).{4,10}$";
	  private static final Pattern P = Pattern.compile(r);
	public static void passwd() {
		Scanner one=new Scanner(System.in);
		 pass=one.next();
		    if (P.matcher(pass).matches()) {
		      System.out.print("\n");
		     
		    }
		    else {
		    	count++;
	    	 if(count>=3)
	      {
	    	  System.out.println("Number of attempts exceded");
	    	  System.exit(0);
	      }
		      System.out.print("The Password is invalid \n");
		      wrong.wrongpasswd();
		      count++;
		      if(count>=3)
		      {
		    	  timeout.sleep();
		      }
		    }
		    
		  }
	
}
class  confirmation1
{
public static  void passconfirm() {
	Scanner on= new Scanner(System.in);
		String NP = on.next();
		String Op=mainpasswd.pass;
		if(Op.equals(NP))
		{
			System.out.println("Password created sucessfully");
		}
		else 
		{
			System.out.println("passwords does'nt match \n Re-Enter the passwd");
			confirmation1.passconfirm();
		}
}}

 class password
{
	public static void main(String[] args)
	{
		System.out.println("enter the password \n passwd should consist of atlest... \n 1 -  spl char[@,#,%,&....] \n 1 -  Upper and Lower char [A-Z,a-z] \n 1 -  Digits [0-9] \n min of 8 and max 10 char");
		mainpasswd.passwd();
		System.out.println("Confirm password");
		confirmation1.passconfirm();
		
	}
}