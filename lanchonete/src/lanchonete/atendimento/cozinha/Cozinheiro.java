package lanchonete.lanchonete.atendimento.cozinha;

import lanchonete.lanchonete.atendimento.Atendente;

public class Cozinheiro {
    public void adicionarLancheNoBalcao() {
        System.out.println("Adicionando lanche no balcão");
    }
    public void adicionarSucoNoBalcao() {
        System.out.println("Adicionando suco no balcão");
    }
    public void adicionarComboNoBalcao() {
        adicionarLancheNoBalcao();
        adicionarSucoNoBalcao();
    }
    private void prepararLanche() {
        System.out.println("Preparando o lanche!");
    }
    private void prepararVitamina() {
        System.out.println("Preparando a vitamina!");
    }
    private void PrepararCombo() {
        prepararLanche();
        prepararVitamina();
    }
    private void selecionarIngredientesLanche() {
        System.out.println("Selecionando: Pão, carne, alface, tomate e queijo");
    }
    private void selecionarIngredientesSuco() {
        System.out.println("Selecionando: Fruta, leite" );
    }
    private void lavarIngredientes() {
        System.out.println("Lavando ingredientes");
    }
    private void baterVitaminaNoLiquidificador() {
        System.out.println("Batendo a vitamina no liquidificador");
    }
    private void fritarIngredientesLanche() {
        System.out.println("Fritando a carne");
    }
    private void pedirTrocarGas(Almoxarife meuAmigo) {
        meuAmigo.trocarGas();
    }
    private void pedirIngredientes(Almoxarife almoxarife) {
        almoxarife.entregarIngredientes();
    }
}
