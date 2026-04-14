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
        if (!fullName.isEmpty()) {
            System.out.println("What Date Will You Be Attending (MM/dd/yyyy):");
        }
        String chosenDate = myScanner.nextLine();
        DateTimeFormatter fmt = DateTimeFormatter.ofPattern("MM/dd/yyyy");
        LocalDate showDate = LocalDate.parse(chosenDate, fmt);
        System.out.println(showDate + " Are You Sure? : Yes(1), No(2)");
        int confirm = myScanner.nextInt();

        if (confirm == 1) {
            System.out.println("How Many Tickets Would You Like");
        }else {
            System.out.println("Pick Another Date: ");
            int secondChoice = myScanner.nextInt();
        }
        String ticketCount = "Ticket";
        int ticketNum = myScanner.nextInt();
        if (ticketNum > 1) {
        String ticketCounted = ticketCount + "s";
        return ticketNum + " " + ticketCounted + " Reserved for " + showDate + " Under " + fullName;
    }   else{
        return ticketNum + " " + ticketCount + " Reserved for " + showDate + " Under " + fullName;
    }
    }
}
