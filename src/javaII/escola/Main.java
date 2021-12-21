package javaII.escola;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Arrays;

public class Main {


    public static void main(String[] args) {

        // Criando Estudantes
        Estudante paula = new Estudante();
        paula.setNome("Paula Rodrigues da Silva");
        paula.setDataNascimento(LocalDate.parse("10/03/1984", DateTimeFormatter.ofPattern("dd/MM/yyyy")));
        paula.setNumeroMatricula(273847);
        paula.setSerie(8);

        Estudante ana = new Estudante();
        ana.setNome("Ana Julia Bento");
        ana.setDataNascimento(LocalDate.parse("25/03/2013", DateTimeFormatter.ofPattern("dd/MM/yyyy")));
        ana.setNumeroMatricula(3672);
        ana.setSerie(4);

        Estudante[] estudantes = new Estudante[2];
        estudantes[0] = paula;
        estudantes[1] = ana;


        // Criando Disciplinas
        Disciplina portugues = new Disciplina();
        portugues.setNome("Português");
        portugues.setCargaHoraria(200);

        Disciplina matematica = new Disciplina();
        matematica.setNome("Matemática");
        matematica.setCargaHoraria(300);

        Disciplina historia = new Disciplina();
        historia.setNome("História");
        historia.setCargaHoraria(100);

        Disciplina geografia = new Disciplina();
        geografia.setNome("Geografia");
        geografia.setCargaHoraria(250);

        Disciplina[] disciplinas = new Disciplina[4];
        disciplinas[0] = portugues;
        disciplinas[1] = matematica;
        disciplinas[2] = historia;
        disciplinas[3] = geografia;

        Turma turma1 = new Turma();

        turma1.setSerie(6);
        turma1.setCodIdentificador('A');
        turma1.setDisciplinas(disciplinas);
        turma1.setEstudantes(estudantes);

        System.out.println(turma1);




    }

}
