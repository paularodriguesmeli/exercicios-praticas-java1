package javaII.empresa;

public class Programa {
    public static void main(String[] args) {

        FuncionarioPj meli = new FuncionarioPj("Mercado Livre", "prestador de serviço", 20, 50.00, 0);
        meli.pagarSalario(20, 50.00);

        FuncionarioClt paula = new Tecnico();
        paula.pagarSalario(0.05, 3200.00);

        FuncionarioClt jose = new Analista();
        jose.pagarSalario(0.08, 4000.00);

        FuncionarioClt antonio = new Gerente();
        antonio.pagarSalario(0.125, 6000.00);

        Diretor kenyo = new Diretor();
        kenyo.pagarSalario(15000.00, 0.03);

    }
}
