package org.launchcode;
import java.util.Scanner;
public class MilesPerGallon {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Please enter the miles you have driven:");
        Double miles = input.nextDouble();

        System.out.println("Please enter the amount of gas you have consumed:");
        Double gas = input.nextDouble();

        Double milePerGas = miles / gas ;
        System.out.println("You are running on " + milePerGas +"mpg.");

    }
}
