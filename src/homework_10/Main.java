package homework_10;

public class Main {

    public static void main(String[] args) {

        Carro car1 = new Carro("Street", "Ford", "Fiesta", "Prata", "Usado", 2005, 14.500, 220);
        Carro car2 = new Carro("Muscle", "Ford", "Mustang", "Preto", "Usado", 2006, 98.000, 280);
        System.out.println("Tipo: " + car1.getTipo()
                + "\nFabricante: " + car1.getFabricante()
                + "\nModelo: " + car1.getModelo()
                + "\nCor: " + car1.getCor()
                + "\nEstado: " + car1.getEstadoDeUso()
                + "\nAno: " + car1.getAnoFabricacao()
                + "\nVelocidade max: " + car1.getVelocidadeMax()
                + "\nValor: " + car1.getPreco()
        );
        car1.quantRodas();
        car1.quantDePassageiros();
        
        System.out.println("\n-----------------------------------------\n");
        
        Moto moto1 = new Moto("Off Road", "Yamaha", "Lander", "Preto", "Usado", 2005, 6.300, 200);
        Moto moto2 = new Moto("Custom", "Honda", "CB400", "Preto", "Usado", 2005, 12.300, 300);
        System.out.println("Tipo: " + moto1.getTipo()
                + "\nFabricante: " + moto1.getFabricante()
                + "\nModelo: " + moto1.getModelo()
                + "\nCor: " + moto1.getCor()
                + "\nEstado: " + moto1.getEstadoDeUso()
                + "\nAno: " + moto1.getAnoFabricacao()
                + "\nVelocidade max: " + moto1.getVelocidadeMax()
                + "\nValor: " + moto1.getPreco()
        );
        moto1.quantRodas();
        moto1.quantDePassageiros();

        System.out.println("\n-----------------------------------------\n");
        
        Barco bar1 = new Barco("Barco de Pesca", "Pequeno", 60, "Ar Tsol", "ART560", "Branco", "Novo", 2022, 70.000, 53);
        System.out.println("Tipo: " + bar1.getTipo()
                + "\nPorte: " + bar1.getPorte()
                + "\nPes: " + bar1.getPes()
                + "\nFabricante: " + bar1.getFabricante()
                + "\nModelo: " + bar1.getModelo()
                + "\nCor: " + bar1.getCor()
                + "\nAno: " + bar1.getAnoFabricacao()
                + "\nVelocidade max: " + bar1.getVelocidadeMax()
                + "\nValor: " + bar1.getPreco()
        );
        bar1.quantRodas();
        bar1.quantDePassageiros();
    }
}
