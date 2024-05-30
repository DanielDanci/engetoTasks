package com.engeto.hotel;

import java.util.ArrayList;
import java.util.List;

public class Hotel {

    private List<Guest> guestList = new ArrayList<>();
    private List<Room> roomList = new ArrayList<>();
    private List<Reservation> reservationList = new ArrayList<>();

    public List<Guest> getGuestList() {
        return guestList;
    }

    public void addReservation(Reservation reservation) {
        this.reservationList.add(reservation);
    }

    public void addRoom (Room room) {
        this.roomList.add(room);
    }

    public Room getRoom(int roomNumber) {
        for (Room room : roomList) {
            if (room.getRoomNumber() == roomNumber) {
                return room;
            }
        }
        return null;
    }



    public void getReservationInformation() {
        for (Reservation reservation : reservationList) {
            System.out.println(reservation);
        }
    }



}
