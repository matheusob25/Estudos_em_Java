package application;


import model.entities.Reservation;
import model.exceptions.DomainException;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        DateTimeFormatter sdf = DateTimeFormatter.ofPattern("dd/MM/yyyy");

        try{

            System.out.print("Room number: ");
            int roomNumber = sc.nextInt();
            System.out.print("Check-in date (dd/MM/yyyy): ");
            LocalDate checkIn = LocalDate.parse(sc.next(), sdf);
            System.out.print("Check-out date (dd/MM/yyyy): ");
            LocalDate checkOut = LocalDate.parse(sc.next(), sdf);
            System.out.println();
            Reservation rs = new Reservation(roomNumber,checkIn,checkOut);
            System.out.println(rs);
            System.out.println();
            System.out.println("Enter data to update the reservation:");
            System.out.print("Check-in date (dd/MM/yyyy): ");
            checkIn = LocalDate.parse(sc.next(), sdf);
            System.out.print("Check-out date (dd/MM/yyyy): ");
            checkOut = LocalDate.parse(sc.next(), sdf);
            rs.updateDates(checkIn, checkOut);
            System.out.println(rs);

        }
        catch (DomainException e){
            System.out.println("Error in reservation: " +  e.getMessage());

        }
        catch (RuntimeException e){
            System.out.println("Unexpected error: " + e.getMessage());
        }



        sc.close();
    }
}