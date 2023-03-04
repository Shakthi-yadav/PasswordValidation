package Login;
import java.util.regex.Pattern;
import java.util.Scanner;
import java.util.regex.Matcher;

public class Regex 
		{
			public static void main(String[] args)
			{
				System.out.println("enter the password \n "
						+ "passwd should consist of atlest... \n "
						+ "1 -  spl char[@,#,%,&....] \n "
						+ "1 -  Upper and Lower char [A-Z,a-z] \n "
						+ "1 -  Digits [0-9] \n "
						+ "min of 8 and max 10 char");
				
				mainpasswd.passwd(); // calling password method
				
				
			}

		}


	class mainpasswd     // password method
	 {   //class varible declaration
		static String pass= null;
		static int count=0;
		static final String r="^(?=.*\\d)(?=\\S+$)(?=.*[@#$%^&+=])(?=.*[a-z])(?=.*[A-Z]).{8,10}$"; //password expression(condition)
		private static final Pattern P = Pattern.compile(r);
		  
		public static void passwd() {
			Scanner obj=new Scanner(System.in);
			 pass=obj.next();  								//user input
			   
			 if (P.matcher(pass).matches()) 
			 {
			      System.out.print("\n");
			      
			      System.out.println("Confirm password");
					confirmation1.passconfirm();              //password confirmation
			     
			 }
			  else 
			  {
			       count++;
			       if(count>=3)
			         {
			           System.out.println("Number of attempts exceded");
				   System.exit(0);
			          }
					    	 
			      System.out.print("The Password is invalid \n");
			      wrong.wrongpasswd();                                  //calling wrong password method

			  }
			    
		}
	}
	
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
			System.out.println("\n \n Number of attempts exceded... TRY AGAIN LATER");
		}
	}
	
	class  confirmation1
	{static int count=0;
	public static  void passconfirm() {
		Scanner on= new Scanner(System.in);
			String NP = on.next(); //new confirm password
			String Op=mainpasswd.pass; // Orginal password
			//int count=0;
			if(Op.equals(NP))
			{
				System.out.println(" \n Password created sucessfully");
			}
			else wrongpassword();
			
	}
			public static void wrongpassword(){
				System.out.println("passwords does'nt match \n Re-Enter the passwd");
				
				count++;
				if(count>=3) 
				{
					timeout.sleep();
				}
				confirmation1.passconfirm();
	
			}
	}

	
