package com.thinkworks.hotelbookingsystem.external;

import com.thinkworks.hotelbookingsystem.internal.Room;

public class Guest extends Person{
    private Room[] rooms;

    public Guest() {
        System.out.println("no argument constructor");
    }

    public Room[] getRooms() { return rooms; }
    public void setRooms(Room[] rooms) { this.rooms = rooms; }

}

