public class Gasto {
    private int valor;
    private String producto;
    private boolean pagado;

    Gasto(String producto, int valor, boolean pagado){
        this.producto= producto;
        this.valor= valor;
        this.pagado= pagado;
    }

    public int getValor() {
        return valor;
    }
}
