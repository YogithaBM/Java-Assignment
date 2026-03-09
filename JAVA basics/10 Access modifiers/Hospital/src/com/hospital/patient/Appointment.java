package com.hospital.patient;

public class Appointment {
    public Appointment(String doctorName,String time) {
        checkDoctor(doctorName);
        checkTime(time);
    }
    private void checkDoctor(String doctorName) {
        System.out.println("Doctor Assigned : "+doctorName);
    }

    private void checkTime(String time) {
        System.out.println("Appointment Time : "+time);
    }
}
