package tienda;

public class Cliente {
	//atrb
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
