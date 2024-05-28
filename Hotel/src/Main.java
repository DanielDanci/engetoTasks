import Classes.*;

public class Main {
    public static void main(String[] args) {

        Hotel hotel = new Hotel();

        hotel.addGuest("Adéla", "Malíková", "13.03.1993");
        hotel.addGuest("Ján", "Dvořáček", "05.05.1995");

        hotel.addRoom(1, 1, 1000, true, true);
        hotel.addRoom(2, 1, 1000, true, true);
        hotel.addRoom(3, 2, 2400, false, true);

        Reservation reservation1 = new Reservation(1, 1, "19.07.2021", "26.07.2021", true);
        Reservation reservation2 = new Reservation(2, 3, "01.09.2021", "17.09.2021", true);

        hotel.addReservation(reservation1);
        hotel.addReservation(reservation2);

        hotel.addGuestToReservation(1, hotel.getGuestList().get(0));
        hotel.addGuestToReservation(2, hotel.getGuestList().get(0));
        hotel.addGuestToReservation(2, hotel.getGuestList().get(1));

        hotel.getReservationInformation();
    }
}