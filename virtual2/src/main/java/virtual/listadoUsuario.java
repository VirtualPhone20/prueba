package virtual;

import java.util.ArrayList;
import java.util.Iterator;



public class listadoUsuario {
	
	private ArrayList<Usuario> listadoRegistro;
	
	public listadoUsuario () {
		this.listadoRegistro = new ArrayList<Usuario>();
		
	}
	
	public void meterUsuario(String nombre, String contra, int tel,String correo ) {
		listadoRegistro.add(new Usuario(nombre, contra,tel,correo));
	}
	
	public void mostrarUsu () {
		
		Iterator it = listadoRegistro.iterator();
		
		while(it.hasNext()) {
			Usuario pp = (Usuario)it.next();
			System.out.println(pp.getDatos());
		}
	}
	
	// Verificar que el nobre de Usuario y la constraseña son correctos
	
	public boolean verificar(String nombre, String contra) {
		boolean verificado = false;
		Usuario n = null;
		
		for (int i = 0; i < listadoRegistro.size(); i++) {
			if(listadoRegistro.get(i).getNombre().equals(nombre) && listadoRegistro.get(i).getConstrasenya().equals(contra) ) {
				n = listadoRegistro.get(i);
				verificado = true;
			}

		}
		return verificado;
		
	}
	
	public boolean ValidarCorreo (String email) {
		int numArroba = 0;
		boolean verificarC = false;
		for (int i = 0; i < email.length(); i++) {
			if(email.charAt(i) == '@') {
				numArroba++;
			}
		}
		if(numArroba == 1) {
			return verificarC = true;
		}else
			return verificarC;
		
	}
	
	public boolean ValidarTelefonos(int tel) {
		
		int digitos = 0;
		boolean VerificarDigitos = false;

			while(tel> 0) {
				tel = tel/10;
				digitos++;
			}
			if(digitos == 9) {
				return VerificarDigitos = true;
				
			}else
				return VerificarDigitos;
		}
		
			
	}



