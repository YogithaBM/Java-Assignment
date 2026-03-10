package com.thinkworks.hospital.doctor;

public class Department {
    public Department(String departmentName,int floor) {
        checkDepartment(departmentName);
        checkFloor(floor);
    }

    private void checkDepartment(String departmentName) {
        System.out.println("Department : "+departmentName);
    }
    private void checkFloor(int floor) {
        System.out.println("Floor Number : "+floor);
    }
}

