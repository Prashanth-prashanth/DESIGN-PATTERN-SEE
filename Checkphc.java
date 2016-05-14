 public class Checkphc extends CurAcc
 {
 public static boolean  b=true;
 public static boolean checkph()
 {
 
 for (int j=0;j<ph.length();j++)
	{
		if ((Character.isDigit(ph.charAt(j))==false))
        	{
           	b=false;
            break;
        	}  
           
	}
    return b;
}
}