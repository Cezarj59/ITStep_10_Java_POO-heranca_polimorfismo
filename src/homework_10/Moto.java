
package homework_10;


public class Moto extends Veiculo {

    public Moto(String tipo, String fabricante, String modelo, String cor, String estadoDeUso, int anoFabricacao, double preco, int velocidadeMax) {
        super(tipo, fabricante, modelo, cor, estadoDeUso, anoFabricacao, preco, velocidadeMax);
    }

    @Override
     public void quantRodas() {
         System.out.println("Possui 2 rodas");
    }

    @Override
    public void quantDePassageiros() {
         System.out.println("Capacidade para mais de 2 passageiros");
    }

}
