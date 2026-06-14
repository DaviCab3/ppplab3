package Questao3;

class SalgadoNormal implements Salgado {

    private String nome;

    public SalgadoNormal(String nome) {
        this.nome = nome;
    }

    @Override
    public void preparar() {
        System.out.println("Preparando salgado normal: " + nome);
    }
}