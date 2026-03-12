package com.thinkworks.electricitybill;

public class ElectricityBill {
    private int customerId;
    private String customerName;
    private int units;
    private boolean isPaid;
    private double billAmount;
    private String area;

    public void billDetails(int customerId,String customerName,int units,boolean isPaid,
                            double billAmount,String area) {
        this.area=area;
        System.out.println("Method with 6 parameters");
        billDetails(customerId,customerName,units,isPaid,billAmount);
    }

    public void billDetails(int customerId, String customerName, int units,
                     boolean isPaid, double billAmount) {
        this.billAmount=billAmount;
        System.out.println("Method with 5 parameters");
        billDetails(customerId, customerName, units, isPaid);
    }

    public void billDetails(int customerId, String customerName, int units,boolean isPaid) {
        this.isPaid=isPaid;
        System.out.println("Method with 4 parameters");
        billDetails(customerId, customerName, units);
    }

    public void billDetails(int customerId, String customerName, int units) {
        this.units=units;
        System.out.println("Method with 3 parameters");
        billDetails(customerId, customerName);
    }

    public void billDetails(int customerId, String customerName) {
        this.customerName=customerName;
        System.out.println("Method with 2 parameters");
        billDetails(customerId);
    }

    public void billDetails(int customerId) {
        this.customerId=customerId;
        System.out.println("Method with 1 parameter");
        billDetails();
    }

    public void billDetails() {
        System.out.println("Method with no parameters");
        display();
    }

    public void display() {
        System.out.println("Electricity Bill Details");
        System.out.println("Customer ID: "+customerId);
        System.out.println("Customer Name: "+customerName);
        System.out.println("Units: "+units);
        System.out.println("Bill Amount: "+billAmount);
        System.out.println("Paid: "+isPaid);
        System.out.println("Area: "+area);
    }
}