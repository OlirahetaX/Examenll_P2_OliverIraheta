
package examenll_p2_oliveriraheta;

import java.io.EOFException;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;



public class AdmDeportes {
    
    private ArrayList<Deporte> listaDeportes = new ArrayList();
    private File archivo = null;

    public AdmDeportes(String path) {
        this.archivo = new File(path);
    }

    public ArrayList<Deporte> getListaDeportes() {
        return listaDeportes;
    }

    public void setListaDeportes(ArrayList<Deporte> listaDeportes) {
        this.listaDeportes = listaDeportes;
    }

    public File getArchivo() {
        return archivo;
    }

    public void setArchivo(File archivo) {
        this.archivo = archivo;
    }
    
     public void cargarArchivo() {
        try {            
            listaDeportes = new ArrayList();
            Deporte temp;
            if (archivo.exists()) {
                FileInputStream entrada = new FileInputStream(archivo);
                ObjectInputStream objeto = new ObjectInputStream(entrada);
                try {
                    while ((temp = (Deporte) objeto.readObject()) != null) {
                        listaDeportes.add(temp);
                    }
                } catch (EOFException e) {
                    //encontro el final del archivo
                }
                objeto.close();
                entrada.close();
            }            
        } catch (IOException | ClassNotFoundException ex) {
            ex.printStackTrace();
        }
    }

    public void escribirArchivo() {
        FileOutputStream fw = null;
        ObjectOutputStream bw = null;
        try {
            fw = new FileOutputStream(archivo);
            bw = new ObjectOutputStream(fw);
            for (Deporte t : listaDeportes) {
                bw.writeObject(t);
            }
            bw.flush();
        } catch (IOException ex) {
        } finally {
            try {
                bw.close();
                fw.close();
            } catch (IOException ex) {
            }
        }
    }
}
