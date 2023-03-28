package FigurasGeometricas;

public class Rectangulo extends Figura {
    //atributos
    private float base;
    private float altura;
    public Rectangulo (float base,float altura){
        this.base=base;
        this.altura=altura;
    }
    //metodos accesores
    public float getBase() {
        return base;
    }
    public void setBase(float base) {
        this.base = base;
    }
    public float getAltura() {
        return altura;
    }
    public void setAltura(float altura) {
        this.altura = altura;
    }
    //metodo de subclase
    
    public void calcularArea() {
        float area;
        area=base*altura;
        System.out.println("la base del rectangulo es"+base+" la altura es "+altura+"y su area es"+area);
      
    }
    
    
   
}
