package virtual;
import java.util.*;


public class clasePrincipal {
	static listaProductos lista = new listaProductos();
	static Scanner entrada = new Scanner(System.in);
	static listadoUsuario usuario1 = new listadoUsuario();
	static Producto p;
	static ticket tick = new ticket();
	
	public static void main(String[] args) {
	
		mostrarMenu();
	}
	
	public static void mostrarMenu() {
		int opcion;
		
		do {
		System.out.println("1.-Registrarse");
		//  Para adquirir o ver algun producto es necesario Iniciar sesion y para iniciar sesion es 
		//  necesario estar registrado
		System.out.println("2.-Iniciar sesión");
		System.out.println("3.-Salir");
		opcion=entrada.nextInt();
		// Cuando se quiera parar la ejecucion de programa pulsar 3.
		switch (opcion) {
		case 1:
			
			case1();
			
			break;
			
			
			
		case 2:
			
			// Introducir el nombre de usuario y contraseña anteriores
			System.out.println("Nombre de Usuario");
			String nombreV = entrada.nextLine();
			if(nombreV.isEmpty()) {
				nombreV = entrada.nextLine();
			}
			
			System.out.println("Constraseña");
			String contraV = entrada.nextLine();	
			
			boolean comprobar = usuario1.verificar(nombreV, contraV);
			if(comprobar == true) {
				System.out.println("Constraseña correcta.");
				
				lista.mostrarTelefonos();
				
				System.out.println("¿Cuántos productos quieres comprar?");
				int numProductos = entrada.nextInt();
				
				while (numProductos > 0) {
					
					System.out.println("Selecciona el Id del producto que quieras comprar.");
					int idProducto = entrada.nextInt();
					p = lista.sellecionarCompra(idProducto); 
					
					tick.anyadirproducto(p);
					
					
					numProductos--;
				}
				tick.mostrarTelefonoComprado();
			}
			else {
				System.out.println("ERROR, introduzca correctamente la contraseña y nombre de usuario");
			}
			


			break;
			
		case 3:
			
			// Parar la ejecucion del programa
			
			System.exit(0);
			
			break;
			
			
		default: 
			
			System.out.println("Introduce solo numeros: 1-3");
			
			break;
			
			}

		
		} while(opcion >=1 || opcion <=3 );
		
	}

	public static void case1() {
		int cont = 0;		// Cntidad de Usuarios
		while(1 > cont) {
			
			// Crear una cuenta que es almacenada en un Arraylist
			
			System.out.println("Nombre de usuario");
			String nombre = entrada.nextLine();
			if(nombre.isEmpty()) {
				nombre = entrada.nextLine();
			}
			
			System.out.println("Contraseña");
			String contra = entrada.nextLine();
			
			System.out.println("Número de teléfono");
			int tel = entrada.nextInt();
			
			System.out.println("Correo electrónico");
			String correo = entrada.nextLine();
			if(correo.isEmpty()) {
				correo = entrada.nextLine();
			}
			
			usuario1.meterUsuario(nombre, contra, tel, correo);
			cont ++;
		}
		
		usuario1.mostrarUsu();
	}

}
