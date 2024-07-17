package model.entities;

import model.exceptions.DomainException;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;

public class Reservation {
    private Integer roomNumber;
    private LocalDate checkin;
    private LocalDate checkout;
    DateTimeFormatter  sdf = DateTimeFormatter.ofPattern("dd/MM/yyyy");
    public Reservation(){

    }
    public Reservation(Integer roomNumber, LocalDate checkin, LocalDate checkout){
        if(!checkout.isAfter(checkin)){
            throw new DomainException("Check-out date must be after check-in date");
        }
        this.roomNumber = roomNumber;
        this.checkin = checkin;
        this.checkout = checkout;
    }

    public Integer getRoomNumber() {
        return roomNumber;
    }

    public void setRoomNumber(Integer roomNumber) {
        this.roomNumber = roomNumber;
    }

    public LocalDate getCheckin() {
        return checkin;
    }

    public LocalDate getCheckout() {
        return checkout;
    }

    public long duration(){
        long diff = ChronoUnit.DAYS.between(checkin, checkout);
        return diff;
    }
    public void updateDates(LocalDate checkin, LocalDate checkout){
        if (checkin.isBefore(LocalDate.now()) || checkout.isBefore(LocalDate.now())){
         throw new DomainException("Reservation dates for update must be future dates");
        }
        if (checkout.isBefore(checkin)){
         throw new DomainException("Check-out date must be after check-in date");
        }
        this.checkin = checkin;
        this.checkout = checkout;
    }


    @Override
    public String toString() {
        return "Reservation: " +
                "Room " + roomNumber +
                ", check-in: " + checkin.format(sdf) +
                ", check-out: " + checkout.format(sdf) +
                ", " + duration() + " nights";
    }
}
