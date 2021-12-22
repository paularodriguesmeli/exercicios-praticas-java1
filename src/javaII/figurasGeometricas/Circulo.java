package javaII.figurasGeometricas;

public class Circulo extends FigurasGeometricas{

    private double raio;
    private double pi = 3.14;

    public Circulo(double raio) {
        this.raio = raio;
    }


    @Override
    public double area() {
        return pi * (raio * raio);
    }
}
