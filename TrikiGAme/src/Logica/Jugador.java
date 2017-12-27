/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Logica;

/**
 *
 * @author Jhon Alex
 */
public class Jugador {
 
    private String nombre;
    private int partidasGanadas;
    private String simbol;

    public Jugador() {
    }

    public Jugador(String nombre, int partidasGanadas, String simbol) {
        this.nombre = nombre;
        this.partidasGanadas = partidasGanadas;
        this.simbol = simbol;
    }

    public String getSimbol() {
        return simbol;
    }

    public void setSimbol(String simbol) {
        this.simbol = simbol;
    }



    public String getNombre() {
        return nombre;
    }
    
    


    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getPartidasGanadas() {
        return partidasGanadas;
    }

    public void setPartidasGanadas(int partidasGanadas) {
        this.partidasGanadas = partidasGanadas;
    }
    
    
    
    public void incrementMarcador (){
        partidasGanadas++;
    }
    
    

    @Override
    public String toString() {
        return nombre ;
    }
    
    
    
    
}
