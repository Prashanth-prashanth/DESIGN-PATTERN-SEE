import java.util.*;
import java.io.*;
import java.text.*;

class CurAcc 
{
Date date = new Date();
Console con=null;char[] pass=null;public static String ps=null;
 

BufferedWriter writer=null;int phn=0;
String d1=null;String d2=null;String d3=null;public static String fnm=null;String n=null;String s1=null;
String s2=null;String nmch2=null;public static String ph=null;public static String ul=null;
String addr=null;String nm=null;


void CreateAccount()
{
try
{ Scanner in=new Scanner(System.in);  
 con=System.console();
    

    System.out.println("Enter your full name.");
    nm=in.nextLine();
    
    System.out.println("Enter your desired Username or LogIn ID as your account entry credential..");
    System.out.println("Note: You can enter only numbers if are choosing LogIn ID.");
    ul=in.nextLine();
    
    fnm=ul+"Cur";
    System.out.println("Enter password of your choice.(without spaces)");
    
    pass=con.readPassword("Password : ");
    ps=new String(pass); 
    
    File f=new File("H:/"+fnm+".txt");
    if((f.exists())&&(CheckPassc.checkpass()==ps))
    {
        System.out.println("Current Account already exists.");
        
    }
    else
    {
    f.createNewFile();
    
        if(Checkulc.checkul()==true)
            System.out.println("Your LogIn ID is stored as "+ul);
        else 
            System.out.println("Your Username is stored as "+ul);
    d1= date.toString();
    System.out.println("Enter your Phone number.");
 
      
    ph=in.nextLine();
 
     
    /* if(Checkphc.checkph()==true)
     {
      break;
     }
     else
     {
     continue;
     }     
   }while(Checkphc.checkph()!=true); */
    
    while((Checkphc.checkph()==true)&&(ph.length()!=10))
   {
     System.out.println("Enter all 10 digits of your phone number. "); 
     
     ph=in.nextLine();
        
   } 
 //till here 
    

System.out.println("Enter your address.");
    addr=in.nextLine();
    
  
             
        
    writer = new BufferedWriter( new FileWriter("H:/"+fnm+".txt"));
    
    writer.write("Name : "+nm);
    writer.newLine();
    writer.write("Phone number : "+ph);
    writer.newLine();
    writer.write("Address : "+addr);
    writer.newLine();
    
    if(Checkulc.checkul()==true)
         writer.write("LogIn ID : "+ul);   
        else 
            writer.write("Username : "+ul);
    writer.newLine();  
    writer.write("Password : "+ps);
    writer.newLine();  
    
        
    
    writer.close();
    System.out.println("Account created successfully on "+d1);
    System.out.println(" ");
    System.out.println("What else do you want to do?");
    
    }
}

catch (IOException e)
{
    System.out.println(e);   
} 
   
    
    
}

void DepositMoney()
{ 
try
{con=System.console();
    
    Scanner sn1=new Scanner(System.in);
System.out.println("Enter User name /Log In ID of your Current account.");
s1=sn1.nextLine();
fnm=s1+"Cur";
System.out.println("Enter password.");
    
    pass=con.readPassword(" ");
    ps=new String(pass); 
//System.out.println(fnm+".txt");
File f1=new File("H:/"+fnm+".txt");
if((f1.exists())&&(CheckPassc.checkpass().equals(ps)))
{
    System.out.println("Current Account Found.. "); 
    

 PrintWriter pw1 = new PrintWriter(new BufferedWriter(new FileWriter("H:/"+fnm+".txt", true)));
  d2= date.toString();
    System.out.println("Enter amount to be deposited.");
    int balance=0;
    int dep=sn1.nextInt();
    if((dep>0)&&(GetBalc.getbalc()==-1))
    balance=dep;
    else if(dep>0)
    balance= GetBalc.getbalc()+dep;  
    else
     System.out.println("Enter Amount Correctly."); 
 
    if(dep>0)
    {
    pw1.println("Amount deposited is : "+dep+". Balance is : "+balance+" , on "+d2); 
    
     // pw.newLine();
    System.out.println("Money added successfully!!");
    System.out.println("Balance is "+balance);
    }
    pw1.close();
}
else 
    System.out.println("Incorrect User name or password.");

System.out.println(" ");
    System.out.println("What else do you want to do?");
}

catch (IOException e)
{
    System.out.println(e);   
}       
    


}  

void WithdrawMoney()
{
try{con=System.console();
    
    Scanner sn2=new Scanner(System.in);
System.out.println("Enter User name /Log In ID of your Current account.");
s2=sn2.nextLine();
fnm=s2+"Cur";
//System.out.println("Enter password.");
    
    pass=con.readPassword("Password : ");
    ps=new String(pass); 
File f2=new File("H:/"+fnm+".txt");
System.out.println(fnm+".txt"); 
if((f2.exists())&&(CheckPassc.checkpass().equals(ps)))
{
    System.out.println("Current Account Found.. Enter amount to withdraw"); 
    
    
    PrintWriter pw2 = new PrintWriter(new BufferedWriter(new FileWriter("H:/"+fnm+".txt", true)));
    System.out.println("Enter amount to be withdrawn");
    d3=date.toString();
    int with=sn2.nextInt();int balance=0;
    if((with<GetBalc.getbalc())&&(with>0))
    {   balance=GetBalc.getbalc()-with;
        pw2.println("Amount withdrawn is : "+with+". Balance is : "+balance+" , on "+d3);
         // writer.newLine();
        System.out.println("Money withdrawn successfully");
        System.out.println("Balance is "+balance);
        pw2.close();
    }
    else
    System.out.println("Insufficient balance");

    
}
else
System.out.println("Incorrect User name or password.");

System.out.println(" ");
    System.out.println("What else do you want to do?");

}
    
catch (IOException e)
{
    System.out.println(e);   
}

 }    

 
    
void ShowBalance()
{
    
    try
{ con=System.console();
    
  Scanner sn3=new Scanner(System.in);
    System.out.println("Enter User name /Log In ID of your Current account.");
    String s3=sn3.nextLine();
    fnm=s3+"Cur";
    //System.out.println("Enter password.");
    
    pass=con.readPassword("Password : ");
    ps=new String(pass); 
    File f3=new File("H:/"+fnm+".txt");
    if((f3.exists())&&(CheckPassc.checkpass().equals(ps)))
     {
    System.out.println("Current Account found.."); 
    
    System.out.println("Balance is "+GetBalc.getbalc());
     }
     else
    System.out.println("Incorrect User name or password."); 

System.out.println(" ");
    System.out.println("What else do you want to do?");
}

catch (Exception e)
{
    System.out.println(e);   
}




}

void ShowTransactionDetails()
{  
    
try
{String st=null; 
con=System.console();
     
 Scanner sn4=new Scanner(System.in);
    System.out.println("Enter User name /Log In ID of your Current account.");
    String s4=sn4.nextLine();
    fnm=s4+"Cur";
    //System.out.println("Enter password.");
    
    pass=con.readPassword("Password : ");
    ps=new String(pass); 
    File f4=new File("H:/"+fnm+".txt");
    if((f4.exists())&&(CheckPassc.checkpass().equals(ps)))
    {
    System.out.println("Current Account Found.. "); 
    
    
    BufferedReader br = new BufferedReader(new FileReader("H:/"+fnm+".txt"));
    System.out.println("Transaction details will be shown...");   
    String line = null;
    st=br.readLine();
    System.out.println(st);
    br.readLine();
    br.readLine();
    br.readLine();
    br.readLine();
    
    
    while ((line = br.readLine()) != null)
    {
        System.out.println(line);
    }   
    }
else 
    System.out.println("Account not found to show transactions");

System.out.println(" ");
    System.out.println("What else do you want to do?");

}

catch (IOException e)
{
    System.out.println(e);   
}    
}


void ChangeAddress()
{
   try
   
   
{ con=System.console();
     
 ArrayList<String> al=new ArrayList<String>();
    Scanner sn5=new Scanner(System.in);
    String l=null; String rep=null;String l1=null;String l2=null;String l3=null;String l4=null;
    String l5=null;String l6=null;String l7=null;String repf=null;    
    System.out.println("Enter User name /Log In ID of your Current account.");
    String s6=sn5.nextLine();
    fnm=s6+"Cur";
    //System.out.println("Enter password.");
    
    pass=con.readPassword("Password : ");
    ps=new String(pass); 
    File f6=new File("H:/"+fnm+".txt");
    if((f6.exists())&&(CheckPassc.checkpass().equals(ps)))
    {
        System.out.println("Current Account Found.. ");
        BufferedReader br1 = new BufferedReader(new FileReader("H:/"+fnm+".txt"));
        l1=br1.readLine();
        l4=l1;
        l2=br1.readLine();
        l5=l2;
        l3=br1.readLine();
        l6=l3;
        System.out.println("Your present "+l3);
        
        System.out.println("Enter new address.");
        rep=sn5.nextLine();
        repf="Address : "+rep;
        while ((l7 = br1.readLine()) != null)
        {
            al.add(l7);
        } 
        br1.close();        
        /* System.out.println(l4);
        System.out.println(l5);
        System.out.println(l6);
        System.out.println(al); */
        
        //br1.read();
        //File f7 = new File("H:/"+fnm+".txt");
        f6.delete();
    }
       
        
         File f8=new File("H:/"+fnm+".txt");
   /*  if(f8.exists())
    {
        System.out.println("Failed to change address");    
    }
    else */
    
        f8.createNewFile();
        BufferedWriter w = new BufferedWriter( new FileWriter("H:/"+fnm+".txt"));
       // w.newLine();
        w.write(l4);
        w.newLine();
        w.write(l5);
        w.newLine();
        w.write(repf);
        w.newLine();
        for(int i=0;i<al.size();i++)
        {    
            w.write(al.get(i));
            w.newLine();
        }            
        System.out.println("Address changed successfully!!");
        w.close();
       
        
  
    
System.out.println(" ");
    System.out.println("What else do you want to do");

}
catch (IOException e)
{
    System.out.println(e);   
}    

}






void DeleteAccount()
{
     
    try{con=System.console();
    
        Scanner sn6=new Scanner(System.in);
            
            char chr;
    		System.out.println("Enter User name /Log In ID of your Current account.");
            String s5=sn6.nextLine();
            fnm=s5+"Cur";
            //System.out.println("Enter password.");
    
            pass=con.readPassword("Password : ");
            ps=new String(pass); 
    		File f5 = new File("H:/"+fnm+".txt");	
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
            
            }
            else 
            System.out.println("No account found to delete ");    
            
            System.out.println(" ");
            System.out.println("What else do you want to do");
    }
    
    
    
        catch(Exception e)
        {
    		
    		e.printStackTrace();
    		
    	}
}

}   
    
    
    
         
    
    
    