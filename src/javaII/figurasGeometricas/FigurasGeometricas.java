package javaII.figurasGeometricas;

public abstract class FigurasGeometricas {

    public abstract double area();

    public void ImprimirArea() {
        System.out.println("Área da figura:" + area());
    }
}
