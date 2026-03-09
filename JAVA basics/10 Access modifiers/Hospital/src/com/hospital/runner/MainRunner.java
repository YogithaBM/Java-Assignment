package com.hospital.runner;

import com.hospital.doctor.Department;
import com.hospital.doctor.Doctor;
import com.hospital.doctor.Nurse;
import com.hospital.patient.Appointment;
import com.hospital.patient.Billing;
import com.hospital.patient.Patient;

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
