import com.engeto.hotel.*;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        Hotel hotel = new Hotel();

        Guest guest1 = new Guest("Adéla", "Malíková", "13.03.1993");
        Guest guest2 = new Guest("Ján", "Dvořáček", "05.05.1995");

        Room room1 = new Room(1, 1, 1000, true, true);
        Room room2 = new Room(2, 1, 1000, true, true);
        Room room3 = new Room(3, 2, 2400, false, true);

        List<Guest> guestsForReservation2 = new ArrayList<>(List.of(guest1, guest2));

        Reservation reservation1 = new Reservation(guest1, 1, room1, "19.07.2021", "26.07.2021", true);
        Reservation reservation2 = new Reservation(guestsForReservation2, 2, room3, "01.09.2021", "17.09.2021", true);


        hotel.addReservation(reservation1);
        hotel.addReservation(reservation2);

        hotel.getReservationInformation();
    }
}