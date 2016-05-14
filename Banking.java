
import java.util.*;
import java.io.*;
import java.text.*;
class Banking
{
public static void main(String[] args)
{
int ch1=0;int ch=0; int ch4=0;
Scanner in=new Scanner(System.in);
Admin1 c = Admin1.getInstance();
do
{   
System.out.println("who are you.....   1.Admin  2.User  3.Exit");
ch=in.nextInt();

if(ch==1)
{
    do
    {System.out.println(" ");
    System.out.println("1. add an  account");
    System.out.println("2. change password");   
    System.out.println("3. list users");
    //System.out.println("4. Show balance of your SB Account");
   // System.out.println("5. Show older transactions of your SB Account");
    //System.out.println("6. Change address of your SB Account");
    System.out.println("7. Delete  existing  Account");
    System.out.println("8. Back");
    
    
 
    ch1=in.nextInt(); 
    switch(ch1)
{
case 1: c.CreateAccount();
        break;
         
case 2: c.DepositMoney();
        break;
         
case 3: c.WithdrawMoney();
        break;  
         
case 4: c.ShowBalance();
        break;   
case 7: c.DeleteAccount();
        break;

case 8: break;        
         
default:  System.out.println("Enter correctly .. ");
         
}

/* catch(Exception e)
{
System.out.println("Enter only numbers ");  
break;  
}
 */
}while(ch1<8);
}




else if (ch==2)
{
   do
   { System.out.println(" "); 
    //System.out.println("1. Create an Current account");
    System.out.println("2. Deposit money into your Current Account");   
    System.out.println("3. Withdraw money from your Current Account");
    System.out.println("4. Show balance of your Current Account");
    //System.out.println("5. Show older transactions of your Current Account");
    //System.out.println("6. Change address of your Current Account");
    //System.out.println("7. Delete your existing Current Account");
    System.out.println("8. Back");
    //ch1=in.nextInt();
 
 
    ch1=in.nextInt(); 
    switch(ch1)
{

case 1: c.CreateAccount();
        break;

case 2: c.DepositMoney();
        break;
                 
case 3: c.WithdrawMoney();
        break;  

case 4: c.ShowBalance();
        break;   

case 7: c.DeleteAccount();
        break;
        
case 8: break;        

default:  System.out.println("Enter correctly .. ");
        

} 

/* catch(Exception e)
{
   System.out.println("Enter only numbers .. ");
    break;
} */

}while(ch1<8);
}

else if(ch==3)
{   
 System.out.println("Bye Bye ");
 break;
}    

else
{
 System.out.println("Enter properly ");
 break;
} 

}while((ch==1)||(ch==2));

 
}
}

	




   