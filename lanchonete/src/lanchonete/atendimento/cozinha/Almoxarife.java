package lanchonete.lanchonete.atendimento.cozinha;

public class Almoxarife {
    private void controlarEntrada() {
        System.out.println("Controlando entrada dos itens");
    }
    private void controlarSaida() {
        System.out.println("Controlando saída dos itens");
    }
    void entregarIngredientes() {
        System.out.println("Entregando os ingredientes");
        controlarSaida();
    }
    void trocarGas() {
        System.out.println("Trocando o gás");
    }
}
