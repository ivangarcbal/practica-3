package coches;

public class Familiar extends Coche {
	public Familiar(int id, String matricula, int precio, int nPlazas) {
		this.id=id;
		this.setTipoCoche("Familiar");
		this.matricula=matricula;
		this.precio=precio;
		//this.descripcion=descripcion;
		this.nPlazas=nPlazas;
	}
	
	//metodo info
	@Override
	public String getInfoCoche() {
		return super.getInfoCoche()+", tipo coche: "+this.getTipoCoche()+", numero de plazas: "+this.getNPlazas();
	}
}
