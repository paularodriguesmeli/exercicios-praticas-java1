package javaII.figurasGeometricas;

public class Retangulo extends FigurasGeometricas{

    private double base;
    private double altura;

    public Retangulo(double base, double altura) {
        this.base = base;
        this.altura = altura;
    }

    @Override
    public double area() {
        return base * altura;
    }
}
