import java.util.*;
import java.io.*;
import java.math.*;

class Player 
{
    public static void main(String args[]) 
    {
        Scanner in = new Scanner(System.in);
        int road = in.nextInt(); // the length of the road before the gap.
        int gap = in.nextInt(); // the length of the gap.
        int platform = in.nextInt(); // the length of the landing platform.
        
        while (true) 
        {
            int speed = in.nextInt(); // the motorbike's speed.
            int coordX = in.nextInt(); // the position on the road of the motorbike.
            
            if (coordX == (road - 1))
                System.out.println("JUMP");
            else if (coordX > (road - 1))
                System.out.println("SLOW");
            else if (speed == (gap + 1))
                System.out.println("WAIT");
            else if (speed > (gap + 1))
                System.out.println("SLOW");
            else
                System.out.println("SPEED");
        }
    }
}
