public class Vendedor extends Usuario{

    private String user;
    private String pass;

    public Cliente(String name, String lastname, String email, String phone, int rut, String user, String pass){
        super(name, lastname, email, phone, rut);
        this.user = user;
        this.pass = pass;
    }

    public String getUser(){
        return user;
    }
    
    public void setPass(String pass){
        this.pass = pass;
    }
    
    public String getPass(){
        return pass;
    }

}
