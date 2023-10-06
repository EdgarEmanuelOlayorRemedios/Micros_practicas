package com.mx.irc.models;

import java.util.List;

public class Respuesta {
    private List<Usuario> usuarios;
    private List<Producto> productos;

    // getters y setters..

    public List<Usuario> getUsuarios() {
        return usuarios;
    }

    public void setUsuarios(List<Usuario> usuarios) {
        this.usuarios = usuarios;
    }

    public List<Producto> getProductos() {
        return productos;
    }

    public void setProductos(List<Producto> productos) {
        this.productos = productos;
    }
}
