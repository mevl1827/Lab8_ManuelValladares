/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab8_manuelvalladares;

import java.util.ArrayList;
import javafx.scene.control.ComboBox;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JComboBox;
import javax.swing.JTree;
import javax.swing.tree.DefaultTreeModel;

/**
 *
 * @author mevl1
 */
public class PROYECTO {
    private String nombre;
    private int duracion;
    private ArrayList<ACTIVIDADES> actividades;
    private JTree arbol;
    private DefaultComboBoxModel combo;
    private DefaultComboBoxModel combo2;
  private ArrayList<ACTIVIDADES> act;

    public PROYECTO(String nombre, int duracion, JTree arbol, DefaultComboBoxModel combo, DefaultComboBoxModel combo2) {
        this.nombre = nombre;
        this.duracion = duracion;
        this.arbol = arbol;
        this.combo = combo;
        this.combo2 = combo2;
        this.actividades=new ArrayList();
        this.act=new ArrayList();
    }
   

   

    public PROYECTO() {
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getDuracion() {
        return duracion;
    }

    public void setDuracion(int duracion) {
        this.duracion = duracion;
    }

    public ArrayList<ACTIVIDADES> getActividades() {
        return actividades;
    }

    public void setActividades(ArrayList<ACTIVIDADES> actividades) {
        this.actividades = actividades;
    }

    public JTree getArbol() {
        return arbol;
    }

    public void setArbol(JTree arbol) {
        this.arbol = arbol;
    }

    public DefaultComboBoxModel getCombo() {
        return combo;
    }

    public void setCombo(DefaultComboBoxModel combo) {
        this.combo = combo;
    }

    public DefaultComboBoxModel getCombo2() {
        return combo2;
    }

    public void setCombo2(DefaultComboBoxModel combo2) {
        this.combo2 = combo2;
    }

    public ArrayList<ACTIVIDADES> getAct() {
        return act;
    }

    public void setAct(ArrayList<ACTIVIDADES> act) {
        this.act = act;
    }

    
  

    @Override
    public String toString() {
        return  nombre ;
    }

   
}
