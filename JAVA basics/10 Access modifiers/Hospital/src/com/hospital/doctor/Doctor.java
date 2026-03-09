package com.hospital.doctor;

public class Doctor {
        public Doctor(String name,String specialization) {
            checkDoctor(name);
            checkSpecialization(specialization);
        }
        private void checkDoctor(String name) {
            System.out.println("Doctor Name : "+name);
        }
        private void checkSpecialization(String specialization) {
            System.out.println("Specialization : "+specialization);
        }

}
