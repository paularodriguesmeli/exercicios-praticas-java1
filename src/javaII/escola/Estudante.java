package javaII.escola;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class Estudante {
    private String nome;
    private LocalDate dataNascimento;
    private int numeroMatricula;
    private int serie;



    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public LocalDate getDataNascimento() {
        return dataNascimento;
    }

    public void setDataNascimento(LocalDate dataNascimento) {
        this.dataNascimento = dataNascimento;
    }

    public int getNumeroMatricula() {
        return numeroMatricula;
    }

    public void setNumeroMatricula(int numeroMatricula) {
        this.numeroMatricula = numeroMatricula;
    }

    public int getSerie() {
        return serie;
    }

    @Override
    public String toString() {
        return "Estudantes: " +
                "nome: " + nome + '\'' +
                ", data de Nascimento: " + dataNascimento +
                ", numero da Matricula: " + numeroMatricula +
                ", serie: " + serie;
    }

    public void setSerie(int serie) {
        this.serie = serie;
    }


}
