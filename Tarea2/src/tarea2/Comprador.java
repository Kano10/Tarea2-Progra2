package tarea2;

public class Comprador {

    private int vuelto = 0;
    private String sabBebida;

    public Comprador(Moneda m, int numBebida, Expendedor exp) {
        Bebida bebida = exp.comprarBebida(m, numBebida);

        if (bebida != null) {
            sabBebida = bebida.beber();

            while (exp.getVuelto() != null) {
                vuelto += 100;
            }

        } else {
            sabBebida = "nada";

            Moneda devolucion = exp.getVuelto();
            if (devolucion != null) {
                vuelto += devolucion.getValor();
            }
        }
    }

    public int cuantoVuelto() {
        return vuelto;
    }

    public String queBebiste() {
        return sabBebida;
    }
}
