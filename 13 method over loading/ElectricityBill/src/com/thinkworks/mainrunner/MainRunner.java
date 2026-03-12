package com.thinkworks.mainrunner;

import com.thinkworks.electricitybill.ElectricityBill;

public class MainRunner {
    public static void main(String[] args) {
        ElectricityBill bill = new ElectricityBill();
        bill.billDetails(1675,"Joss",574,true,7345.54D,"Bangalore");
    }
}
