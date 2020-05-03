package virtual;

import java.util.*;


public class Usuario {

		private String nombre;
		private String constrasenya;
		private String correo;
		private int telefono;
		public Usuario(String nombre,String constrasenya,int telefono, String correo ) {
				
				this.nombre = nombre;
				this.constrasenya = constrasenya;
				this.telefono = telefono;
				this.correo = correo;
				
			}

			public String getNombre() {
				return nombre;
			}
			public void setNombre(String nombre) {
				this.nombre = nombre;
			}
			public String getConstrasenya() {
				return constrasenya;
			}
			public void setConstrasenya(String constrasenya) {
				this.constrasenya = constrasenya;
			}
			public String getCorreo() {
				return this.correo;
			}
			public void setCorreo(String correo) {
				this.correo = correo;
			}
			public int getTelefono() {
				return this.telefono;
			}
			public void setTelefono(int tel) {
				this.telefono = tel;
			}
			public String getDatos() {
				return "Datos registrados [nombre=" + nombre + ", constrasenya=" + constrasenya + ", correo=" + correo
						+ ", telefono=" + telefono + "]";
			}
	
		
		

}

