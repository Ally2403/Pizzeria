/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package core.pedidos;

import core.Cliente;
import core.Item;
import java.util.ArrayList;

/**
 *
 * @author uninorte
 */
public class PedidoOnline extends Pedido{
    private String email;

    public PedidoOnline(Cliente cliente, String email, ArrayList<Item> items) {
        super(cliente, items);
        this.email = email;
    }
    
}
