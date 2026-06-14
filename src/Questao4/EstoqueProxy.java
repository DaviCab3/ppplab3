package Questao4;
// O proxy controla o acesso ao EstoqueReal
// Ele valida regras antes de chamar o objeto base

class EstoqueProxy implements Estoque {

    // referência ao OBJETO BASE
    private EstoqueReal estoqueReal;

    // simulando estoque simples
    private int estoqueAtual = 5;

    public EstoqueProxy(EstoqueReal estoqueReal) {
        this.estoqueReal = estoqueReal;
    }

    @Override
    public void retirar(String produto, int quantidade) {

        System.out.println("PROXY: verificando estoque para " + produto);

        // regra de controle antes de acessar o estoque real
        if (quantidade <= estoqueAtual) {
            estoqueAtual -= quantidade;

            System.out.println("PROXY: pedido aprovado");

            // chama o OBJETO BASE
            estoqueReal.retirar(produto, quantidade);

        } else {
            System.out.println("PROXY: pedido negado! estoque insuficiente");
        }
    }
}