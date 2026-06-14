package Questao4;// ===============================
// CLIENTE
// ===============================
// O cliente NUNCA fala direto com EstoqueReal
// Ele só interage com o PROXY

public class Main {
    public static void main(String[] args) {

        EstoqueReal estoqueReal = new EstoqueReal(); // objeto base

        Estoque estoque = new EstoqueProxy(estoqueReal); // proxy (intermediário)

        // cliente faz pedidos SEM acessar o estoque real diretamente
        estoque.retirar("Coxinha", 2);
        estoque.retirar("Kibe", 1);
        estoque.retirar("Risoles", 3); // pode ser negado
    }
}