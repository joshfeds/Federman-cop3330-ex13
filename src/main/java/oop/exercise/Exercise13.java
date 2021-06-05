package oop.exercise;
import java.text.NumberFormat;
import java.util.Scanner;
import java.util.Locale;
import java.lang.Math;
/*
 *  UCF COP3330 Summer 2021 Assignment 1 Solution
 *  Copyright 2021 Joshua Federman
 */

/*What is the principal amount? 1500
What is the rate? 4.3
What is the number of years? 6
What is the number of times the interest is compounded per year? 4
$1500 invested at 4.3% for 6 years compounded 4 times per year is $1938.84.*/
public class Exercise13
{
    static Scanner input = new Scanner(System.in);
    public static String getPrin(){
        System.out.print("What is the principal amount? ");
        return input.nextLine();
    }
    public static String getROI(){
        System.out.print("What is the rate? ");
        return input.nextLine();
    }
    public static String getYears(){
        System.out.print("What is the number of years? ");
        return input.nextLine();
    }
    public static String getCompound(){
        System.out.print("What is the number of times the interest is compounded per year? ");
        return input.nextLine();
    }
    public static void doMath(String p, String r, String t, String n){
        float principal = Float.parseFloat(p);
        float roi = Float.parseFloat(r) / 100;
        float years = Float.parseFloat(t);
        float compound = Float.parseFloat(n);
        double compIntr = principal * Math.pow(1 + roi/compound, compound * years);
        //$1500 invested at 4.3% for 6 years compounded 4 times per year is $1938.84.
        Locale convert = new Locale("en", "US");
        NumberFormat printDollar = NumberFormat.getCurrencyInstance(convert);
        System.out.print(p + " invested at " + r +"% for " + t + " years compounded "
                            + n + " times per year is " + printDollar.format(compIntr));
    }
    public static void main( String[] args ) {
        String principal = getPrin();
        String roi = getROI();
        String years = getYears();
        String compound = getCompound();
        doMath(principal, roi, years, compound);
    }
}
