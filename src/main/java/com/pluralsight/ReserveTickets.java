package com.pluralsight;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class ReserveTickets {
    public static void main(String[] args) {
        Scanner theScanner = new Scanner(System.in);
        String finalDate = getName(theScanner);
        System.out.println(finalDate);
    }
    public static String getName(Scanner myScanner) {
        System.out.println("Please Enter Your Name: ");
        String fullName = myScanner.nextLine();
        int indexofSpace = fullName.indexOf(" ");
        String fName = fullName.substring(0,indexofSpace);
        String lname = fullName.substring(  indexofSpace + 1);

        System.out.println("What Date Will You Be Attending (MM/dd/yyyy):");

        String chosenDate = myScanner.nextLine();
        DateTimeFormatter fmt = DateTimeFormatter.ofPattern("MM/dd/yyyy");
        LocalDate showDate = LocalDate.parse(chosenDate, fmt);

        System.out.println("How Many Tickets Would You Like");

        String ticketCount = "Ticket";
        int ticketNum = myScanner.nextInt();
        if (ticketNum > 1) {
        String ticketCounted = ticketCount + "s";
        return ticketNum + " " + ticketCounted + " Reserved for " + showDate + " Under " + lname + ", " + fName;
    }   else{
        return ticketNum + " " + ticketCount + " Reserved for " + showDate + " Under " + lname + ", " + fName;
    }
    }
}
