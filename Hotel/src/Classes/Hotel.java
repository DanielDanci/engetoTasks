package Classes;

import java.util.ArrayList;
import java.util.List;

public class Hotel {

    private List<Guest> guestList = new ArrayList<>();
    private List<Room> roomList = new ArrayList<>();
    private List<Reservation> reservationList = new ArrayList<>();


    public void addGuest(String name, String surname, String birthDate) {
        //  birthDate must be in format "dd.mm.yyyy"
        Guest guest = new Guest(name, surname, birthDate);
        this.guestList.add(guest);
    }

    public List<Guest> getGuestList() {
        return guestList;
    }

    public void addReservation(Reservation reservation) {
        this.reservationList.add(reservation);
    }

    public void addRoom (int roomNumber, int numbersOfBeds, double pricePerNight, boolean hasBalcony, boolean hasSeaView) {
        Room room = new Room(roomNumber, numbersOfBeds, pricePerNight, hasBalcony, hasSeaView);
        this.roomList.add(room);
    }

    public void addGuestToReservation(int reservationNumber, Guest guest) {
        for (Reservation reservation : reservationList) {
            if (reservation.getReservationNumber() == reservationNumber) {
                reservation.addGuest(guest);
                break;
            }
        }
    }


    public void getReservationInformation() {
        for (Reservation reservation : reservationList) {
            System.out.println(reservation);
        }
    }



}
