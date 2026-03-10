package com.thinkworks.hospital.doctor;

public class Nurse {
    public Nurse(String nurseName,int experience) {
        checkNurse(nurseName);
        checkExperience(experience);
    }
    private void checkNurse(String nurseName) {
        System.out.println("Nurse Name : "+nurseName);
    }
    private void checkExperience(int experience) {
        System.out.println("Experience : "+experience);
    }

}
