package javaII.empresa;

public class FuncionarioPj extends Funcionario{

    private int horasTrabalhadas;
    private double valorHoraTrabalhada;

    double salario;
    public double pagarSalario(int horasTrabalhadas, double valorHoraTrabalhada) {
        salario = horasTrabalhadas * valorHoraTrabalhada;
        return salario;
    }

    public int getHorasTrabalhadas() {
        return horasTrabalhadas;
    }

    public void setHorasTrabalhadas(int horasTrabalhadas) {
        this.horasTrabalhadas = horasTrabalhadas;
    }

    public double getValorHoraTrabalahada() {
        return valorHoraTrabalhada;
    }

    public void setValorHoraTrabalahada(double valorHoraTrabalahada) {
        this.valorHoraTrabalhada = valorHoraTrabalahada;
    }
}
