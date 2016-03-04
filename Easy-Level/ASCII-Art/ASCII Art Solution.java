import java.util.*;
import java.io.*;
import java.math.*;

class Solution 
{
    public static void main(String args[]) 
    {
        Scanner in = new Scanner(System.in);
        int L = in.nextInt();               // Length
        int H = in.nextInt();               // Height
        in.nextLine();
        String T = in.nextLine();           // Text to convert
        
        String[] arr = new String[H];       // ASCII text A-Z
        String[] arrT = new String[H];      // Copies of T in each row of array
        String[] answerArr = new String[H]; // Array for final answer
        char[] arrCharT = T.toCharArray();  // T converted to individual characters
        
        System.err.println("Length: " + L);
        System.err.println("Height: " + H);
        System.err.println("Text:   " + T);
        System.err.println("Length of chars: " + arrCharT.length);
        
        for (int i = 0; i < H; i++) 
        {
            String ROW = in.nextLine();
            arr[i] = ROW;
            arrT[i] = T;
            answerArr[i] = "";
        }
        
        for (int z = 0; z < H; z++)
        {
            System.err.println(arrT[z]);
            for (int i = 0; i < arrCharT.length; i++) 
            {
                if ( ((int) arrCharT[i]) > 122 || ((int) arrCharT[i]) < 65 )
                {
                    answerArr[z] += arr[z].substring((26*L));
                    if (T.length() == 1)
                        arrT[z] = "";
                    else
                    {
                        System.err.println("Before cut: " + arrT[z]);
                        arrT[z] = arrT[z].substring(1);
                        System.err.println("After cut: " + arrT[z]);
                    }
                }
                else
                {
                    for (int x = 65; x < 123; x++)
                    {
                        if ( ((int) arrCharT[i]) == x )
                        {
                            if ( ((int) arrCharT[i]) < 91 )
                            {
                                answerArr[z] += arr[z].substring( ((((int) arrCharT[i]) - 65)*L), ((((int) arrCharT[i]) - 64)*L) );
                                if (T.length() == 1)
                                    arrT[z] = "";
                                else
                                    arrT[z] = arrT[z].substring(1);
                            }
                            
                            else if ( ((int) arrCharT[i]) < 123 )
                            {
                                System.err.println("LOWERCASE " + arrT[z].substring(0, 1) + ", " + arrT[z]);
                                answerArr[z] += arr[z].substring( ((((int) arrCharT[i]) - 97)*L), ((((int) arrCharT[i]) - 96)*L) );
                                if (T.length() == 1)
                                    arrT[z] = "";
                                else
                                    arrT[z] = arrT[z].substring(1);
                            }
                        }                    
                    }
                }
            }
        }
        
        for (int i = 0; i < H; i++) 
        {
            System.out.println(answerArr[i]);
        }
    }
}
