import java.util.ArrayList;

public class Pack {
    private ArrayList<Producto> productos;
    private int cantidadPaquetes;
    private int precioPack = 0;


    public Pack(int codigoProducto,String tipoProducto) {
        this.productos = añadirProducto(codigoProducto, tipoProducto);
        this.cantidadPaquetes = productos.size();
        this.precioPack = 5000 * cantidadPaquetes;
    }

    private ArrayList<Producto> añadirProducto(int codigoProducto, String tipoProducto){
        Producto p = new Producto(codigoProducto, tipoProducto);
        this.productos.add(p);
        return productos;
    }


    public ArrayList<Producto> productos() {
        return productos;
    }

    public void setProductos(ArrayList<Producto> productos) {
        this.productos = productos;
    }

    public int getCantidadPaquetes() {
        return cantidadPaquetes;
    }

    public void setCantidadPaquetes(int cantidadPaquetes) {
        this.cantidadPaquetes = cantidadPaquetes;
    }

    public int getPrecioPack() {
        return precioPack;
    }

    public void setPrecioPack(int precioPack) {
        this.precioPack = precioPack;
    }
}