

public class Veiculo {
    private String cor;
    private int velocidade;
    private String modelo;

    public Veiculo(){}

    public Veiculo(String cor, int velocidade, String modelo) {
        this.cor = cor;
        this.velocidade = velocidade;
        this.modelo = modelo;
    }



    public String getCor() {
        return cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    public int getVelocidade() {
        return velocidade;
    }

    public void setVelocidade(int velocidade) {
        this.velocidade = velocidade;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }


}
