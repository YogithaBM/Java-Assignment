package com.thinkworks.inheritence.external;

public class Employee {
    private String empId;

    public Employee() {
        System.out.println("No args const of Emp Class");
    }

    public String getEmpId() {
        return empId;
    }

    public void setEmpId(String empId) {
        this.empId = empId;
    }


}
