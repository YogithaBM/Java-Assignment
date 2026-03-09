package com.hospital.patient;

public class Billing {
    public Billing(String patientName,double amount) {
        checkPatient(patientName);
        checkAmount(amount);
    }
    private void checkPatient(String patientName) {
        System.out.println("Billing for : "+patientName);
    }
    private void checkAmount(double amount) {
        System.out.println("Amount : "+amount);
    }


}
