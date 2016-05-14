import java.util.*;
import java.io.*;

public class CheckPassc extends CurAcc
{
public static boolean  b1=true; public static String[] strarr=null;
public static String checkpass()
{
    //ArrayList<String> al2 = new ArrayList<String>();
    
    try
    {
        BufferedReader finp = new BufferedReader(new FileReader("H:/"+fnm+".txt"));
        String str ;
       finp.readLine();
       finp.readLine();
       finp.readLine();
       finp.readLine();
       //finp.readLine();
       
       
       str=finp.readLine();
      // System.out.println(al2);
       strarr = str.split(" ") ;
       finp.close();
       
       
       
    }
    
     catch (IOException e)
{
    System.out.println(e);   
}
return strarr[2];    
}
       
	             
        
            
            
        
       
    
    
    
    
} 
 
