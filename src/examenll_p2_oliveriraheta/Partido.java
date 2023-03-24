
package examenll_p2_oliveriraheta;

import java.io.Serializable;


public class Partido implements Serializable{
    private Equipo[] equipos = new Equipo[2];
    private Integer[] resultados = new Integer[2];

    public Partido() {
    }

    public Equipo[] getEquipos() {
        return equipos;
    }

    public void setEquipos(Equipo[] equipos) {
        this.equipos = equipos;
    }

    public Integer[] getResultados() {
        return resultados;
    }

    public void setResultados(Integer[] resultados) {
        this.resultados = resultados;
    }

    @Override
    public String toString() {
        return equipos[0].toString()+" "+resultados[0].toString()+" - "+equipos[1].toString()+" "+resultados[1].toString();
    }
    
}
