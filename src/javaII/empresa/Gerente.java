package javaII.empresa;

public class Gerente extends Funcionario implements FuncionarioClt {

    private int jornadaTrabalho = 36;
    private double bonificacao;
    private double salarioBase;
    private double salarioMes;
    private int descansoRemunerado = 4;

    public Gerente(String nome, String cargo, int jornadaTrabalho, double bonificacao, double salarioBase, double salarioMes, int descansoRemunerado) {
        super(nome, cargo);
        this.jornadaTrabalho = jornadaTrabalho;
        this.bonificacao = bonificacao;
        this.salarioBase = salarioBase;
        this.salarioMes = salarioMes;
        this.descansoRemunerado = descansoRemunerado;
    }

    public Gerente() {}

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

    public int getDescansoRemunerado() {
        return descansoRemunerado;
    }

    public void setDescansoRemunerado(int descansoRemunerado) {
        this.descansoRemunerado = descansoRemunerado;
    }

    @Override
    public void pagarSalario(double bonificacao, double salarioBase) {
        salarioMes = salarioBase + (salarioBase * bonificacao);
        System.out.println("O salário do gerente é: " + salarioMes);
    }
}
