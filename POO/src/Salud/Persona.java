package Salud;

import java.util.Scanner;

public class Persona {
   // Se crean los Atributos
   private String tipoDocumento;
   private int documento;
   private String nombre;
   private String apellido;
   private double peso;
   private double estatura;
   private int edad;
   private String sexo;
   private double pesoActual;


    //metodo get genera valor de retorno del mismo tipo de dato del atributo
    // set no retorna valores y requiere como parametro el valor de los atributos
    
   //metodos

   

    //Metodo constructor vacio
    /*public void Persona(){
        
    }*/
    //metodo constructor con parametros
    public  Persona(String tipoDocumento,int documento,String nombre,String apellido){
        this.tipoDocumento=tipoDocumento;
        this.documento=documento;
        this.nombre=nombre;
        this.apellido=apellido;
    }
    

   public String getTipoDocumento() {
        return tipoDocumento;
    }


    public void setTipoDocumento(String tipoDocumento) {
        this.tipoDocumento = tipoDocumento;
    }


    public int getDocumento() {
        return documento;
    }


    public void setDocumento(int documento) {
        this.documento = documento;
    }


    public String getNombre() {
        return nombre;
    }


    public void setNombre(String nombre) {
        this.nombre = nombre;
    }


    public String getApellido() {
        return apellido;
    }


    public void setApellido(String apellido) {
        this.apellido = apellido;
    }




//Se crean los Metodos
   public void pedirDatos(){
   Scanner captura=new Scanner(System.in);
   System.out.println("porfavor que tipo de documento tiene");
   tipoDocumento=captura.next();
   System.out.println("porfavor escriba su documento");
   documento=captura.nextInt();
   System.out.println("digite su nombre");
   nombre=captura.next();
   System.out.println("digite su apellido");
   apellido=captura.next();
   System.out.println("digite cuanto pesa");
   peso=captura.nextDouble();
   System.out.println("digite su estatura");
   estatura=captura.nextDouble();
   System.out.println("digite su edad");
   edad=captura.nextInt();
   System.out.println("digite su sexo");
   sexo=captura.next();
   } 
   //metodo sin parametros
   public void mostrarPersona(){
    System.out.println("su tipo de documento es "+tipoDocumento);
    System.out.println("su documento era "+documento);
    System.out.println("su nombre es "+nombre);
    System.out.println("su apellido es "+apellido);
    System.out.println("su peso es "+peso+" Kg ");
    System.out.println("su estatura es "+estatura+" M ");
    System.out.println("su edad es "+edad);
    System.out.println("su sexo es "+sexo);
   }

   public void calcularImc(){
    pesoActual=(int) (peso/(estatura*estatura));

    if (pesoActual<20) {
        System.out.println("su peso esta por debajo de lo ideal ");
        
    }else if(pesoActual>=20 && pesoActual<=25){
        System.out.println("su peso es ideal ");

    }else if(pesoActual>26){
        System.out.println("usted tiene sobrepeso");

    }
   }
   //metodo con retorno
   public double calcularImc2( double peso,Double estatura){
    double pesoActual2= peso/(estatura*estatura);
    if (pesoActual<20) {
        System.out.println("PESO BAJO ");
        
    }else if(pesoActual>=20 && pesoActual<=25){
        System.out.println("PESO IDEAL ");

    }else if(pesoActual>26){
        System.out.println("SOBRE PESO");

    } 
    return pesoActual2;
  }
 
public void mayorEdad(){
    if (edad<18) {
        System.out.println("usted es menor de edad");
        
    }else if(edad>=18) {
        System.out.println("usted es mayor de edad");
        
    }
    
    
    }
}
