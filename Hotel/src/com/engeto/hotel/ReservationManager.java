package com.engeto.hotel;

import java.util.ArrayList;
import java.util.List;

public class ReservationManager {
    private List<Reservation> reservationList = new ArrayList<>();

    public void addReservation(Reservation reservation) {
        this.reservationList.add(reservation);
    }

    public void getReservation(int index) {
        this.reservationList.get(index).toString();
    }

    public void getReservations() {
        for (Reservation reservation : reservationList) {
            System.out.println(reservation);
        }
    }

    public void clearReservations() {
        this.reservationList.clear();
    }

    
}
