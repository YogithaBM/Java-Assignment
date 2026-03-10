package com.thinkworks.hospital.runner;

import com.thinkworks.hospital.doctor.Department;
import com.thinkworks.hospital.doctor.Doctor;
import com.thinkworks.hospital.doctor.Nurse;
import com.thinkworks.hospital.patient.Appointment;
import com.thinkworks.hospital.patient.Billing;
import com.thinkworks.hospital.patient.Patient;

public class MainRunner {
    public static void main(String[] args) {
        Doctor doctor=new Doctor("Pratiksha","Gynecologist");
        System.out.println("  ");
        Nurse nurse=new Nurse("Judy",6);
        System.out.println("  ");
        Department department=new Department("Emergency",5);
        System.out.println("  ");
        Patient patient=new Patient("Yusra",118);
        System.out.println("  ");
        Appointment appointment=new Appointment("Palak","10:30");
        System.out.println("  ");
        Billing billing=new Billing("Mrudulla",34734.63D);


    }
}
