import java.util.*;
import java.io.*;
import java.math.*;

class Solution 
{
    public static void main(String args[]) 
    {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt(); // Number of elements which make up the association table.
        int q = in.nextInt(); // Number Q of file names to be analyzed.
        
        HashMap<String,String> map = new HashMap<String,String>();
        
		for (int i = 0; i < n; i++) 
		{
            String ext = in.next(); 
            String mt = in.next(); 
            in.nextLine();
            map.put(ext.toLowerCase(), mt);
        }        
		
        for (int i = 0; i < q; i++) 
        {
            String fName = in.nextLine().toLowerCase(); // One file name per line.
            
            if (fName.indexOf(".") == -1) // If no extension
                System.out.println("UNKNOWN");
            else   
            {
                if (map.get(fName.substring(fName.lastIndexOf(".") + 1)) != null)
                    System.out.println(map.get(fName.substring(fName.lastIndexOf(".") + 1)));
                else 
                    System.out.println("UNKNOWN");
            }
        }
    }
}
