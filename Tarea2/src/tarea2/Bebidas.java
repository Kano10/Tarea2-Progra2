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
}
    
class CocaCola extends Bebidas{    
    }
class Fanta extends Bebidas{    
    }
class Sprite extends Bebidas{
    }

