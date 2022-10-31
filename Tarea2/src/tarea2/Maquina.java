package tarea2;

public class Maquina {

    private CocaCola coca;
    private Fanta fanta;
    private Sprite sprite;
    public int vuelto;
    public int dineroIngresado;
    public int precio;

    public Maquina(CocaCola coca, Fanta fanta, Sprite sprite, int vuelto, int dineroIngresado, int precio) {
        this.coca = coca;
        this.fanta = fanta;
        this.sprite = sprite;
        this.vuelto = vuelto;
        this.dineroIngresado = dineroIngresado;
        this.precio = precio;
    }



    private void PrecioBebidas(Bebidas a, int precio) {
        a.setPrecio(precio);
    }

    private void FijarStock(Bebidas a, int stock) {
        a.setNumDisponible(stock);
    }

    public void setDineroIngresado(int dineroIngresado) {
        this.dineroIngresado = dineroIngresado;
    }

    public Bebidas Comprar(Moneda m,int eleccion) throws NoHayBebidaException, PagoIncorrectoException, PagoInsuficienteException {
        dineroIngresado=m.getValor();
        Bebidas bebida;
        switch (eleccion) {
            case 1:
                bebida = new CocaCola();
                this.vuelto= this.dineroIngresado-precio;
                return bebida;
                break;
            case 2:
                bebida = new Fanta();
                this.vuelto= dineroIngresado-precio;
                return bebida;
                break;
            case 3:
                bebida= new Sprite();
                this.vuelto= dineroIngresado-precio;
                return bebida;
                break;
            default:
                bebida=null;
                return bebida;
        }
            if (precio < this.dineroIngresado && this.dineroIngresado > 0) {
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
}
        public int Vuelto(){
           if(vuelto==0){
               return 0;
           }else{
               return 100;
           }
        }
    }
