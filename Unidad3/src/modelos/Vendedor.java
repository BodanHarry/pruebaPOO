package modelos;

/**
 * @author hebod
 * @version 1.0
 * @created 22-nov-2022 3:48:10 PM
 */
public class Vendedor {

    private int codigo;
    private String nombres;
    private String apellidos;

    public Vendedor() {

    }

    public Vendedor(int codigo, String nombres, String apellidos) {
        this.codigo = codigo;
        this.nombres = nombres;
        this.apellidos = apellidos;
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public String getNombres() {
        return nombres;
    }

    public void setNombres(String nombres) {
        this.nombres = nombres;
    }

    public String getApellidos() {
        return apellidos;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    @Override
    public String toString() {
        return "Vendedor{" + "codigo=" + codigo + ", nombres=" + nombres + ", apellidos=" + apellidos + '}';
    }

    public void finalize() {

    }
}//end Vendedor
