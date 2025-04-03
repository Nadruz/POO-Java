public class Carro extends Veiculo {
    public void ligar() { //Criando método "ligar"
        confereCambio();
        confereCombustivel();
        System.out.println("CARRO LIGADO!");
    } 
    private void confereCombustivel() { //Encapsulamento
        System.out.println("CONFERINDO COMBUSTÍVEL");
    }
    private void confereCambio() { //Encapsulamento 
        System.out.println("CONFERINDO CÂMBIO EM P");
    }
}
