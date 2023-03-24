
package examenll_p2_oliveriraheta;

import java.io.Serializable;

public class Equipo implements Serializable{
    private String name;
    private int puntos;

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

    @Override
    public String toString() {
        return  name;
    }
    
    
}
