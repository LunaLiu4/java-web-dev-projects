package studios.areaofacircle;

import java.util.Scanner;

public class Area {
    static Object userInput;
    static Object classofInput;

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double radius;
        System.out.println("Enter a radius: ");
        boolean result = input.hasNextDouble();
        if (!result){
            System.out.println("Invalid enter!");
        }
        else{
            radius = input.nextDouble();
            if ( radius > 0){
                double area = Circle.getArea(radius);
                System.out.println("The area of a circle of radius " + radius + " is: "+ area);
            }
            else {
                System.out.println("Invalid enter!");
            }
        }
        input.close();
       }
    }

