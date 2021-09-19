/*
 *  UCF COP3330 Fall 2021 Assignment 2 Solution
 *  Copyright 2021 Jorge Paez
 *
 * Pseudocode:
 * A program that will calculate blood alcohol ratio for both male and female.
 * Both will factor in the time since the last drink, weight, and the amount of alcohol consumed.
 * It will also output if it legal to drive. 
 */

package exercise17;
import java.util.*;

public class solution17 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in); //userInput
        int alcohol, weight, hours, gender;
        float ratio;
        double bloodAlc;

        System.out.print("Enter 1 if you're a male, enter 2 if you're a female. \n");
        gender = sc.nextInt(); //gender choice

        //several questions to calculate blood alcohol level
        System.out.print("How many ounces of alcohol have you consumed? ");
        alcohol = sc.nextInt();

        System.out.print("What's your weight in pounds? ");
        weight = sc.nextInt();

        System.out.print("How long has it been since you last drank? ");
        hours = sc.nextInt();

        if (gender == 1) { //male
            ratio = (float) 0.73;
        } else { //female
            ratio = (float) 0.66;
        }
        bloodAlc = (alcohol * 5.14 / weight * ratio) - (0.015 * hours); //calculate blood alcohol level

        System.out.println("Your Blood Alcohol: " + bloodAlc);
        if (bloodAlc < 0.08) { //first condition
            System.out.println("It's legal fo you to drive! ");
        } else { //second condition
            System.out.println("It's illegal for you to drive! ");
        }
    }
}
