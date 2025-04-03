package lanchonete.lanchonete.area.cliente;

public class Cliente {
    public void escolherLanche() {
        System.out.println("Escolhendo o lanche");
    }
    public void fazerPedido() {
        System.out.println("Fazendo o pedido");
    }
    public void controlarEntrada() {
        System.out.println("Controlando entrada dos itens");
    }
    public void pagarConta() {
        consultarSaldoApp();
        System.out.println("Pagando a conta");
    }
    private void consultarSaldoApp() {
        System.out.println("Consultando o saldo no App");
    }
}
