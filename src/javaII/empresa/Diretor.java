package javaII.empresa;

public class Diretor extends Funcionario {
    private double participacaoLucros;
    private double salarioBase;
    private double salarioMes;

    public Diretor(String nome, String cargo, double participacaoLucros, double salarioBase, double salarioMes) {
        super(nome, cargo);
        this.participacaoLucros = participacaoLucros;
        this.salarioBase = salarioBase;
        this.salarioMes = salarioMes;
    }

    public Diretor() {}

    public double getParticipacaoLucros() {
        return participacaoLucros;
    }

    public void setParticipacaoLucros(double participacaoLucros) {
        this.participacaoLucros = participacaoLucros;
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

    public void pagarSalario(double salarioBase, double participacaoLucros) {
        salarioMes = salarioBase +  (salarioBase * participacaoLucros);
        System.out.println("O salário do diretor é: " + salarioMes);
    }
}
