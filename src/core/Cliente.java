/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package core;

import core.pedidos.Pedido;
import core.pedidos.PedidoOnline;
import java.util.ArrayList;
import java.util.HashMap;

/**
 *
 * @author uninorte
 */
public class Cliente {
    private String nombre;
    private ArrayList<Pedido> pedidos;

    public Cliente(String nombre) {
        this.nombre = nombre;
        this.pedidos = new ArrayList<>();
    }
    
    public boolean addPedido(Pedido pedido){
        if(!this.pedidos.contains(pedido)){
            pedidos.add(pedido);
            return true;
        }
        return false;
    }

    public String getNombre() {
        return nombre;
    }

    public ArrayList<Pedido> getPedidos() {
        return pedidos;
    }
    
}
