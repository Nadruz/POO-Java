package POO_Java.Heranca_Polimorfismo.src;

public final class Manager extends Employee{
    public Manager(String code, String name, String adress, int age, double salary) {
        super(code, name, adress, age, salary);
    }

    public Manager() {
        
    }

    private String login;
    private String password;
    private double commission;


    public String getLogin() {
        return login;
    }
    public void setLogin(String login) {
        this.login = login;
    } 

    public String getPassword() {
        return password;
    }
    public void setPassword(String password) {
        this.password = password;
    } 
    public double getCommission() {
        return commission;
    }
    public void setCommission(double commission) {
        this.commission = commission;
    } 
}
