package POO_Java.Heranca_Polimorfismo.src;

public final class Salesman extends Employee{
    public Salesman(String code, String name, String adress, int age, double salary) {
        super(code, name, adress, age, salary); // Aciona algum comportamento da classe Pai
        
    }

    public Salesman() {
        
    }

    private double percentPerSold;

    public double getPercentPerSold() {
        return percentPerSold;
    }
    public void setPercentPerSold(double percentPerSold) {
        this.percentPerSold = percentPerSold;
    }
}
