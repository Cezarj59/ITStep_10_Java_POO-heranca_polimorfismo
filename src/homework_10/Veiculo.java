package homework_10;

import java.text.DecimalFormat;

public class Veiculo {

    private String tipo, fabricante, modelo, cor, estadoDeUso;
    private double preco;
    private int anoFabricacao, velocidadeMax;

    public Veiculo(String tipo, String fabricante, String modelo, String cor, String estadoDeUso, int anoFabricacao, double preco, int velocidadeMax) {
        this.tipo = tipo;
        this.fabricante = fabricante;
        this.modelo = modelo;
        this.cor = cor;
        this.estadoDeUso = estadoDeUso;
        this.anoFabricacao = anoFabricacao;
        this.preco = preco;
        this.velocidadeMax = velocidadeMax;
    }

    //--------------------------------------------------
    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    //--------------------------------------------------
    public String getFabricante() {
        return fabricante;
    }

    public void setFabricante(String fabricante) {
        this.fabricante = fabricante;
    }

    //--------------------------------------------------
    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    //--------------------------------------------------
    public String getCor() {
        return cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    //--------------------------------------------------
    public String getEstadoDeUso() {
        return estadoDeUso;
    }

    public void setEstadoDeUso(String estadoDeUso) {
        this.estadoDeUso = estadoDeUso;
    }

    //--------------------------------------------------
    public int getAnoFabricacao() {

        return anoFabricacao;
    }

    public void setAnoFabricacao(int anoFabricacao) {
        this.anoFabricacao = anoFabricacao;
    }

    //--------------------------------------------------
    public Double getPreco() {
        return preco;
    }

    public String getPrecoFormatado() {
        DecimalFormat formato = new DecimalFormat("0.000");

        return formato.format(this.preco);
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }

    //--------------------------------------------------
    public int getVelocidadeMax() {
        return velocidadeMax;
    }

    public void setVelocidadeMax(int velocidadeMax) {
        this.velocidadeMax = velocidadeMax;
    }

//--------------------------------------------------
    public void quantRodas() {
    }

    public void quantDePassageiros() {
    }

    public void quantPortas() {
    }

}
