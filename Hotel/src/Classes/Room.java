package Classes;

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


    public String toString() {

        if (hasBalcony && hasSeaView) {
            return "Room number: " + roomNumber
                    + "\nNumbers of beds: " + numbersOfBeds
                    + "\nPrice per night: " + pricePerNight
                    + "\nDoes have balcony."
                    + "\nDoes have sea view."
                    + "\n";
        } else if (!hasBalcony && !hasSeaView) {
            return "Room number: " + roomNumber
                    + "\nNumbers of beds: " + numbersOfBeds
                    + "\nPrice per night: " + pricePerNight
                    + "\nDoesn't have balcony."
                    + "\nDoesn't have sea view."
                    + "\n";
        } else if (hasBalcony) {
            return "Room number: " + roomNumber
                    + "\nNumbers of beds: " + numbersOfBeds
                    + "\nPrice per night: " + pricePerNight + "Kč"
                    + "\nDoes have balcony."
                    + "\nDoesn't have sea view."
                    + "\n";
        } else {
            return "Room number: " + roomNumber
                    + "\nNumbers of beds: " + numbersOfBeds
                    + "\nPrice per night: " + pricePerNight + "Kč"
                    + "\nDoesn't have balcony."
                    + "\nDoes have sea view."
                    + "\n";
        }
    }

}
