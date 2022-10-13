package classroom_10;

public class Classroom_10 {

    public static void main(String[] args) {
        Pessoa p = new Pessoa("Junior Cezar", "Santana", "masculino", "091.767.589-40");
        
        System.out.println(p.getNome());
        
        
        Alunos a = new Alunos();
        
        Animal animal = new Animal("Burro falante", "burro");
        
        Cachorro c = new Cachorro("Yoshi", "vira-lata");
        Gato g = new Gato("Garfiled", "siames");
        Cavalo cavalo = new Cavalo("Épona", "Pampa");
        
        c.emiteSom();
        g.emiteSom();
        cavalo.emiteSom();
     
    }

}
