package Interfaz;

import java.util.Random;
import java.util.Scanner;

public class CaraSellazo implements Juego  {
    //atributos
    
    private int moneda ;
    private String jugador;
    private int eleccion;

    Scanner captura=new Scanner(System.in);

  
   public void iniciar() { 
    System.out.println("Por favor digite su nombre");
    jugador=captura.next();
       
    }

   
   public void jugar() {
       System.out.println(jugador+"escoja una opcion cara=1 sello=2");
       eleccion=captura.nextInt();
       System.out.println();
       System.out.println("se lanzo la moneda");
       moneda=(int) (Math.random()*2)+1;
    }
    public void finalizar(){
        if (moneda==1 && eleccion==1) {
            System.out.println("callo cara gano"+ jugador);
            
        }
        else if(moneda==2 && eleccion==2) {
            System.out.println("callo sello gano"+ jugador);
            
        }
        else if(moneda==1 && eleccion==2) {
            System.out.println("callo cara perdio"+ jugador);
        }
        else if(moneda==2 && eleccion==1) {
            System.out.println("callo sello perdio"+ jugador);
        }

    }
}