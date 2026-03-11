package com.thinkworkers.runner;

import com.thinkworkers.appconfig.AppConfig;

public class MainRunner {
    public static void main(String[] args) {

        AppConfig appConfig = new AppConfig("Swiggy", 3.5f,
                "https://www.swiggy.com/", "Swiggy Limited");
        System.out.println("App Name : " + appConfig.getAppName());
        System.out.println("Version : " + appConfig.getVersion());
        System.out.println("API Base URL : " + appConfig.getApiBaseUrl());
        System.out.println("Company Name : " + appConfig.getCompanyName());

    }
}
