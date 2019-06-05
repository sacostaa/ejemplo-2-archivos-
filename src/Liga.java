/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Estudiante
 */
import java.util.*;
public class Liga {
    private String nombre;
    private ArrayList <Equipo> equipos;

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public ArrayList<Equipo> getEquipos() {
        return equipos;
    }

    public void setEquipos(ArrayList<Equipo> equipos) {
        this.equipos = equipos;
    }

    public Liga(String nombre) {
        this.nombre = nombre;
        this.equipos = new ArrayList <Equipo> ();
    }
    
    public  void addequipo (String nombre){
        equipos.add(new Equipo(nombre));
    }
    
    
}
