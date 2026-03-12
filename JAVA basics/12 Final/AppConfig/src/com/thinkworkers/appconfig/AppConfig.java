package com.thinkworkers.appconfig;

public class AppConfig {
    private final String appName;
    private final float version;
    private final String apiBaseUrl;
    private final String companyName;
    public AppConfig(String appName,float version,String apiBaseUrl,String companyName){
        this.appName=appName;
        this.version=version;
        this.apiBaseUrl=apiBaseUrl;
        this.companyName=companyName;
    }
    public String getAppName(){
        return appName;
    }
    public float getVersion(){
       return version;
    }
    public String getApiBaseUrl(){
        return apiBaseUrl;
    }
    public String getCompanyName(){
        return companyName;
    }
}
