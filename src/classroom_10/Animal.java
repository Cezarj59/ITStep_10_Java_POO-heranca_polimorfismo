package classroom_10;

public class Animal {

    private String nome, raca;

    public Animal(String nome, String raca) {
        this.nome = nome;
        this.raca = raca;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setRaca(String raca) {
        this.nome = nome;
    }

    public String getRaca() {

        return raca;
    }

    public void emiteSom() {
    }

    public void movimento() {
    }

}

class Cachorro extends Animal {

    public Cachorro(String nome, String raca) {
        super(nome, raca);
    }

    @Override
    public void emiteSom() {
        System.out.println("late");
    }

    @Override
    public void movimento() {
        System.out.println("em 4 patas");
    }

}

class Gato extends Animal {

    public Gato(String nome, String raca) {
        super(nome, raca);
    }

    @Override
    public void emiteSom() {
        System.out.println("mia");
    }

    @Override
    public void movimento() {
        System.out.println("em 4 patas");
    }

}

/*
Java possui 3 tipos de acessibilidade/segurança:
public -> visto por todo o projeto
private -> visto apenas na própria classe(não vai como herança)
protected -> visto por todos do mesmo pacote
defaut (não declarado) -> igual ao protected
*/

// crie a classe cavalo e faça o polimorfismo

class Cavalo extends Animal {

    public Cavalo(String nome, String raca) {
        super(nome, raca);
    }

    @Override
    public void emiteSom() {
        System.out.println("Relincha");
    }

    @Override
    public void movimento() {
        System.out.println("em 4 patas com ferraduras no casco.");
    }

}