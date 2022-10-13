package classroom_10;

public class Alunos extends Pessoa {
    /* 
     *Aluno é uma extensão da classe Pessoa, ou seja:
     * Aluno é uma subclasse de Pessoa
     * Pessoa é a classe Pai de Aluno, Aluno recebe HERANÇA de Pessoa
     * Pessoa é uma super classse de Aluno   
    */

    String matricula , turno;

    public Alunos(String matricula, String turno, String nome, String sobrenome, String genero, String cpf) {
        super(nome, sobrenome, genero, cpf);
        this.matricula = matricula;
        this.turno = turno;
    }

    public Alunos() {}
    
    public String getNomeMatricula(){
        return "None: " + super.getNome() + " - Matricula: " + this.matricula;
    }
    
    @Override // @"algo" chama-se anotação/decorator de algo
    public String getGenero(){
    return super.getGenero() + " (conforme documento)";
    }
    
    /*
    Quando eu sobreescrevo um método, mudando o seu comportamento, ou seja mudando a 
    Forma que executa, eu uso o POLIMORFISMO da POO.
    */
}
