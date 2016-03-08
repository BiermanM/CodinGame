import java.util.*;
import java.io.*;
import java.math.*;

class Player 
{
    public static void main(String args[]) 
    {
        Scanner in = new Scanner(System.in);
        int[] arr = new int[8];

        while (true) 
        {
            int spaceX = in.nextInt();
            int spaceY = in.nextInt();
            for (int i = 0; i < 8; i++) 
            {
                int mountainH = in.nextInt(); // represents the height of one mountain, from 9 to 0. Mountain heights are provided from left to right.
                arr[i] = mountainH;
            }

            int highest = 0;
            for (int i = 0; i < 8; i++)
            {
                if (arr[i] > arr[highest])
                    highest = i;
            }
            
            System.err.println("Highest: " + highest);

            if (spaceX == highest)
                System.out.println("FIRE");
            else
                System.out.println("HOLD"); // either:  FIRE (ship is firing its phase cannons) or HOLD (ship is not firing).
        }
    }
}
