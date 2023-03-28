package FigurasGeometricas;

public class Circulo extends Figura {
    //atributos
    private float pi;
    private float radio;
    public Circulo(float pi,float radio){
        this.pi=pi;
        this.radio=radio;
    }
    //metodos accesores
    public float getPi() {
        return pi;
    }
    public void setPi(float pi) {
        this.pi = pi;
    }
    public float getRadio() {
        return radio;
    }
    public void setRadio(float radio) {
        this.radio = radio;
    }
    
    public void calcularArea() {
        float area;
        area=pi*(radio*radio);
        System.out.println("pi es"+pi+"su radio es"+radio+"y su area es"+area);
       
    }  
    
    //metodo de la subclase
    
}
