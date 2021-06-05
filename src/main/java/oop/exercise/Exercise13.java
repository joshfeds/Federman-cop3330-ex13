package oop.exercise;
import java.text.NumberFormat;
import java.util.Scanner;
import java.util.Locale;

/*
 *  UCF COP3330 Summer 2021 Assignment 1 Solution
 *  Copyright 2021 Joshua Federman
 */
public class Exercise13
{
    static Scanner input = new Scanner(System.in);
    public static String getPrin(){
        System.out.print("Enter the principal: ");
        return input.nextLine();
    }
    public static String getROI(){
        System.out.print("Enter the rate of interest: ");
        return input.nextLine();
    }
    public static String getYears(){
        System.out.print("Enter the number of years: ");
        return input.nextLine();
    }
    public static void doMath(String p, String r, String t){
        float principal = Float.parseFloat(p);
        float roi = Float.parseFloat(r) / 100;
        float years = Float.parseFloat(t);
        float simpIntr = principal * (1 + roi * years);

        Locale convert = new Locale("en", "US");
        NumberFormat printDollar = NumberFormat.getCurrencyInstance(convert);
        System.out.print("After " + t + " years at " + r + "%, the investment will be worth "
                + printDollar.format(simpIntr));
    }
    public static void main( String[] args ) {
        String principal = getPrin();
        String roi = getROI();
        String years = getYears();
        doMath(principal, roi, years);
    }
}
