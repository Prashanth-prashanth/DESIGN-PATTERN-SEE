import java.util.*;
import java.io.*;
import java.text.*;
import java.io.Console;
public class Admin1 implements Admin,Customer{
	
	private static Admin1 instance;
	private Admin1()
	{

	}

	public static synchronized Admin1 getInstance()
	{
		if (instance == null)
			instance = new Admin1();

		return instance;
	}
	Date date = new Date(); int balance;
	Console con;Console cnsl = null; public static String ps=null;int MIN=100;
	BufferedWriter writer=null;int phn=0;
	String d1=null;String d2=null;String d3=null;public static String fnm=null;String n=null;String s1=null;
	String s2=null;String nmch2=null;public static String ph=null; static String ul;
	String addr=null;String nm;

@Override
	public void CreateAccount()
{

	cnsl = System.console();
	Scanner in=new Scanner(System.in);  
 //con=System.console();
	 
    System.out.println("Enter your full name.");
    nm=in.nextLine();
    
    System.out.println("Enter your desired Username or LogIn ID as your account entry credential..");
    System.out.println("Note: You can enter only numbers if are choosing LogIn ID.");
    ul=in.nextLine();
    fnm=ul;
   
    
    System.out.println(" account created, Your LogIn ID is stored as " + ul);
      
}

@Override
public void DeleteAccount()
{
     
    try{
    	//con=System.console();
    
        Scanner sn6=new Scanner(System.in);
            
            char chr;
    		System.out.println("Enter User name /Log In ID of your Current account.");
            String s5=sn6.nextLine();
            fnm=s5+"Cur";
            //System.out.println("Enter password.");
    
          //char []  pass=cnsl.readPassword("Password : ");
          //  ps=new String(pass); 
    		File f5 = new File("home/pesit/"+fnm+".txt");	
    		if((f5.exists())&&(CheckPassc.checkpass().equals(ps)))
           {
                System.out.println("Current Account Found.. Are you sure to delete your account"); 
                System.out.println("Confirm deletions by pressing Y/N (Y- yes ; N- no)"); 
                chr= sn6.next().charAt(0);
                System.out.println(chr); 
                if((chr=='Y')||(chr=='y'))
                {
            
                    System.out.println(f5.delete());
                    
                      
                   /*  else
                    {
                        System.out.println("Delete operation failed. Enter credentials correctly");
                    } */
                }
                else if((chr=='N')||(chr=='n'))
                {
                    System.out.println("Account not deleted!");
                }
                
                else
                System.out.println("Enter correct character");
            
           // }
            //else 
            //System.out.println("No account found to delete ");    
            
            System.out.println(" ");
            System.out.println("What else do you want to do");
    }
    
    }
    
        catch(Exception e)
        {
    		
    		e.printStackTrace();
    		
    	}
}

	

@Override
public void changePassword() {
	// TODO Auto-generated method stub
	
}
@Override
public void listUsers() {
	// TODO Auto-generated method stub
	
}
@Override
public void DepositMoney() {
	
	{ 
			//con=System.console();
		    
		    Scanner sn1=new Scanner(System.in);
		System.out.println("Enter User name /Log In ID of your Current account.");
		s1=sn1.nextLine();
		fnm=s1+"Cur";
		//System.out.println("Enter password.");
		//if (cnsl != null) {
		    //char [] pass=cnsl.readPassword(" ");
		   // ps=new String(pass); }
		//System.out.println(fnm+".txt");
		//File f1=new File("home/pesit/"+fnm+".txt");
		//if((f1.exists())&&(CheckPassc.checkpass().equals(ps)))
		//{
		    System.out.println("Current Account Found.. "); 
		    

		// PrintWriter pw1 = new PrintWriter(new BufferedWriter(new FileWriter("home/pesit/"+fnm+".txt", true)));
		 // d2= date.toString();
		    System.out.println("Enter amount to be deposited.");
		    int balance=0;
		    int dep=sn1.nextInt();
		   // if((dep>0)&&(GetBalc.getbalc()==-1))
		    //balance=dep;
		    //else if(dep>0)
		   // balance= GetBalc.getbalc()+dep;  
		   // else
		     //System.out.println("Enter Amount Correctly."); 
		 
		   // if(dep>0)
		   // {
		  //  pw1.println("Amount deposited is : "+dep+". Balance is : "+balance+" , on "+d2); 
		    
		     // pw.newLine();
		    System.out.println("Money added successfully!!");
		    System.out.println("Balance is "+dep);
		    
		    //}
		    //pw1.close();
		//}
		//else 
		   // System.out.println("Incorrect User name or password.");

		System.out.println(" ");
		
		

		    System.out.println("What else do you want to do?");
		}

	
	// TODO Auto-generated method stub
	
}
@Override
public void WithdrawMoney() {
	// TODO Auto-generated method stub
	
		    
		    Scanner sn2=new Scanner(System.in);
		System.out.println("Enter User name /Log In ID of your Current account.");
		s2=sn2.nextLine();
		fnm=s2+"Cur";
		//System.out.println("Enter password.");
		    
		   // char [] pass=cnsl.readPassword("Password : ");
		  //  ps=new String(pass); 
		//File f2=new File("home/pesit/"+fnm+".txt");
		//System.out.println(fnm+".txt"); 
		//if((f2.exists())&&(CheckPassc.checkpass().equals(ps)))
		
		    System.out.println("Current Account Found.. Enter amount to withdraw"); 
		    
		    
		   // PrintWriter pw2 = new PrintWriter(new BufferedWriter(new FileWriter("home/pesit/"+fnm+".txt", true)));
		   System.out.println("Enter amount to be withdrawn");
		   // d3=date.toString();
		    int with=sn2.nextInt();int balance=0;
		   // if((with<GetBalc.getbalc())&&(with>0))
		   // {   balance=GetBalc.getbalc()-with;
		   //     pw2.println("Amount withdrawn is : "+with+". Balance is : "+balance+" , on "+d3);
		         // writer.newLine();
		        System.out.println("Money withdrawn successfully");
		       
		       // pw2.close();
		  
		
		//else
		//System.out.println("Incorrect User name or password.");

		System.out.println(" ");
		    System.out.println("What else do you want to do?");

		}
		    
	

		 
		 

	
	

@Override
public void ShowBalance() 
	// TODO Auto-generated method stub

{ //cnsl=System.console();
    
  Scanner sn3=new Scanner(System.in);
    System.out.println("Enter User name /Log In ID of your Current account.");
    String s3=sn3.nextLine();
    fnm=s3+"Cur";
    //System.out.println("Enter password.");
    //if(cnsl!=null) 
    //char [] pass=cnsl.readPassword("Password : ");
    //ps=new String(pass); 
  //  File f3=new File("home/pesit/"+fnm+".txt");
   //if((f3.exists())&&(CheckPassc.checkpass().equals(ps)))
    
    System.out.println("Current Account found.."); 
    
       //System.out.println("Balance is "+GetBalc.getbalc());
   // balance=GetBalc.getbalc();   
    //System.out.println("Incorrect User name."); 

System.out.println(" ");
    System.out.println("What else do you want to do?");
}



@Override
public void ChangePassword() {
	// TODO Auto-generated method stub
	
}
@Override
public void notifyUser() {
	if(balance<100){
		System.out.println("your balance is low");
		
	}
	
	
	
	
	// TODO Auto-generated method stub
	
}





}



	

	