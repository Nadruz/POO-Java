package POO_Java.Heranca_Polimorfismo.src;

public class Main {
    public static void main(String[] args) {
        //Employee manager = new Manager(); //Tipo mais específico -> para o mais genérico
        printEmployee(new Manager());
        printEmployee(new Salesman());

    }
    public static void printEmployee(Employee employee) {
        System.out.printf("=======%s=======\n", employee.getClass().getCanonicalName());
    
        switch (employee) {
            case Manager manager ->{
                manager.setCode("123");
                manager.setName("João");
                manager.setSalary(5000);
                manager.setLogin("joao");
                manager.setPassword("1234");
                manager.setCommission(1200);
            
                System.out.println(manager.getSalary());
                System.out.println(manager.getCode());
                System.out.println(manager.getName());
                System.out.println(manager.getLogin());
                System.out.println(manager.getPassword());
            }
            case Salesman salesman ->{
                salesman.setCode("143");
                salesman.setName("Joana");
                salesman.setSalary(2000);
                salesman.setPercentPerSold(10);
                salesman.setPercentPerSold(10);
                salesman.setSoldAmount(1000);
            
                System.out.println(salesman.getSalary());
                System.out.println(salesman.getCode());
                System.out.println(salesman.getName());
                System.out.println(salesman.getPercentPerSold());
            }
        }
        employee.getFullSalary();
        System.out.println("==============");
    }
}
