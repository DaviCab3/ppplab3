package Questao3;

class SalgadoEspecialAdapter implements Salgado {

    private SalgadoEspecial salgadoEspecial;

    public SalgadoEspecialAdapter(SalgadoEspecial salgadoEspecial) {
        this.salgadoEspecial = salgadoEspecial;
    }

    @Override
    public void preparar() {
        salgadoEspecial.fazerEspecial();
    }
}
