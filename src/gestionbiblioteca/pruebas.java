/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package gestionbiblioteca;

/**
 *
 * @author Nelson
 */
public class pruebas {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        clienteDB c1=new clienteDB();
        cliente a1=new cliente("nelson", "san juan", "12345678", "3035-80917-0110");
        c1.agregar(a1);
        
    }
    
}
