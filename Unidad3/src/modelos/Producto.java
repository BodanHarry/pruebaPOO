package modelos;

import java.util.ArrayList;

/**
 * @author hebod
 * @version 1.0
 * @created 22-nov-2022 3:48:08 PM
 */
public class Producto {

    private int codigo;
    private String nombre;
    private double precio;

    public Producto() {

    }

    public Producto(int codigo, String nombre, double precio) {
        this.codigo = codigo;
        this.nombre = nombre;
        this.precio = precio;
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    @Override
    public String toString() {
        return "Producto{" + "codigo=" + codigo + ", nombre=" + nombre + ", precio=" + precio + '}';
    }

    public void finalize() {

    }

    

    /**
     *
     * @param listaDeProductos
     */
    public double calcTotal(ArrayList<Producto> listaDeProductos) {
        return 0;
    }

    /**
     *
     * @param total
     * @param iva
     */
    public double aplicarIVA(double total, double iva) {
        return 0;
    }

    /**
     *
     * @param total
     * @param iva
     */
    public double calcMonto(double total, double iva) {
        return 0;
    }

    /**
     *
     * @param producto
     */
    public void agregarProducto(Producto producto) {

    }
}//end Producto
