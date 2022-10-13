package homework_10;

public class Carro extends Veiculo {

    

    public Carro(String tipo, String fabricante, String modelo, String cor, String estadoDeUso, int anoFabricacao, double preco, int velocidadeMax) {
        super(tipo, fabricante, modelo, cor, estadoDeUso, anoFabricacao, preco,velocidadeMax);
    }
    
    //--------------------------------------------------

 
    @Override
     public void quantRodas() {
         System.out.println("4 rodas");
    }

    @Override
    public void quantDePassageiros() {
         System.out.println("Capacidade para 5 passageiros");
    }

    @Override
    public void quantPortas() {
         System.out.println("5 portas");
    }
}
