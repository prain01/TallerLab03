public class Producto {

    private int codigoProducto;
    private String tipoProducto;

    public Producto(int codigoProducto, String tipoProducto) {
        this.codigoProducto = codigoProducto;
        this.tipoProducto = tipoProducto;
    }

    public int getCodigoProducto() {
        return codigoProducto;
    }

    public String getTipoProducto() {
        return tipoProducto;
    }

}