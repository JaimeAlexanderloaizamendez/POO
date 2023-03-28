package FigurasGeometricas;

import java.util.Scanner;

public class Ejecucion {

    public static void main(String[] args) {
        float lado;
        float base;
        float altura;
        float radio;
        float pi;
        int figura;

        Scanner captura=new Scanner(System.in);

        System.out.println("Elija  un numero correspondiente a la  figura para saber su area correspondiente: ");
        System.out.println("Cuadrado=1");
        System.out.println("Rectangulo=2");
        System.out.println("Circulo=3");
        System.out.println("Triangulo=4");
        System.out.println();
        System.out.println();
        System.out.println("elija la figura: ");
        figura=captura.nextInt();

        if(figura==1){

            System.out.println("escriba el lado del caudrado ");
            lado=captura.nextFloat();
            Cuadrado cuadradoObjeto=new Cuadrado(lado);
            cuadradoObjeto.calcularArea();
        }
        else if(figura==2){

            System.out.println("escriba la base del rectangulo ");
            base=captura.nextFloat();
            System.out.println("escriba la altura del rectangulo ");
            altura=captura.nextFloat();
            Rectangulo rectanguloObjeto=new Rectangulo(base,altura);
            rectanguloObjeto.calcularArea();
        }
        else if(figura==3){

            System.out.println("escriba el radio del circulo ");
            radio=captura.nextFloat();
            System.out.println("escriba pi ");
            pi=captura.nextFloat();
            Circulo circuloObjeto=new Circulo(radio, pi);
            circuloObjeto.calcularArea();
        }
        else if(figura==4){

            System.out.println("escriba la base del triangulo");
            base=captura.nextFloat();
            System.out.println("escriba la altura del triangulo");
            altura=captura.nextFloat();
            Triangulo trianguloObjeto=new Triangulo(base, altura);
            trianguloObjeto.calcularArea();
        }

        captura.close();


    }
    
}
