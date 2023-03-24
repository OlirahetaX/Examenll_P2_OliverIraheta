
package examenll_p2_oliveriraheta;

import java.io.Serializable;
import java.util.ArrayList;


public class Torneo implements Serializable{
    private String name;
    private String periodo;
    private ArrayList<Equipo>Equipos = new ArrayList<>();
    private ArrayList<Partido>partidos = new ArrayList<>();

    public Torneo(String name, String periodo) {
        this.name = name;
        this.periodo = periodo;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPeriodo() {
        return periodo;
    }

    public void setPeriodo(String periodo) {
        this.periodo = periodo;
    }

    public ArrayList<Equipo> getEquipos() {
        return Equipos;
    }

    public void setEquipos(ArrayList<Equipo> Equipos) {
        this.Equipos = Equipos;
    }

    public ArrayList<Partido> getPartidos() {
        return partidos;
    }

    public void setPartidos(ArrayList<Partido> partidos) {
        this.partidos = partidos;
    }

    public void addEquipos(Equipo e){
        this.Equipos.add(e);
    }
     public void addParidos(Partido e){
        this.partidos.add(e);
    }

    @Override
    public String toString() {
        return name;
    }
    
}
