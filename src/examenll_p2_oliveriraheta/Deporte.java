
package examenll_p2_oliveriraheta;

import java.io.Serializable;
import java.util.ArrayList;

public class Deporte implements Serializable{
    private ArrayList<Torneo> torneos = new ArrayList<>();
    private String name;

    public Deporte(String name) {
        this.name = name;
    }

    public ArrayList<Torneo> getTorneos() {
        return torneos;
    }

    public void setTorneos(ArrayList<Torneo> torneos) {
        this.torneos = torneos;
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void addTorneo(Torneo e){
        this.torneos.add(e);
    }
    @Override
    public String toString() {
        return  name;
    }
    
}
