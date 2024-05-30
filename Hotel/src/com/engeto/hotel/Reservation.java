package com.engeto.hotel;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;

public class Reservation {

    private Room room;
    private int reservationNumber;
    private LocalDate dateFrom;
    private LocalDate dateTo;
    private boolean isWorkingStay;
    private  Guest guest;
    private List<Guest> guests = new ArrayList<>();

    private static final DateTimeFormatter FORMATTER = DateTimeFormatter.ofPattern("dd.MM.yyyy");

    public Reservation (List<Guest> guests, int reservationNumber, Room room, String dateFrom, String dateTo, boolean isWorkingStay) {
        this.guests = guests;
        this.reservationNumber = reservationNumber;
        this.room = room;
        this.dateFrom = parseDate(dateFrom);
        this.dateTo = parseDate(dateTo);
        this.isWorkingStay = isWorkingStay;
    }

    public Reservation (Guest guest, int reservationNumber, Room room, String dateFrom, String dateTo, boolean isWorkingStay) {
        this.guest = guest;
        this.reservationNumber = reservationNumber;
        this.room = room;
        this.dateFrom = parseDate(dateFrom);
        this.dateTo = parseDate(dateTo);
        this.isWorkingStay = isWorkingStay;
    }


    public void addGuest(Guest guest) {
        this.guests.add(guest);
    }

    private LocalDate parseDate(String date) {
        return LocalDate.parse(date, FORMATTER);
    }



    @Override
    public String toString() {
        String formattedDateFrom = dateFrom.format(FORMATTER);
        String formattedDateTo = dateTo.format(FORMATTER);
        StringBuilder guestList = new StringBuilder();

        if (guests.isEmpty()) {
            guestList.append(guest.getName()).append(" ").append(guest.getSurname()).append("\n");
        } else {
            for (Guest guest : guests) {
                guestList.append(guest.getName()).append(" ").append(guest.getSurname()).append("\n");
            }
        }

        String stayType = isWorkingStay ? "It's working stay." : "It's vacation stay.";

        return String.format("Reservation number: %s%nRoom: %s%nDate from: %s%nDate to: %s%n%s%nGuests:%n%s",
                reservationNumber,
                this.room.getRoomNumber(),
                formattedDateFrom,
                formattedDateTo,
                stayType,
                guestList);
    }

}
