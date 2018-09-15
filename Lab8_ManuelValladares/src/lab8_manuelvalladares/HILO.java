/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab8_manuelvalladares;

import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author mevl1
 */
public class HILO extends Thread{
        private ACTIVIDADES act;
    private boolean avanzar;
    private boolean vive;
    private float inicio;
    private JTable T;
    public String estado = "";
    private int pos;

    public HILO(ACTIVIDADES act, JTable T, int pos) {
        this.act = act;
        this.avanzar = true;
        this.vive = true;
        inicio = 0;
        this.estado = "En Espera.";
        this.T = T;
        this.pos = pos;
    }

    public ACTIVIDADES getAct() {
        return act;
    }

    public void setAct(ACTIVIDADES act) {
        this.act = act;
    }

    public boolean isAvanzar() {
        return avanzar;
    }

    public void setAvanzar(boolean avanzar) {
        this.avanzar = avanzar;
    }

    public boolean isVive() {
        return vive;
    }

    public void setVive(boolean vive) {
        this.vive = vive;
    }

    @Override
    public void run() {
        DefaultTableModel m = (DefaultTableModel) T.getModel();

        while (vive) {
            if (avanzar) {
                while (inicio < act.getFinal_temprano()) {
                    estado = "Ejecutando...";
                    m.setValueAt(estado, pos, 2);
                    T.setModel(m);
                    inicio += 0.001;
                    System.out.println(inicio);
                }
                estado = "Completado.";
                m.setValueAt(estado, pos, 2);
                T.setModel(m);
                ++pos;
                vive = false;
                stop();
            }
            try {
                Thread.sleep(2000);
            } catch (InterruptedException ex) {
            }
        }

    }

}
