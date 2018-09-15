/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab8_manuelvalladares;

import java.util.ArrayList;

/**
 *
 * @author mevl1
 */
public class ACTIVIDADES {
    private String nombre;
    private int inicio_temprano;
    private int duracion;
    private int final_temprano;
    private ArrayList <ACTIVIDADES> actividades_predecesoras;
    private ArrayList <ACTIVIDADES> actividades_sucesoras;
    private int retraso;
    private PROYECTO papa;

   

    public ACTIVIDADES() {
    }

    public ACTIVIDADES(String nombre, int inicio_temprano, int duracion, int final_temprano, int retraso, PROYECTO papa) {
        this.nombre = nombre;
        this.inicio_temprano = inicio_temprano;
        this.duracion = duracion;
        this.final_temprano = final_temprano;
        this.retraso = retraso;
        this.papa = papa;
        this.actividades_predecesoras=new ArrayList();
        this.actividades_sucesoras=new ArrayList();
    }

   

  


    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getInicio_temprano() {
        return inicio_temprano;
    }

    public void setInicio_temprano(int inicio_temprano) {
        this.inicio_temprano = inicio_temprano;
    }

    public int getDuracion() {
        return duracion;
    }

    public void setDuracion(int duracion) {
        this.duracion = duracion;
    }

    public int getFinal_temprano() {
        return final_temprano;
    }

    public void setFinal_temprano(int final_temprano) {
        this.final_temprano = final_temprano;
    }

    public ArrayList<ACTIVIDADES> getActividades_predecesoras() {
        return actividades_predecesoras;
    }

    public void setActividades_predecesoras(ArrayList<ACTIVIDADES> actividades_predecesoras) {
        this.actividades_predecesoras = actividades_predecesoras;
    }

    public ArrayList<ACTIVIDADES> getActividades_sucesoras() {
        return actividades_sucesoras;
    }

    public void setActividades_sucesoras(ArrayList<ACTIVIDADES> actividades_sucesoras) {
        this.actividades_sucesoras = actividades_sucesoras;
    }

    public int getRetraso() {
        return retraso;
    }

    public void setRetraso(int retraso) {
        this.retraso = retraso;
    }

    
   

    @Override
    public String toString() {
        return  nombre ;
    }
    
    
}
