import java.util.*;
import java.io.*;
import java.math.*;

class Solution 
{
    public static void main(String args[]) 
    {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        System.err.println("N: " + n);
        ArrayList<Integer> arrPi = new ArrayList<Integer>();
        for (int i = 0; i < n; i++) 
        {
            int pi = in.nextInt();
            System.err.println("#" + i + ": " + pi);
            arrPi.add(new Integer(pi));
        }
        
        Collections.sort(arrPi);
        
        int maxDiff = Math.abs(arrPi.get(0) - arrPi.get(1));
        for (int i = 1; i < n - 1; i++)
        {
            if (Math.abs(arrPi.get(i) - arrPi.get(i+1)) < maxDiff)
                maxDiff = Math.abs(arrPi.get(i) - arrPi.get(i+1));
        }
        
        System.out.println(maxDiff);
    }
}
