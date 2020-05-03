package virtual2;

import static org.junit.Assert.*;

import java.util.ArrayList;

import org.junit.Test;

import virtual.Producto;
import virtual.Usuario;
import virtual.listaProductos;

public class TestVirtual {

@Test
	
	public void test1() {
		
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
	
	public void test2() {
		
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
	
	public void test3() {
		
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
	
	public void test4() {
		listaProductos lista = new listaProductos();
		Producto productoEsperado = lista.getListaMovil().get(0);
		Producto productoObtenido = lista.sellecionarCompra(1);
		assertEquals(productoEsperado.getId(),productoObtenido.getId());
		
	}
	
	@Test
	
	public void test5() {
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
}
