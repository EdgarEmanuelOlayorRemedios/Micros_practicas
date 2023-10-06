package com.mx.irc.controller;

import com.mx.irc.models.Direccion;
import com.mx.irc.models.Producto;
import com.mx.irc.models.Respuesta;
import com.mx.irc.models.Usuario;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;


@RestController
@RequestMapping("api/")
public class DocumentsController {


//	@GetMapping("prueba")
//	public ResponseEntity<?> prueba() {
//		return ResponseEntity.ok("Hola mundo");
//	}

    @GetMapping("prueba")
    public ResponseEntity<?> prueba() {
        Respuesta respuesta = new Respuesta();
        respuesta.setUsuarios(crearUsuarios());
        respuesta.setProductos(crearProductos());

        return ResponseEntity.ok(respuesta);
    }

    // Métodos para crear datos de prueba...
    private List<Usuario> crearUsuarios() {
        // Crea y retorna una lista de usuarios
        List<Usuario> usuarios = new ArrayList<>();
        Usuario usuario1 = new Usuario(1);
        usuario1.setNombre("Juan Perez");
        usuario1.setEmail("juan.perez@example.com");
        usuario1.setEdad(25);
        // Configurar la dirección para el primer usuario
        Direccion direccion1 = new Direccion();
        direccion1.setCalle("Av. Siempre Viva");
        direccion1.setNumero("123");
        direccion1.setCiudad("Springfield");
        direccion1.setPais("USA");
        usuario1.setDireccion(direccion1);
        // Configurar lo hobbies para el primer usuario
        List<String> hobbies1 = Arrays.asList("futbol", "cine", "lectura");
        usuario1.setHobbies(hobbies1);
        usuarios.add(usuario1);
        // segundo usuario
        Usuario usuario2 = new Usuario(2);
        usuario2.setNombre("Amlo");
        usuario2.setEmail("amlo@gob.com.mx");
        usuario2.setEdad(70);
        Direccion direccion2 = new Direccion();
        direccion2.setCalle("imperio otomano");
        direccion2.setNumero("425");
        direccion2.setCiudad("GUAM");
        direccion2.setPais("Filipinas");
        usuario2.setDireccion(direccion2);
        List<String> hobbies2 = Arrays.asList("pajerse", "makanear", "mañaneras");
        usuario2.setHobbies(hobbies2);
        usuarios.add(usuario2);
        return usuarios;
    }

    private List<Producto> crearProductos() {
        // Crea y retorna una lista de productos
        List<Producto> productos = new ArrayList<>();
        // Crear y agregar el primer producto
        Producto producto1 = new Producto();
        producto1.setIdProducto(101);
        producto1.setNombreProducto("Laptop");
        producto1.setPrecio(1000);
        producto1.setCategoria("Electronica");
        producto1.setStock(50);
        productos.add(producto1);

        // Crear y agregar el segundo producto
        Producto producto2 = new Producto();
        producto2.setIdProducto(102);
        producto2.setNombreProducto("Refrigerador");
        producto2.setPrecio(800);
        producto2.setCategoria("Electrodomesticos");
        producto2.setStock(30);
        productos.add(producto2);

        // Crear y agregar el tercer producto
        Producto producto3 = new Producto();
        producto3.setIdProducto(103);
        producto3.setNombreProducto("Sofa");
        producto3.setPrecio(300);
        producto3.setCategoria("Muebles");
        producto3.setStock(20);
        productos.add(producto3);
        return productos;
    }

}
