import java.util.*;
import java.io.*;
import java.math.*;

/**
 * Auto-generated code below aims at helping you parse
 * the standard input according to the problem statement.
 * ---
 * Hint: You can use the debug stream to print initialTX and initialTY, if Thor seems not follow your orders.
 **/
class Player 
{
    public static void main(String args[]) 
    {
        Scanner in = new Scanner(System.in);
        int lightX = in.nextInt(); // the X position of the light of power
        int lightY = in.nextInt(); // the Y position of the light of power
        int initialTX = in.nextInt(); // Thor's starting X position
        int initialTY = in.nextInt(); // Thor's starting Y position
        
         // game loop
        while (true) 
        {
            int remainingTurns = in.nextInt(); // The level of Thor's remaining energy, representing the number of moves he can still make.
            String direction = "";
            
        	if (initialTY < lightY) 
        	{
                initialTY++;
                direction = "S";
        	}
        	
        	else if (initialTY > lightY) 
        	{
                initialTY--;
                direction = "N";
            } 
            
            if (initialTX < lightX) 
            {
                initialTX++;
                direction += "E";
            }
            
            else if (initialTX > lightX) 
            {
                initialTX--;
                direction += "W";
            }
            
            System.out.println(direction);
        }
    }
}
