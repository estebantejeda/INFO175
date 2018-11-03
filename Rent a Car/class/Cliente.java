public class Cliente extends Usuario{

    private String adress;
    private boolean rent;

    public Cliente(String name, String lastname, String email, String phone, int rut, String adress, boolean rent){
        super(name, lastname, email, phone, rut);
        this.adress = adress;
        this.rent = rent;
    }

    public void setAdress(String adress){
        this.adress = adress;
    }
    
    public String getAdress(){
        return adress;
    }
    
    public void setRent(Boolean rent){
        this.rent = rent;
    }
    
    public Boolean getRent(){
        return rent;
    }

}
