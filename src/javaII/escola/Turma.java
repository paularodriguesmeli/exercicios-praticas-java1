package javaII.escola;

import java.util.Arrays;

public class Turma {
    private int serie;
    private  char codIdentificador;

    private Disciplina[] disciplinas = new Disciplina[5];
    private Estudante[] estudantes = new Estudante[10];




    public int getSerie() {
        return serie;
    }

    public Disciplina[] getDisciplinas() {
        return disciplinas;
    }

    public void setDisciplinas(Disciplina[] disciplinas) {
        this.disciplinas = disciplinas;
    }

    public Estudante[] getEstudantes() {
        return estudantes;
    }

    public void setEstudantes(Estudante[] estudantes) {
        this.estudantes = estudantes;
    }

    public void setSerie(int serie) {
        this.serie = serie;
    }

    public char getCodIdentificador() {
        return codIdentificador;
    }

    public void setCodIdentificador(char codIdentificador) {
        this.codIdentificador = codIdentificador;
    }

    @Override
    public String toString() {
        return "Turma: " +
                "serie: " + serie +
                ", código: " + codIdentificador +
                ", disciplinas: " + Arrays.toString(disciplinas) +
                ", estudantes: " + Arrays.toString(estudantes) +
                '.';
    }
}
