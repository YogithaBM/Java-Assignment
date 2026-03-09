package com.hospital.patient;

public class Patient {
    public Patient(String patientName,int age) {
        checkPatient(patientName);
        checkAge(age);
    }
    private void checkPatient(String patientName) {
        System.out.println("Patient Name : "+patientName);
    }
    private void checkAge(int age) {
        System.out.println("Age : "+age);
    }

}
