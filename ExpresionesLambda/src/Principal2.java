
public class Principal2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Operaciones suma = (n1,n2) -> n1 + n2;
		realiza(3, 2, suma, "suma");
		
		Operaciones resta = (n1,n2) -> n1 - n2;
		realiza(3, 2, resta, "resta");
		
		Operaciones multiplica = (n1,n2) -> n1 * n2;
		realiza(3, 2, multiplica, "multiplicación");
		
		Operaciones divide = (n1,n2) -> n1 / n2;
		realiza(3, 2, divide, "división");
		
	}

	public static void realiza(int numero1, int numero2, Operaciones operacion, String texto) {
		int resultado = operacion.suma(numero1, numero2);
		System.out.println("El resultado de la " + texto + " es:" + resultado);
	}
}

interface Operaciones{
	int suma(int numero1, int numero2);
	
	//String expresion(String texto);
}