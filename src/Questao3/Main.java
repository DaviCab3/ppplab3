package Questao3;

public class Main {
    public static void main(String[] args) {

        Salgado s1 = new SalgadoNormal("Coxinha");
        Salgado s2 = new SalgadoNormal("Kibe");

        Salgado especial = new SalgadoEspecialAdapter(
                new SalgadoEspecial("Coxinha de Frango Catupiry"));

        s1.preparar();
        s2.preparar();
        especial.preparar();
    }
}
