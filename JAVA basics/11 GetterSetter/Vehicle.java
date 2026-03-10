public class Vehicle{

    private int vehicleId;
    private String brand;
    private String model;
    private String color;
    private double price;
    private int year;
    private String fuelType;
    private String transmission;
    private String owner;

    public int getVehicleId(){
        return vehicleId;
    }
    public void setVehicleId(int vehicleId){
        this.vehicleId=vehicleId;
    }
    public String getBrand(){
        return brand;
    }
    public void setBrand(String brand){
        this.brand=brand;
    }
    public String getModel(){
        return model;
    }
    public void setModel(String model){
        this.model=model;
    }
    public String getColor(){
        return color;
    }
    public void setColor(String color){
        this.color=color;
    }
    public double getPrice(){
        return price;
    }
    public void setPrice(double price){
        this.price=price;
    }
    public int getYear(){
        return year;
    }
    public void setYear(int year){
        this.year=year;
    }
    public String getFuelType(){
        return fuelType;
    }
    public void setFuelType(String fuelType){
        this.fuelType=fuelType;
    }
    public String getTransmission(){
        return transmission;
    }
    public void setTransmission(String transmission){
        this.transmission=transmission;
    }
    public String getOwner(){
        return owner;
    }
    public void setOwner(String owner){
        this.owner=owner;
    }
}