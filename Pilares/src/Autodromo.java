public class Autodromo {
    public static void main(String[] args) {
        Carro jeep = new Carro();
        //jeep.confereCambio();
        //jeep.confereCombustivel(); 
        jeep.setChassi("879434");
        //jeep.ligar();

        Moto z400 = new Moto();
        z400.setChassi("090765");
        //z400.ligar();

        Veiculo coringa = jeep;
        coringa.ligar();
    }
}
