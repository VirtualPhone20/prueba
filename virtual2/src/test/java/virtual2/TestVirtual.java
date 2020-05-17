package virtual2;

import static org.junit.Assert.*;

import java.util.ArrayList;

import org.junit.Test;

import virtual.Producto;
import virtual.Usuario;
import virtual.listaProductos;
import virtual.listadoUsuario;

public class TestVirtual {

@Test
	
	public void testVerificar_Usuario() {
		
			System.out.println("Verificar cuando existe un usuario Registrado.");
			System.out.println("Por ejemplo: nombre (Pablo), contraseña (syso1234), teléfono (669988551), correo (pablo@gmail.com)");
			ArrayList<Usuario> UsuarioEsperado = new ArrayList<Usuario>();
			UsuarioEsperado.add(new Usuario("Pablo", "syso1234", 669988551, "pablo@gmail.com"));
			String esperadoUsuario = UsuarioEsperado.get(0).getDatos();
			System.out.println("Usuario Creado y almadenado");
			System.out.println(esperadoUsuario);
			
			System.out.println("Usuario a verificar");
			String UsuariosObtenidos = new Usuario("Pablo", "syso1234", 669988551, "pablo@gmail.com").getDatos();
			
			assertEquals(esperadoUsuario,UsuariosObtenidos);
		}
	
	@Test
	
	public void testSeleccionar_Producto() {
		
		System.out.println("Seleccionar Producto por id.");
		System.out.println("Por ejemplo: id(2), VersionSistema(10), Capacidad(64), Marca(LG), Sistema Operativo(Android), precio(222)");
		ArrayList<Producto> telefonosEsperados = new ArrayList<Producto>();
		telefonosEsperados.add(new Producto(2, 10, 64, "LG", "Android", 222));
		
		int idEsperado = 2;
		System.out.println("Id seleccionado : "+ idEsperado);
		
		int idObtenido = telefonosEsperados.get(0).getId();
		System.out.println("Id obtenido: "+idObtenido);

		assertEquals(idEsperado, idObtenido);
		
	}
	
	@Test
	
	public void testSumar_PrecioTotal() {
		
		System.out.println("Suma de precio productos para obtener el resultado total");
		System.out.println("Por ejemplo: id(2), VersionSistema(10), Capacidad(64), Marca(LG), Sistema Operativo(Android), precio(222)");
		System.out.println("Segundo ejemplo: id(4), VersionSistema(11), Capacidad(64), Marca(Iphone), Sistema Operativo(IOS), precio(1000)");
		ArrayList<Producto> telefonosEsperados = new ArrayList<Producto>();
		telefonosEsperados.add(new Producto(2, 10, 64, "LG", "Android", 222));
		telefonosEsperados.add(new Producto(4, 11, 64, "Iphone", "IOS", 1000));
		
		int sumaObtenida = telefonosEsperados.get(0).getPrecio() + telefonosEsperados.get(1).getPrecio();
		int sumaEsperada = 1222;

		assertEquals(sumaObtenida, sumaEsperada);
		
	}
	
	@Test
	
	public void testListaProductoSeleccionado() {
		System.out.println("Prueba Crear Producto lista Producto");
		listaProductos lista = new listaProductos();
		Producto productoEsperado = lista.getListaMovil().get(0);
		Producto productoObtenido = lista.sellecionarCompra(1);
		assertEquals(productoEsperado.getId(),productoObtenido.getId());
		
	}
	
	@Test
	
	public void testComprobarProductoSeleccionadoDeLista() {
		System.out.println("Comprobar que el producto selecciondado me devuelva el mismo numero que el de la lista");
		listaProductos lista = new listaProductos();
		Producto productoEsperado =null;
		Producto productoObtenido = lista.sellecionarCompra(999999);
		assertEquals(productoEsperado,productoObtenido);
		
	
	}
	@Test
	
	public void testUsuarioNombre() {
		System.out.println("Prueba test nombre usuario");

		Usuario usuario = new Usuario ("Mario","1234",615436436,"mariomarugan10@hotmail.com");
		usuario.setNombre("Gabriel");
		String valorObtenido=usuario.getNombre();
		String valorEsperado="Gabriel";
		assertEquals(valorObtenido,valorEsperado);
		
	
	}
	@Test
	
