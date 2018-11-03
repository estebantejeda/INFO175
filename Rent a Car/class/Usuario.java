public class Usuario{

    private String name;
    private String lastname;
    private String email;
    private String phone;
    private int rut;

    public Usuario(String name, String lastname, String email, String phone, int rut){
        this.name = name;
        this.lastname = lastname;
        this.email = email;
        this.phone = phone;
        this.rut = rut;
    }

    public void setName(String name){
        this.name = name;
    }
    
    public String getName(){
        return name;
    }
    
    public void setLastName(String lastname){
        this.lastname = lastname;
    }
    
    public String getLastName(){
        return lastname;
    }
    
    public void setEmail(String email){
        this.email = email;
    }
    
    public String getEmail(){
        return email;
    }
    
    public void setPhone(int phone){
        this.phone = phone;
    }
    
    public String getPhone(){
        return phone;
    }
    
    public int getRUT(){
        return rut;
    }

}
