package javaII.empresa;

public class FuncionarioPj extends Funcionario{

    private int horasTrabalhadas;
    private double valorHoraTrabalhada;

    public FuncionarioPj() {}

    public FuncionarioPj(String nome, String cargo, int horasTrabalhadas, double valorHoraTrabalhada, double salario) {
        super(nome, cargo);
        this.horasTrabalhadas = horasTrabalhadas;
        this.valorHoraTrabalhada = valorHoraTrabalhada;
        this.salario = salario;
    }



    public int getHorasTrabalhadas() {
        return horasTrabalhadas;
    }

    public void setHorasTrabalhadas(int horasTrabalhadas) {
        this.horasTrabalhadas = horasTrabalhadas;
    }

    public double getValorHoraTrabalhada() {
        return valorHoraTrabalhada;
    }

    public void setValorHoraTrabalhada(double valorHoraTrabalhada) {
        this.valorHoraTrabalhada = valorHoraTrabalhada;
    }

    double salario;
    public void pagarSalario(int horasTrabalhadas, double valorHoraTrabalhada) {
        salario = horasTrabalhadas * valorHoraTrabalhada;
        System.out.println("O salário do funcionário PJ é: " + salario);
    }
}
