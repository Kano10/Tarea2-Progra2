
package tarea2;


public class Tarea2 {
 enum Bebidass{
          cocacola, fanta;
        }
    public static void main(String[] args) {
       Bebidass deposito;
       deposito=Bebidass.cocacola;
       deposito=Bebidass.fanta;
       Bebidass.fanta=10;
    }
    
}