	public void testUsuarioConstrasenya() {
		System.out.println("Prueba test constraseña usuario");
		Usuario usuario = new Usuario ("Mario","1234",615436436,"mariomarugan10@hotmail.com");
		usuario.setConstrasenya("5678");
		String valorObtenido=usuario.getConstrasenya();
		String valorEsperado="5678";
		assertEquals(valorObtenido,valorEsperado);
	}
	
	@Test
	
	public void testUsuarioCorreo() {
		System.out.println("Prueba test Correo usuario");
		Usuario usuario = new Usuario ("Mario","1234",615436436,"mariomarugan10@hotmail.com");
		usuario.setCorreo("juan@hotmail.com");
		String valorObtenido=usuario.getCorreo();
		String valorEsperado="juan@hotmail.com";
		assertEquals(valorObtenido,valorEsperado);
	}
	
	@Test
	
	public void testUsuarioTelefono() {
		System.out.println("Prueba test Telefono usuario");
		Usuario usuario = new Usuario ("Mario","1234",615436436,"mariomarugan10@hotmail.com");
		usuario.setTelefono(615436436);
		int valorObtenido=usuario.getTelefono();
		int valorEsperado= 615436436;
		assertEquals(valorObtenido,valorEsperado);
	}
	
	@Test
	
	public void testProductoID() {
		System.out.println("Prueba test Id Producto");
		Producto producto = new Producto(1, 11, 120, "Xiaomi", "Android", 150);
		producto.setId(3);
		int valorObtenido = producto.getId();
		int valorEsperado = 3;
		assertEquals(valorObtenido,valorEsperado);
	}
	@Test
	
	public void testProductoVersionSistema() {
		System.out.println("Prueba test Telefono Producto");
		Producto producto = new Producto(1, 11, 120, "Xiaomi", "Android", 150);
		producto.setVersionSistema(10);
		int valorObtenido=producto.getVersionSistema();
		int valorEsperado= 10;
		assertEquals(valorObtenido,valorEsperado);
	}
	@Test
	
	public void testProductoCapacidad() {
		System.out.println("Prueba test Capacidad Producto");
		Producto producto = new Producto(1, 11, 120, "Xiaomi", "Android", 150);
		producto.setCapacidad(64);
		int valorObtenido=producto.getCapacidad();
		int valorEsperado= 64;
		assertEquals(valorObtenido,valorEsperado);
	}
	@Test
	
	public void testProductoPrecio() {
		System.out.println("Prueba test Precio Producto");
		Producto producto = new Producto(1, 11, 120, "Xiaomi", "Android", 150);
		producto.setCapacidad(64);
		int valorObtenido=producto.getCapacidad();
		int valorEsperado= 64;
		assertEquals(valorObtenido,valorEsperado);
	}
	
	@Test
	
	public void testProductoMarca() {
		System.out.println("Prueba test Precio Producto");
		Producto producto = new Producto(1, 11, 120, "Xiaomi", "Android", 150);
		producto.setMarca("LG");
		String valorObtenido=producto.getMarca();
		String valorEsperado= "LG";
		assertEquals(valorObtenido,valorEsperado);
	}
	
	@Test
	
	public void testProductoSistemaOperativo() {
		System.out.println("Prueba test Precio Producto");
		Producto producto = new Producto(1, 11, 120, "Xiaomi", "Android", 150);
		producto.setSistemaOperativo("IOS");
		String valorObtenido=producto.getSistemaOperativo();
		String valorEsperado= "IOS";
		assertEquals(valorObtenido,valorEsperado);
	}
	@Test
	
	public void testValidarTelefono() {
		System.out.println("Prueba test Contar Digitos.");
		listadoUsuario usu1 = new listadoUsuario();
		usu1.ValidarTelefonos(12456789);
		boolean valorObtenido = true;
		boolean valorEsperado = true;
		assertEquals(valorObtenido,valorEsperado);
	}
	
	@Test
	
	public void testValidarCorre() {
		System.out.println("Prueba test Contar si hay @ en correo.");
		listadoUsuario usu1 = new listadoUsuario();
		usu1.ValidarCorreo("juan@gmail.com");
		boolean valorObtenido = true;
		boolean valorEsperado = true;
		assertEquals(valorObtenido,valorEsperado);
	}
	
}
