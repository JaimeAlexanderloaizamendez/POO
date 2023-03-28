package Salud;



public class Empleado extends Persona {
    //se crean atributos propios de la subclase 
    private String cargo;
    private double valorHora;
    private int horasTrabajadas;
    private String departamento;
    private double totalApagar;

    public Empleado(String tipoDocumento,int documento,String nombre,String apellido,String cargo,double valorHora,int horasTrabajadas,String departamento){
        super( tipoDocumento, documento, nombre, apellido);

        this.cargo=cargo;
        this.valorHora=valorHora;
        this.horasTrabajadas=horasTrabajadas;
        this.departamento=departamento;
    }
    //creo los metodos propios de la subclase
    public void calcularHonorarios(){
    totalApagar=valorHora*horasTrabajadas;
    totalApagar=((totalApagar)-(0.966/100));




    System.out.println("el tipo de documento es: " +getTipoDocumento()+ " el numero documento es: " +getDocumento()+ " su nombre es: " +getNombre()+ " su apellido es: " +getApellido()+ " su cargo es: " +cargo+ " sus horas trabajadas fueron: " +horasTrabajadas+ " el valor por hora es: " +valorHora+ " su departamento es: " +departamento+ " el total a pagar es: "+totalApagar);
    }





    




}
