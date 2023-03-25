package examenll_p2_oliveriraheta;

import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JProgressBar;

public class Hilo extends Thread {

    private JProgressBar jp;
    private Deporte depo;

    public Hilo(JProgressBar jp, Deporte depo) {
        this.jp = jp;
        this.depo = depo;
    }

    @Override
    public void run() {
        int tiempo = depo.getTorneos().size() * 7;
        jp.setMaximum(tiempo);
        int i = 0;
        while (i <= tiempo) {
            i++;
            jp.setValue(i);
            try {
                Thread.sleep(1000);
            } catch (InterruptedException ex) {
                Logger.getLogger(Hilo.class.getName()).log(Level.SEVERE, null, ex);
            }

        }
        JOptionPane.showMessageDialog(null,"Archivo guardado exitosamente");
        jp.setValue(0);
    }
}
