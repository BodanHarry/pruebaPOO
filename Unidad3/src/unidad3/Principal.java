/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package unidad3;

import modelos.Cliente;
import modelos.Factura;
import modelos.Producto;
import modelos.Vendedor;

/**
 *
 * @author hebod
 */
public class Principal {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Producto teclado = new Producto(1, "Teclado", 10.00);
        Producto mouse = new Producto(2, "Mouse", 5);
        Producto condon = new Producto(3, "Condon", 10);
        Producto gaseosa = new Producto(4, "Gaseosa", 15);
        Vendedor vendedor = new Vendedor(1, "Oscar Danilo", "Bonilla Canales");
        Cliente cliente = new Cliente(1, "Filadelfo", "Lacayo", "Masaya", "12345678", "filadelfo@gmail.com");
        Factura factura =  new Factura(1,"11/11/2021" , teclado, vendedor, cliente);
        System.out.println(factura);
        
    }   
    
    
}
