package Questao4;

// Esse é o sistema real de estoque da loja
// Ele NÃO deve ser acessado diretamente pelos clientes
class EstoqueReal implements Estoque {

    @Override
    public void retirar(String produto, int quantidade) {
        System.out.println("ESTOQUE REAL: retirando " + quantidade + " unidades de " + produto);
    }
}
