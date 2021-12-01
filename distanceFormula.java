/******************************************************
 * 
 * Jackson Barker
 * 
 * Calculates the base, height, and area of a triangle,
 * as well as distance when given 2 co-ordinate pairs.
 * 
 * firstPair, secondPair
 * Hold co-ordinate pairs as srings.
 * 
 * x1, y1, x2, y2
 * Hold split co-ordinates as integers.
 * 
 * base, height, are, distance
 * Hold result of math equations used in final output.
 * 
 * firstPairScnr, secondPairScnr
 * Holds string co-ordinate pair to be split.
 * 
 * scnr
 * Program input.
 * 
*******************************************************/

import java.util.Scanner;
import java.math.*;

class distanceFormula {
    public static void main(String[] args) {
        String firstPair;
        int x1;
        int y1;
        String secondPair;
        int x2;
        int y2;
        int base;
        int height;
        double area;
        double distance;
        Scanner scnr = new Scanner(System.in);

        //Input first co-ordinate pair and convert to integers (7.1)
        System.out.println("Input your first ordered pair in the form (x,y)");
        firstPair = scnr.nextLine();
        firstPair = firstPair.replace("(", "");
        firstPair = firstPair.replace(")", "");
        firstPair = firstPair.replace(",", " ");
        Scanner firstPairScnr = new Scanner(firstPair);
        x1 = firstPairScnr.nextInt();
        y1 = firstPairScnr.nextInt();

        //Input second co-ordinate pair and convert to integers (7.2)
        System.out.println("Input your second ordered pair in the form (x,y)\n");
        secondPair = scnr.nextLine();
        secondPair = secondPair.replace("(", "");
        secondPair = secondPair.replace(")", "");
        secondPair = secondPair.replace(",", " ");
        Scanner secondPairScnr = new Scanner(secondPair);
        x2 = secondPairScnr.nextInt();
        y2 = secondPairScnr.nextInt();


        //Triangle base, height, and area calculation and output (7.3)
        base = Math.abs(x1 - x2);
        height = Math.abs(y1 - y2);
        area = (double)base * height / 2;
        System.out.println("The triangle created by (" + x1 + "," + y1 + ") and (" + x2 + "," + y2 + ") has:");
        System.out.println("1) a base of " + base + " units");
        System.out.println("2) a height of " + height + " units");
        System.out.printf("3) an area of %.2f square units%n", area);
        
        //Co-ordinate pair distance calculation and output (7.4)
        distance = Math.sqrt(Math.pow(x2 - x1, 2) + Math.pow(y2 - y1, 2));
        System.out.print("The distance between the points (" + x1 + "," + y1 + ") to (" + x2 + "," + y2);
        System.out.printf(") is %.1f.%n", distance);
    }
}
