package modelos;

import java.util.ArrayList;

/**
 * @author hebod
 * @version 1.0
 * @created 22-nov-2022 3:48:07 PM
 */
public class Factura {

    private int codigo;
    private String fecha;
    private Producto m_Producto;
    private Vendedor m_Vendedor;
    private Cliente m_Cliente;

    public Factura() {

    }

    public Factura(int codigo, String fecha, Producto m_Producto, Vendedor m_Vendedor, Cliente m_Cliente) {
        this.codigo = codigo;
        this.fecha = fecha;
        this.m_Producto = m_Producto;
        this.m_Vendedor = m_Vendedor;
        this.m_Cliente = m_Cliente;
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public String getFecha() {
        return fecha;
    }

    public void setFecha(String fecha) {
        this.fecha = fecha;
    }

    public Producto getM_Producto() {
        return m_Producto;
    }

    public void setM_Producto(Producto m_Producto) {
        this.m_Producto = m_Producto;
    }

    public Vendedor getM_Vendedor() {
        return m_Vendedor;
    }

    public void setM_Vendedor(Vendedor m_Vendedor) {
        this.m_Vendedor = m_Vendedor;
    }

    public Cliente getM_Cliente() {
        return m_Cliente;
    }

    public void setM_Cliente(Cliente m_Cliente) {
        this.m_Cliente = m_Cliente;
    }

    @Override
    public String toString() {
        return "Factura{" + "codigo=" + codigo + ", fecha=" + fecha + ", m_Producto=" + m_Producto + ", m_Vendedor=" + m_Vendedor + ", m_Cliente=" + m_Cliente + '}';
    }

    public void finalize() {

    }

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
}//end Factura
