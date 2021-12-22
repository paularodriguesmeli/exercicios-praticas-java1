package javaII.empresa;

import java.math.BigDecimal;

public class Tecnico extends Funcionario implements FuncionarioClt{

    private int jornadaTrabalho = 40;
    private double bonificacao;
    private double salarioBase;
    private double salarioMes;

    public Tecnico(String nome, String cargo, int jornadaTrabalho, int bonificacao, double salarioBase, double salarioMes) {
        super(nome, cargo);
        this.jornadaTrabalho = jornadaTrabalho;
        this.bonificacao = bonificacao;
        this.salarioBase = salarioBase;
        this.salarioMes = salarioMes;
    }
    public Tecnico() {}


    public int getJornadaTrabalho() {
        return jornadaTrabalho;
    }

    public void setJornadaTrabalho(int jornadaTrabalho) {
        this.jornadaTrabalho = jornadaTrabalho;
    }

    public double getBonificacao() {
        return bonificacao;
    }

    public void setBonificacao(double bonificacao) {
        this.bonificacao = bonificacao;
    }

    public double getSalarioBase() {
        return salarioBase;
    }

    public void setSalarioBase(double salarioBase) {
        this.salarioBase = salarioBase;
    }

    public double getSalarioMes() {
        return salarioMes;
    }

    public void setSalarioMes(double salarioMes) {
        this.salarioMes = salarioMes;
    }

    @Override
    public void pagarSalario(double bonificacao, double salarioBase) {
        salarioMes = salarioBase + (salarioBase * bonificacao);
        System.out.println("O salário do técnico é: " + salarioMes);
    }
}
