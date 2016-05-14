
	
	public class Checkulc extends CurAcc
	
	{
	public static boolean b=true;
	public static boolean checkul()
	{   
	    for (int j=0;j<ul.length();j++)
		{
			if ((Character.isDigit(ul.charAt(j))==false))
	        	{
	           	b=false;
	            break;
	        	}  
	    }       
	    return b;
	}

		   
	}
	


