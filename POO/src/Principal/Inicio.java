package Principal;


import java.util.Scanner;

import Salud.Empleado;


public class Inicio {
    public static void main(String[] args) {
        //estos son losa tributos de la subclase
        String tipoDocumento;
        int documento;
        String nombre;
        String apellido;
        String cargo;
        double valorHora;
        int horasTrabajadas;
        String departamento;

        /*double peso;
        double estatura;
        double pesoActual;
        
        //PRIEMER RETO
        
        //Se crea el objeto de la clase persona
        Persona persona=new Persona();
        //Invocar metodos
        persona.pedirDatos();
        persona.mostrarPersona();
        persona.calcularImc();
        persona.mayorEdad(); 
        
        //SEGUNDO RETO
        Scanner captura=new Scanner(System.in);
        System.out.println("digite su peso");
        peso=captura.nextDouble();
        System.out.println("digite su estatura");
        estatura=captura.nextDouble();*
        pesoActual=persona.calcularImc2(peso,estatura); 
       
        //TERCER RETO
        //ejecutar el get para ver si funciona
        
        persona.pedirDatos();
        System.out.println("el tipo de documento es "+persona.getTipoDocumento());
        System.out.println("su documento es "+persona.getDocumento());
        System.out.println("su nombre es "+persona.getNombre());
        System.out.println("su apellido es "+persona.getApellido());
        System.out.println("su peso es "+persona.getPeso());
        System.out.println("su estatura es "+persona.getEstatura());
        System.out.println("su edad es "+persona.getEdad());
        System.out.println("su sexo es "+persona.getSexo());
        System.out.println("su peso actual es "+persona.getPesoActual());*/ 
        
        
        Scanner captura=new Scanner(System.in);
        //pido datos de la subclase
        System.out.println("digite su tipo de documento: ");
        tipoDocumento=captura.next();
        System.out.println("digite su documento: ");
        documento=captura.nextInt();
        System.out.println("escriba su nombre: ");
        nombre=captura.next();
        System.out.println("escriba su apellido: ");
        apellido=captura.next();
        System.out.println("escriba su cargo: ");
        cargo=captura.next();
        System.out.println("digite el valor de la hora: ");
        valorHora=captura.nextDouble();
        System.out.println("digite la cantidad de horas trabajadas: ");
        horasTrabajadas=captura.nextInt();
        System.out.println("digite el departamento: ");
        departamento=captura.next();
        
        Empleado empleado=new Empleado(tipoDocumento,documento,nombre,apellido,cargo,valorHora,horasTrabajadas,departamento);
        empleado.calcularHonorarios();
        captura.close();

    }

}

    


