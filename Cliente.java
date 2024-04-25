package tienda;

public class Cliente {
	//atrb
	//aqui pondre atributos de la clase cliente
	protected String nombre;
	protected int nTarjeta;
	protected String nTelefono;
	
	//constr
	public Cliente(String nombre, int nTarjeta, String nTelefono) {
		this.nombre=nombre;
		this.nTarjeta=nTarjeta;
		this.nTelefono=nTelefono;
	}
}
