/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package core;

/**
 *
 * @author uninorte
 */
public class Item {
    private static int idCount = 0;
    private int id;
    private String nombre;
    private int valor;

    public Item(String nombre, int valor) {
        this.id = Item.idCount;
        this.nombre = nombre;
        this.valor = valor;
        
        Item.idCount++;
    }

    public int getId() {
        return id;
    }

    public String getNombre() {
        return nombre;
    }
    
}
