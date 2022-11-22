package modelos;


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

	public Factura(){

	}

	public void finalize(){

	}

	/**
	 * 
	 * @param listaDeProductos
	 */
	public double calcTotal(List<Producto> listaDeProductos){
		return 0;
	}

	/**
	 * 
	 * @param total
	 * @param iva
	 */
	public double aplicarIVA(double total, double iva){
		return 0;
	}

	/**
	 * 
	 * @param total
	 * @param iva
	 */
	public double calcMonto(double total, double iva){
		return 0;
	}

	/**
	 * 
	 * @param producto
	 */
	public void agregarProducto(Producto producto){

	}
}//end Factura