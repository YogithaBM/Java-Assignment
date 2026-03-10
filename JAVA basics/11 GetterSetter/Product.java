public class Product {

    private int productId;
    private String productName;
    private String brand;
    private double price;
    private int quantity;
    private String category;
    private String supplier;
    private double rating;
    private String description;

    public int getProductId(){
        return productId;
    }
    public void setProductId(int productId){
        this.productId=productId;
    }
    public String getProductName(){
        return productName;
    }
    public void setProductName(String productName){
        this.productName=productName;
    }
    public String getBrand(){
        return brand;
    }
    public void setBrand(String brand){
        this.brand=brand;
    }
    public double getPrice(){
        return price;
    }
    public void setPrice(double price){
        this.price=price;
    }
    public int getQuantity(){
        return quantity;
    }

    public void setQuantity(int quantity){
        this.quantity=quantity;
    }

    public String getCategory(){
        return category;
    }
    public void setCategory(String category){
        this.category=category;
    }
    public String getSupplier(){
        return supplier;
    }
    public void setSupplier(String supplier){
        this.supplier=supplier;
    }
    public double getRating(){
        return rating;
    }

    public void setRating(double rating){
        this.rating=rating;
    }

    public String getDescription(){
        return description;
    }

    public void setDescription(String description){
        this.description=description;
    }
}