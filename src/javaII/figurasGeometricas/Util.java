package javaII.figurasGeometricas;

public class Util {

    public static double areaMedia(FigurasGeometricas[] array) {
        double soma = 0;

        for(FigurasGeometricas fg : array) {
            soma += fg.area();
        }
        return soma/array.length;
    }
}
