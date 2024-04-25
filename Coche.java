package coches;

public abstract class Coche {
	//Atrb
	//primer cambio en git
	protected boolean alquilado;
	protected String tipoCoche;
	protected int id;
	protected String matricula;
	protected int precio;
	protected String descripcion;
	protected int nPlazas;
	
	//getters y setters
	public void setAlquilado(boolean alquilado) {
		this.alquilado=alquilado;
	}
	public boolean getAlquilado() {
		return alquilado;
	}
	public void setTipoCoche(String tipoCoche) {
		this.tipoCoche=tipoCoche;
	}
	public String getTipoCoche() {
		return tipoCoche;
	}
	public void setId(int id) {
		this.id=id;
	}
	public int getId() {
		return id;
	}
	public void setMatricula(String matricula) {
		this.matricula=matricula;
	}
	public String getMatricula() {
		return matricula;
	}
	public void setPrecio(int precio) {
		this.precio=precio;
	}
	public int getPrecio() {
		return precio;
	}
	public void setDescripcion(String descripcion) {
		this.descripcion=descripcion;
	}
	public String getDescripcion() {
		return descripcion;
	}
	public void setNPlazas(int nPlazas) {
		this.nPlazas=nPlazas;
	}
	public int getNPlazas() {
		return nPlazas;
	}
	//metodo info
	public String getInfoCoche() {
		return "En alquiler: "+this.getAlquilado()+", matricula: "+this.getMatricula()+", id: "+this.getId()+", precio: "+this.getPrecio() ;
	}
}

