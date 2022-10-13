package homework_10;

public class Barco extends Veiculo {

    private String porte;
    private int pes;

    public Barco(String tipo,String porte, int pes, String fabricante, String modelo, String cor, String estadoDeUso, int anoFabricacao, double preco, int velocidadeMax) {
        super(tipo,fabricante, modelo, cor, estadoDeUso, anoFabricacao, preco, velocidadeMax);
        this.porte = porte;
        this.pes = pes;
    }
    //--------------------------------------------------

    public String getPorte() {
        return porte;
    }

    public void setPorte(String porte) {
        this.porte = porte;
    }
    //--------------------------------------------------

    public int getPes() {
        return pes;
    }

    public void setPes(int pes) {
        this.pes = pes;
    }

    //--------------------------------------------------
    @Override
    public void quantRodas() {
        System.out.println("Não possui rodas");
    }

    @Override
    public void quantDePassageiros() {
        System.out.println("Capacidade para mais de 5 passageiros");
    }

  
}
