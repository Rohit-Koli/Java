class Account{
    public String name;
    protected String email;
    private String password;
    //if we want to access private things in program then we use following thinngs
    //getters and setters
    //Getter
    public String getPassword(){
        return this.password;
    }
    //setter
    public void setPassword(String pass){
        this.password=pass;
    }
    public void setEmail(String string) {
    }
}
public class Access_Modifier_OOP {
    public static void main(String[] args) {
        Account ac=new Account();
        ac.name="Rohit";
        ac.email="kolirohit1252@gmail.com";
        ac.setPassword("abcd");
        System.out.println(ac.name);
        System.out.println(ac.email);        
        System.out.println(ac.getPassword());
    }
}
