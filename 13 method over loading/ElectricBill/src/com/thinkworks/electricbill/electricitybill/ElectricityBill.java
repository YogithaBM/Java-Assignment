package com.thinkworks.electricbill.electricitybill;

public class ElectricityBill {

    public void billDetails(int customerId,String customerName,int units,boolean isPaid,
                            double billAmount,String area) {
        System.out.println("Method with 6 parameters");
        System.out.println("Electricity Bill Details");
        System.out.println("Customer ID: "+customerId);
        System.out.println("Customer Name: "+customerName);
        System.out.println("Units: "+units);
        System.out.println("Bill Amount: "+billAmount);
        System.out.println("Paid: "+isPaid);
        System.out.println("Area: "+area);
    }

    public void billDetails(int customerId, String customerName, int units,
                     boolean isPaid, double billAmount) {
        System.out.println("Method with 5 parameters");
        System.out.println("Electricity Bill Details");
        System.out.println("Customer ID: "+customerId);
        System.out.println("Customer Name: "+customerName);
        System.out.println("Units: "+units);
        System.out.println("Bill Amount: "+billAmount);
        System.out.println("Paid: "+isPaid);
    }

    public void billDetails(int customerId, String customerName, int units,boolean isPaid) {
        System.out.println("Method with 4 parameters");
        System.out.println("Electricity Bill Details");
        System.out.println("Customer ID: "+customerId);
        System.out.println("Customer Name: "+customerName);
        System.out.println("Units: "+units);
        System.out.println("Paid: "+isPaid);
    }

    public void billDetails(int customerId, String customerName, int units) {
        System.out.println("Method with 3 parameters");
        billDetails(customerId, customerName);
        System.out.println("Electricity Bill Details");
        System.out.println("Customer ID: "+customerId);
        System.out.println("Customer Name: "+customerName);
        System.out.println("Units: "+units);
    }

    public void billDetails(int customerId, String customerName) {
        System.out.println("Method with 2 parameters");
        billDetails(customerId);
        System.out.println("Electricity Bill Details");
        System.out.println("Customer ID: "+customerId);
        System.out.println("Customer Name: "+customerName);
    }

    public void billDetails(int customerId) {
        System.out.println("Method with 1 parameter");
        System.out.println("Electricity Bill Details");
        System.out.println("Customer ID: "+customerId);
    }

    public void billDetails() {
        System.out.println("Method with no parameters");
    }
}