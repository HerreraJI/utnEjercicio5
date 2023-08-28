/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicio5;

import java.util.Scanner;

public class Persona {
    
    private String nombre;
    private String direccion;
    private String telefono;
    private char genero;
    private int dia;
    private int mes;
    private int anio;

    public Persona(String nombre, String direccion, String telefono, char genero, int dia, int mes, int anio) {
        this.nombre = nombre;
        this.direccion = direccion;
        this.telefono = telefono;
        this.genero = genero;
        this.dia = dia;
        this.mes = mes;
        this.anio = anio;
    }

    public Persona() {
    }
    
    public int obtenerEdad (int diaActual, int mesActual, int anioActual){
        int edad = 0;
        
        if (anio>anioActual){
            System.out.println("el anio no puede ser menor que el actual. No se puede usar metodo");
            return edad;
        }   
        edad = anioActual-anio;
        
        if (mesActual - mes<=0){
            edad = edad-1;
            
            if ((mesActual - mes==0)&&(diaActual-dia>=0))
                    edad++;                
        }   
            
        
        return edad;
    }
    
    public void datosString (){
        System.out.println("nombre: "+nombre+". Direccion: "+direccion+". Telefono: "+telefono+". Fecha de nacimiento: "+dia+"-"+mes+"-"+anio+".");

    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public char getGenero() {
        return genero;
    }

    public void setGenero(char genero) {
        this.genero = genero;
    }

    public int getDia() {
        return dia;
    }

    public void setDia(int dia) {
        this.dia = dia;
    }

    public int getMes() {
        return mes;
    }

    public void setMes(int mes) {
        this.mes = mes;
    }

    public int getAnio() {
        return anio;
    }

    public void setAnio(int anio) {
        this.anio = anio;
    }
    
    
    
    
    
    
}
