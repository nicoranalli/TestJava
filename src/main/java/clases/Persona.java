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
    
    public void mostrarPersona(){
        System.out.println("Nombre: " + this.nombre + " Apellido: " + this.apellido);
    }
    public static void main(String[] args) {
        Persona persona1 = new Persona();
        persona1.nombre = "Nicolás";
        persona1.apellido = "Ranalli";
        
        persona1.mostrarPersona();
    }
}
