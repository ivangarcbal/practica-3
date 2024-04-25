package tienda;
import coches.*;
public class Tienda {
	//atrb
	private Coche [] cochesDisponibles;
	//constr
	public Tienda(Coche [] cochesDisponibles) {
		this.setCochesDisponibles(cochesDisponibles);
	}
	
	public Coche [] getCochesDisponibles() {
		return cochesDisponibles;
	}

	public void setCochesDisponibles(Coche [] cochesDisponibles) {
		this.cochesDisponibles = cochesDisponibles;
	}

	//metodo info
	public String verCochesTienda() {
        String resultado = "";
        
        // Iterar sobre el array de coches disponibles utilizando un bucle for estándar
        for (int i = 0; i < cochesDisponibles.length; i++) {
            Coche coche = cochesDisponibles[i];
            // Concatenar la información de cada coche
            resultado += coche.getInfoCoche() + "\n";
        }
        
        return resultado;
    }
}
