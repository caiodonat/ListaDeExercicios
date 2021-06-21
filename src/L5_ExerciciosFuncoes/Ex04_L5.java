package L5_ExerciciosFuncoes;

public class Ex04_L5 {

    private float numeroDigitadoP;
    private String mensagemFinalP;

    public void Ex_04_L5_Core(float numero) {
        this.numeroDigitadoP = numero;
    }

    public float getNumero(){
        return this.numeroDigitadoP;
    }

    public void setMensagemFinal() {
        float numeroDigitado = this.numeroDigitadoP;
        String mensagemFinal;
        if (numeroDigitado > 0){
            mensagemFinal = "Positivo";
        }else if (numeroDigitado < 0){
            mensagemFinal = "Negativo";
        }else {
            mensagemFinal = "= 0";
        }
        this.mensagemFinalP = mensagemFinal;
    }

    public String getMensagemFinal(){
        setMensagemFinal();
        return mensagemFinalP;
    }
}
