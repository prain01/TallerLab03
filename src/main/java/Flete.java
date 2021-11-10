import java.util.*;

public class Flete {
    private int codigoFlete;

    private int cantidadPack;
    private ArrayList<Pack> pack;

    public Flete(int codigoFlete, String descripcionFlete) {
        pack = añadirPack(codigoFlete, descripcionFlete);
        this.cantidadPack = pack.size();
    }

    private ArrayList<Pack> añadirPack(int codigoFlete, String descripcionFlete) {
        Pack pa = new Pack(codigoFlete, descripcionFlete);
        this.pack.add(pa);
        return pack;
    }

    public int getCodigoFlete() {
        return codigoFlete;
    }

    public void setCodigoFlete(int codigoFlete) {
        this.codigoFlete = codigoFlete;
    }
}