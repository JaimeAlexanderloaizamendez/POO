package FigurasGeometricas;

public class Triangulo extends Figura {
    //Atributos
    private float base;
    private float altura;
    public Triangulo(float base,float altura){
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

    //metodo de la subclase
    public void calcularArea() {
        float area;
        area=base*altura/2;
        System.out.println("la base del triangulo es"+base+" su altura es "+altura+" y su area es"+area);
      
    }

    

    
}
