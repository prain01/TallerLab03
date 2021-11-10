import java.util.*;

public class Flete {
    private int codigoFlete;
    private String descripcionFlete;
    private ArrayList<Pack> pack;

    public Flete(int codigoFlete, String descripcionFlete) {
        this.codigoFlete = codigoFlete;
        this.descripcionFlete = descripcionFlete;
        this.pack = pack;
    }

    public int getCodigoFlete() {
        return codigoFlete;
    }

    public void setCodigoFlete(int codigoFlete) {
        this.codigoFlete = codigoFlete;
    }

    public String getDescripcionFlete() {
        return descripcionFlete;
    }

    public void setDescripcionFlete(String descripcionFlete) {
        this.descripcionFlete = descripcionFlete;
    }

    public ArrayList<Pack> getPack() {
        return pack;
    }

    public void setPack(ArrayList<Pack> pack) {
        this.pack = pack;
    }
}