package com.thinkworks.inheritence.runner;

import com.thinkworks.inheritence.internal.Developer;
import com.thinkworks.inheritence.internal.Manager;
import com.thinkworks.inheritence.internal.Tester;

public class MainRunner {
    public static void main(String[] args) {
        Developer developer = new Developer();
        developer.setEmpId("843");
        System.out.println("Developer ID: " + developer.getEmpId());

        Tester tester = new Tester();
        tester.setEmpId("7634");
        System.out.println("Tester ID: " + tester.getEmpId());

        Manager manager = new Manager();
        manager.setEmpId("9863");
        System.out.println("Manager ID: " + manager.getEmpId());

    }

}
