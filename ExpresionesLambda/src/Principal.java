
public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// Expresi�n lambda
		modificarCadena exclamacion = (t) -> "�" + t + "!";
		imprimir("Hola mundo", exclamacion);
		
		modificarCadena interrogacion = (t) -> "�" + t + "?";
		imprimir("C�mo te llames", interrogacion);
	}
	
	public static void imprimir(String texto, modificarCadena formato) {
		String mensaje = formato.ejecutar(texto);
		System.out.println(mensaje);
	}

}

//Interface
interface modificarCadena {
	String ejecutar(String ejecutar);
}