package com.thinkworks.hotelbookingsystem.internal;

public class Room {
    private int roomId;
    private RoomType roomType;
    private double price;

    public Room() {
        System.out.println("Room created");
    }

    public int getRoomId() {
        return roomId;
    }

    public void setRoomId(int roomId) {
        this.roomId = roomId;
    }

    public RoomType getRoomType() {
        return roomType;
    }

    public void setRoomType(RoomType roomType) {
        this.roomType = roomType;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

}



