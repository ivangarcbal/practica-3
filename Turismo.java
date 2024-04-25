package coches;

public class Turismo extends Coche {
	public Turismo(int id, String matricula, int precio, String descripcion) {
		this.id=id;
		this.setTipoCoche("Turismo");
		this.matricula=matricula;
		this.precio=precio;
		this.descripcion=descripcion;
		//this.nPlazas=nPlazas;
	}
	
	//metodo info
	@Override
	public String getInfoCoche() {
		return super.getInfoCoche()+", tipo coche: "+this.getTipoCoche()+", descripcion: "+this.getDescripcion();
	}
}
