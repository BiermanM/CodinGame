import java.util.*;
import java.io.*;
import java.math.*;

class Solution 
{
    public static void main(String args[]) 
    {
        Scanner in = new Scanner(System.in);
        String lon = in.next();
        lon = lon.substring(0, lon.indexOf(",")) + "." + lon.substring(lon.indexOf(",") + 1);
        String lat = in.next();
        lat = lat.substring(0, lat.indexOf(",")) + "." + lat.substring(lat.indexOf(",") + 1);
        int n = in.nextInt();
        in.nextLine();
        
        double lonRad = Math.toRadians(Double.parseDouble(lon));
        double latRad = Math.toRadians(Double.parseDouble(lat));
        
        System.err.println("Longitude: " + lon);
        System.err.println("Latitude: " + lat);
        System.err.println("N: " + n);
        
        String[][] arrDefib = new String[n][7];
        
        for (int i = 0; i < n; i++)
        {
            String defib = in.nextLine();
            System.err.println(defib);
            
            arrDefib[i][0] = defib.substring(0, defib.indexOf(";"));  // num ID
            defib = defib.substring(defib.indexOf(";") + 1);
            arrDefib[i][1] = defib.substring(0, defib.indexOf(";")); // name
            defib = defib.substring(defib.indexOf(";") + 1);
            arrDefib[i][2] = defib.substring(0, defib.indexOf(";")); // address
            defib = defib.substring(defib.indexOf(";") + 1);
            arrDefib[i][3] = defib.substring(0, defib.indexOf(";")); // contact phone number
            defib = defib.substring(defib.indexOf(";") + 1);
            arrDefib[i][4] = defib.substring(0, defib.indexOf(";")); // lon
            arrDefib[i][4] = arrDefib[i][4].substring(0, arrDefib[i][4].indexOf(",")) + "." + arrDefib[i][4].substring(arrDefib[i][4].indexOf(",") + 1);
            defib = defib.substring(defib.indexOf(";") + 1);
            arrDefib[i][5] = defib; // lat
            arrDefib[i][5] = arrDefib[i][5].substring(0, arrDefib[i][5].indexOf(",")) + "." + arrDefib[i][5].substring(arrDefib[i][5].indexOf(",") + 1);
            
            double lonDefib = Math.toRadians(Double.parseDouble(arrDefib[i][4]));
            double latDefib = Math.toRadians(Double.parseDouble(arrDefib[i][5]));
            
            double x = ( (lonRad - lonDefib) * (Math.cos( (latRad + latDefib) / 2 ) ) );
            double y = ( latRad - latDefib );
            
            arrDefib[i][6] = ( Math.sqrt( Math.pow(x,2) + Math.pow(y,2) ) * 6371 ) + ""; // dist
            
        }
        
        int max = 0;
        for (int i = 0; i < n; i++)
        {
            if (Double.parseDouble(arrDefib[i][6]) < Double.parseDouble(arrDefib[max][6]))
                max = i;
        }
        
        System.out.println(arrDefib[max][1]);
    }
}
