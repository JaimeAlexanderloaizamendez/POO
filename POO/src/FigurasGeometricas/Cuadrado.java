package FigurasGeometricas;

public class Cuadrado extends Figura{
    //atributos
    private float lado;
    public Cuadrado(float lado){
        this.lado=lado;
    }

    //metodos accesores
    public float getLado() {
        return lado;
    }

    public void setLado(float lado) {
        this.lado = lado;
    }
    //metodo de la subclase
    public void calcularArea() {
        float area=0;
        area=lado*lado;
        System.out.println("el lado del cuadrado es"+lado+"y su area"+area);

    }

    
}
