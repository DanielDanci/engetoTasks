package Classes;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;

public class Reservation {
    private int reservationNumber;
    private int roomNumber;
    private LocalDate dateFrom;
    private LocalDate dateTo;
    private boolean isWorkingStay;
    private List<Guest> guests;

    private static final DateTimeFormatter FORMATTER = DateTimeFormatter.ofPattern("dd.MM.yyyy");

    public Reservation (int reservationNumber, int roomNumber, String dateFrom, String dateTo, boolean isWorkingStay) {
        this.reservationNumber = reservationNumber;
        this.roomNumber = roomNumber;
        this.dateFrom = parseDate(dateFrom);
        this.dateTo = parseDate(dateTo);
        this.isWorkingStay = isWorkingStay;
        this.guests = new ArrayList<>();
    }



    public int getReservationNumber() {
        return reservationNumber;
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
        for (Guest guest : guests) {
            guestList.append(guest.getName()).append(" ").append(guest.getSurname()).append("\n");
        }

        if (isWorkingStay) {
            return "Reservation number: " + reservationNumber
                    + "\nRoom number: " + roomNumber
                    + "\nDate from: " + formattedDateFrom
                    + "\nDate to: " + formattedDateTo
                    + "\nIt's working stay."
                    + "\nGuests:\n" + guestList.toString();
        } else {
            return "Reservation number: " + reservationNumber
                    + "\nRoom number: " + roomNumber
                    + "\nDate from: " + dateFrom
                    + "\nDate to: " + dateTo
                    + "\nIt vacation stay."
                    + "\nGuests:\n" + guestList.toString();
        }
    }

}
