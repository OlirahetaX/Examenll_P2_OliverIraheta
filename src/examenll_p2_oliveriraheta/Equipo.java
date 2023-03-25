
package examenll_p2_oliveriraheta;

import java.io.Serializable;
import java.util.ArrayList;

public class Equipo implements Serializable{
    private String name;
    private int puntos;
    private ArrayList<Partido>partidos = new ArrayList<>();

    public Equipo(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getPuntos() {
        return puntos;
    }

    public void setPuntos(int puntos) {
        this.puntos = puntos;
    }
    public void addPuntos(int puntos){
        this.puntos+=puntos;
    }

    public ArrayList<Partido> getPartidos() {
        return partidos;
    }

    public void setPartidos(ArrayList<Partido> partidos) {
        this.partidos = partidos;
    }
    public void addPartido(Partido p ){
        this.partidos.add(p);
    }
    

    @Override
    public String toString() {
        return  name;
    }
    
    
}
