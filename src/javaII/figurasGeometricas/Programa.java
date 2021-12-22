package javaII.figurasGeometricas;

import static javaII.figurasGeometricas.Util.areaMedia;

public class Programa {
    public static void main(String[] args) {
        FigurasGeometricas arr[] = new FigurasGeometricas[3];
        arr[0] = new Circulo(5);
        arr[1] = new Triangulo(5, 5);
        arr[2] = new Retangulo(6, 6);

        double ap = areaMedia(arr);
        System.out.println(ap);


    }
}
