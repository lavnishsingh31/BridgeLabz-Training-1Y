package com.gla.classes_objects.Constructors;

class HotelBooking {
    String guestName;
    String roomType;
    int nights;

    HotelBooking() {
        this("Guest", "Standard", 1);
    }

    HotelBooking(String guestName, String roomType, int nights) {
        this.guestName = guestName;
        this.roomType = roomType;
        this.nights = nights;
    }

    HotelBooking(HotelBooking h) {
        this.guestName = h.guestName;
        this.roomType = h.roomType;
        this.nights = h.nights;
    }

    void display() {
        System.out.println(guestName + " | " + roomType + " | " + nights);
    }

    public static void main(String[] args) {
        HotelBooking h1 = new HotelBooking();
        HotelBooking h2 = new HotelBooking("Amit", "Deluxe", 3);
        HotelBooking h3 = new HotelBooking(h2);

        h1.display();
        h2.display();
        h3.display();
    }
}
