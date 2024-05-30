package com.engeto.hotel;

public class Room {

    private int roomNumber;
    private int numbersOfBeds;
    private double pricePerNight;
    private boolean hasBalcony;
    private boolean hasSeaView;

    public Room(int roomNumber, int numbersOfBeds, double pricePerNight, boolean hasBalcony, boolean hasSeaView) {
        this.roomNumber = roomNumber;
        this.numbersOfBeds = numbersOfBeds;
        this.pricePerNight = pricePerNight;
        this.hasBalcony = hasBalcony;
        this.hasSeaView = hasSeaView;
    }

    public int getNumbersOfBeds() {
        return numbersOfBeds;
    }

    public double getPricePerNight() {
        return pricePerNight;
    }

    public boolean isHasBalcony() {
        return hasBalcony;
    }

    public boolean isHasSeaView() {
        return hasSeaView;
    }

    public void setRoomNumber(int roomNumber) {
        this.roomNumber = roomNumber;
    }

    public void setNumbersOfBeds(int numbersOfBeds) {
        this.numbersOfBeds = numbersOfBeds;
    }

    public void setPricePerNight(double pricePerNight) {
        this.pricePerNight = pricePerNight;
    }

    public void setHasBalcony(boolean hasBalcony) {
        this.hasBalcony = hasBalcony;
    }

    public void setHasSeaView(boolean hasSeaView) {
        this.hasSeaView = hasSeaView;
    }

    public String toString() {
        String description = "Room number: " + roomNumber
                + "\nNumbers of beds: " + numbersOfBeds
                + "\nPrice per night: " + pricePerNight + "Kč"
                + "\n";
        String notBalcony = "";
        if (!hasBalcony) {
            notBalcony += "n't";
        }
        description += "Does" + notBalcony + " have a balcony.\n";
        description += hasSeaView ? "Does" : "Doesn't" + " have a sea view.\n";
        return description;
    }

    public int getRoomNumber() {
        return roomNumber;
    }
}
