
package tarea2;


public class Tarea2 {
    public static void main(String[] args) {
        //COmpra y vuelto 0
        System.out.println("Lira");
        CocaCola coca = new CocaCola(10);
        Fanta fanta = new Fanta(10);
        Sprite sprite = new Sprite(10);
        Moneda milpesos = new M1000();
        Maquina Maquina1 = new Maquina(coca, fanta, sprite,1000, 10);
        Comprador Lira = new Comprador(milpesos, 2, Maquina1);
        System.out.println(Lira.queBebiste());
        System.out.println(Lira.cuantoVuelto());
        System.out.print("\n");
        
        //compra y vuelto de 400
        System.out.println("Cano");
        Moneda quinientos = new M500();
        Maquina Maquina2 = new Maquina(coca, fanta, sprite,100, 10);
        Comprador Cano = new Comprador(quinientos, 1, Maquina2);
        System.out.println(Cano.queBebiste());
        System.out.println(Cano.cuantoVuelto());
        System.out.print("\n");
        
        //Pago insuficiente
        System.out.println("JOaco");
        Moneda cien = new M100();
        Maquina Maquina3 = new Maquina(coca, fanta, sprite,1000, 10);
        Comprador Joaco = new Comprador(cien, 1, Maquina3);
        System.out.println(Joaco.queBebiste());
        System.out.println(Joaco.cuantoVuelto());
        System.out.print("\n");
        
        System.out.println("Connie");
        Moneda luca = new M1000();
        Maquina Maquina4 = new Maquina(coca, fanta, sprite,500, 0);
        Comprador connie = new Comprador(luca, 1, Maquina4);
        System.out.println(connie.queBebiste());
        System.out.println(connie.cuantoVuelto());
        System.out.print("\n");
        
        System.out.println("trini");
        Moneda nada = null;
        Maquina Maquina5 = new Maquina(coca, fanta, sprite,500, 10);
        Comprador trini = new Comprador(nada, 1, Maquina5);
        System.out.println(trini.queBebiste());
        System.out.println(trini.cuantoVuelto());
        System.out.print("\n");
       }
    }
    
