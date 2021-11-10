import java.util.ArrayList;

public class Camion {

    private int codigoCamion;
    private String patente;
    private String descripcion;
    private boolean estadoServicio;
    private int valorEmbarque;

    public Camion(int codigoCamion, String patente, String descripcion, boolean estadoServicio, int valorEmbarque) {
        this.codigoCamion = codigoCamion;
        this.patente = patente;
        this.descripcion = descripcion;
        this.estadoServicio = estadoServicio;
        this.valorEmbarque = valorEmbarque;
    }
/*
    private int asignarValorEmbarque(){


        return valor;
    }
 */

}
