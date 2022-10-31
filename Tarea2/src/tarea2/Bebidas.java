package tarea2;

public abstract class Bebidas {
    public int numSerie;
    public int precio;
    public int numDisponible;

    public Bebidas(int numSerie, int precio, int numDisponible) {
        this.numSerie = numSerie;
        this.precio = precio;
        this.numDisponible = numDisponible;
    }
    
    public int getNumSerie(){
        return numSerie;
    }

    public int getPrecio() {
        return precio;
    }

    public int getNumDisponible() {
        return numDisponible;
    }

    public void setNumSerie(int numSerie) {
        this.numSerie = numSerie;
    }

    public void setPrecio(int precio) {
        this.precio = precio;
    }

    public void setNumDisponible(int numDisponible) {
        this.numDisponible = numDisponible;
    }
    public abstract String beber();
}
    
class CocaCola extends Bebidas{  
    public CocaCola(){
        
    }
    public CocaCola(int numSerie, int precio, int numDisponible) {
        super(numSerie, precio, numDisponible);
    }
    @Override
    public String beber(){
        return "Coca-Cola";
    }
    }
class Fanta extends Bebidas{  
    public Fanta(){
        
    }
    public Fanta(int numSerie, int precio, int numDisponible) {
        super(numSerie, precio, numDisponible);
    }
    @Override
    public String beber(){
        return "Fanta";
    }
    }
class Sprite extends Bebidas{
    public Sprite(){
        
    }
    public Sprite(int numSerie, int precio, int numDisponible) {
        super(numSerie, precio, numDisponible);
    }
    @Override
    public String beber(){
        return "Sprite";
    }
    }

