package tarea2;

public class Maquina {

    private Bebidas cocacola;
    private Bebidas fanta;
    private Bebidas sprite;
    public int vuelto;
    public int dineroIngresado;

    public Maquina(Bebidas Cocacola, Bebidas Fanta, Bebidas Sprite, int vuelto, int dineroIngresado) {
        this.cocacola = Cocacola;
        this.fanta = Fanta;
        this.sprite = Sprite;
        this.vuelto = vuelto;
        this.dineroIngresado = dineroIngresado;
    }

    private void PrecioBebidas(Bebidas a, int precio) {
        a.setPrecio(precio);
    }

    private void FijarStock(Bebidas a, int stock) {
        a.setNumDisponible(stock);
    }

    private void setVuelto(int vuelto) {
        this.vuelto = vuelto;
    }

    public void setDineroIngresado(int dineroIngresado) {
        this.dineroIngresado = dineroIngresado;
    }

    public Bebidas Comprar(int eleccion, Bebidas bebida) {
        switch (eleccion) {
            case 1:
                bebida = cocacola;
            case 2:
                bebida = fanta;
            case 3:
                bebida = sprite;

                return bebida;
        }
        try {
            if (bebida.precio < this.dineroIngresado && this.dineroIngresado > 0) {
                //excepcion
                vuelto = this.dineroIngresado;
                throw new PagoInsuficienteException("Pago insuficiente.");
            }
            if (bebida.numDisponible <= 0) {
                //excepcion
                vuelto = this.dineroIngresado;
                throw new NoHayBebidaException("No quedan bebidas");
            }
            if (dineroIngresado == 0) {
                //excepcion
                throw new PagoIncorrectoException("No se ingreso el dinero.");
            }
            catch (Exception e) {
            System.out.println(e.getMessage());
        }
        }
