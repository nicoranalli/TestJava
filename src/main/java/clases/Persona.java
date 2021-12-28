/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package clases;


/**
 *
 * @author Nicolás
 */
public class Persona {
    String nombre;
    String apellido;
    
    public Persona(String nom, String ap){
        nombre = nom;
        apellido = ap;
    }

    public void mostrarPersona(){
        System.out.println(this.nombre + " " + this.apellido);
    }
    public static void main(String[] args) {
        Persona persona1 = new Persona("Nicolás", "Ranalli");
        persona1.mostrarPersona();
        
        
    }
}
