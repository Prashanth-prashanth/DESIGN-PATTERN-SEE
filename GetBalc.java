import java.util.*;
import java.io.*;

public class GetBalc extends CurAcc
{
public static int getbalc()
{   String[] strarr=null;int a=0;
    ArrayList<String> al1 = new ArrayList<String>();
    try
    {
        BufferedReader finp = new BufferedReader(new FileReader("H:/"+fnm+".txt"));
        String str ;
        while((str=finp.readLine())!=null)
	             
        {
            strarr = str.split(" ") ;
            
        }
    
    for(int i=0;i<strarr.length;i++)
        al1.add(strarr[i]);
    
    int ind=al1.indexOf("Balance");
    if(ind!=-1)
    {
    
    String s=al1.get(ind+3);
    
    a=Integer.parseInt(s);
    //System.out.println(a);
    }
    }
    catch (IOException e)
{
    System.out.println(e);   
}
return a;
 
}
    
    
    
    
    
        
}
