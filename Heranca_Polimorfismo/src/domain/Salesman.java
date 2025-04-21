package POO_Java.Heranca_Polimorfismo.src;

public final class Salesman extends Employee{

    @Override
    public String getCode() {
        super.getCode();
        return "SL" + super.getCode();
    }


    public Salesman() {
        
    }

    private double percentPerSold;

    private double soldAmount;

    public Salesman(String code, 
                    String name, 
                    String adress, 
                    int age, 
                    double salary,
                    double percentPerSold,
                    double soldAmount) {
        super(code, name, adress, age, salary); // Aciona algum comportamento da classe Pai
        this.percentPerSold = percentPerSold;
        this.soldAmount = soldAmount;
    }

    public double getPercentPerSold() {
        return percentPerSold;
    }
    public void setPercentPerSold(double percentPerSold) {
        this.percentPerSold = percentPerSold;
    }

    public double getSoldAmount() {
        return soldAmount;
    }

    public void setSoldAmount(double soldAmount) {
        this.soldAmount = soldAmount;
    }
}
