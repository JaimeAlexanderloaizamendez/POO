package Interfaz;


import java.util.Random;
import java.util.Scanner;

public class Pierdrapapelotijera implements Juego {

    //Atributos
    private int numeroMaquina;
    private String nombreJugador;
    private int eleccion;
    //objeto para caturar los datos
    Scanner captura=new Scanner(System.in);
    //Solicitar datos

    public void iniciar() {
        System.out.println("nombre del jugador");
        nombreJugador=captura.next();
        
    }
    public void jugar() {
        System.out.println(nombreJugador+"escoja una opcion \npiedra=1  \npapel=2  \ntijera=3");
        eleccion=captura.nextInt();
        Random aleatorio=new Random();
        numeroMaquina=aleatorio.nextInt(3)+1;
        System.out.println("la maquina esta escogiendo");
        
    }
        public void finalizar() {
        if(numeroMaquina==1 && eleccion==1){
            System.out.println("la maquina saco piedra");
            System.out.println("Empate");
        }
        else if(numeroMaquina==1 && eleccion==2){
            System.out.println("la maquina saco piedra");
            System.out.println("Ganado"+nombreJugador);
        }
        else if(numeroMaquina==1 && eleccion==3){
            System.out.println("la maquina saco piedra");
            System.out.println("Perdio");
        }
        else if(numeroMaquina==2 && eleccion==2){
            System.out.println("la maquina saco papel");
            System.out.println("Empate");
        }
        else if(numeroMaquina==2 && eleccion==1){
            System.out.println("la maquina saco papel");
            System.out.println("Perdido");
        }
        else if(numeroMaquina==2 && eleccion==3){
            System.out.println("la maquina saco papel");
            System.out.println("Gano"+nombreJugador);
        }
        else if(numeroMaquina==3 && eleccion==1){
            System.out.println("la maquina saco tijera");
            System.out.println("Gano"+nombreJugador);
        } else if(numeroMaquina==3 && eleccion==2){
            System.out.println("la maquina saco tijera");
            System.out.println("Perdio");
        }
        else if(numeroMaquina==3 && eleccion==3){
            System.out.println("la maquina saco tijera");
            System.out.println("Empato");
        }
        
        
       
    }
    
}