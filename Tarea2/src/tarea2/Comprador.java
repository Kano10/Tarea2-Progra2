package tarea2;

public class Comprador {
    
    private int vuelto = 0;
    private String sabBebida;

    public Comprador(Moneda m, int numBebida, Maquina exp) {
        Bebidas b = exp.Comprar(m, numBebida);
        try{
        if (b != null) {
            sabBebida = b.beber();

            while (exp.Vuelto() != 0) {
                vuelto += 100;
            }

        } else {
            sabBebida = "nada";

            while (exp.Vuelto() != 0) {
                vuelto += 100;
            }
        }
        }catch(NoHayBebidaException | PagoIncorrectoException | PagoInsuficienteException e){
            System.out.println(e.getMessage());
        }
    }

    public int cuantoVuelto() {
        return vuelto;
    }

    public String queBebiste() {
        return sabBebida;
    }
}
