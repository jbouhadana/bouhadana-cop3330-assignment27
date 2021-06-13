/*
 *  UCF COP3330 Summer 2021 Assignment 27 Solution
 *  Copyright 2021 Jeremy Bouhadana
 */
package com.company;
import java.util.Scanner;

public class Main {
    public static boolean numberCheck(String numb1) {
        try {
            Integer.parseInt(numb1);
        } catch(NumberFormatException e) {
            return false;
        }
        return true;
    }

    public static String checkFirstName(String firstName) {
        if(firstName.length() >= 2)
            return null;
        if(firstName.length() == 0) {
            return "The first name must be filled in.\n";
        }
        return firstName + " is not valid.\n";
    }

    public static String checkLastName(String lastName) {
        if(lastName.length() >= 2)
            return null;
        if(lastName.length() == 0) {
            return "The last name must be filled in.\n";
        }
        return lastName + " is not valid.\n";
    }

    public static String checkZIP(String zCode) {
        if(numberCheck(zCode))
            return null;
        return "The ZIP code must be a 5 digit number.\n";
    }

    public static String checkID(String employeeID) {
        if(employeeID.matches("^[A-Z]{2}-[0-9]{4}$"))
            return null;
        return employeeID + " is not valid\n";
    }

    public static String validateInput(String firstName, String lastName, String zCode, String employeeID) {
        String inputError = "";
        String sonkFirstName = checkFirstName(lastName);
        String LastNameVerification = checkLastName(lastName);
        String ZIPverification = checkZIP(zCode);
        String sonkEmployeeID = checkID(employeeID);
        if(sonkFirstName != null)
            inputError += checkFirstName(firstName);
        if(LastNameVerification != null)
            inputError += checkLastName(lastName);
        if(ZIPverification != null)
            inputError += checkZIP(zCode);
        if(sonkEmployeeID != null)
            inputError += checkID(employeeID);
        if(inputError == "")
            inputError += "There were no errors found.\n";
        return inputError;
    }

    public static void main(String[] args) {


    }
}
