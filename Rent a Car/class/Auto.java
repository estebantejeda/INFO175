public class Auto{

    private String brand;
    private String model;
    private String type;
    private String patent;
    private int seating;
    private int stock;
    private int cost;

    public Auto(String brand, String model, String type, String patent, int seating, int stock, int cost){
        this.brand = brand;
        this.model = model;
        this.type = type;
        this.patent = patent;
        this.seating = seating;
        this.stock = stock;
        this.cost = cost;
    }

    public String getBrand(){
        return brand;
    }
    
    public String getModel(){
        return model;
    }
    
    public String getType(){
        return type;
    }
    
    public String getPatent(){
        return patent;
    }
    
    public int getSeating(){
        return seating;
    }
    
    public void setStock(){
        this.stock = stock;
    }
    
    public int getStock(){
        return stock;
    }
    
    public void setCost(int cost){
        this.cost = cost;
    }
    
    public int getCost(){
        return cost;
    }

}
