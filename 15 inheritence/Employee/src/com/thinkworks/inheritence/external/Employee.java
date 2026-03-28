package com.thinkworks.inheritence.external;

public class Employee {
    private String empId;
    private String empName;

    public Employee() {
        System.out.println("No args const of Emp Class");
    }

    public String getEmpName() {
        return empName;
    }

    public void setEmpName(String empName) {
        this.empName = empName;
    }

    public String getEmpId() {
        return empId;
    }

    public void setEmpId(String empId) {
        this.empId = empId;
    }


}
