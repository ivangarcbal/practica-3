package principal;
import coches.*;
import tienda.*;
public class TiendaMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Cliente cliente1 = new Cliente("Pedro", 878945123, "676841337");
		Coche [] cochesDisponibles = {
				new Turismo(1, "3730DFC", 20000, "Buen turismo"),	
				new Turismo(12, "3470DMC", 22000, "Buen turismo algo mas caro"),
				new Familiar(7, "4644TUI", 45161, 5),
				new Familiar(77, "7895WYR", 78451, 5),
				new Turismo(123, "4864JGD", 200000, "Buen turismo bien caro mucho caro"),	
				new Turismo(0011, "4597VWN", 45000, "Buen turismo, de lujillo"),
				new Familiar(78, "4845FEO", 19500, 7),
				new Familiar(17, "8985EWU", 77777, 4)
			};
		Tienda tienda = new Tienda(cochesDisponibles);
		
		System.out.println(tienda.verCochesTienda());
	}

}
