package com.example.a008_pasoparametrosv2.datos;

import com.example.a008_pasoparametrosv2.Usuario;

import java.util.ArrayList;

public class svData {
    private static Usuario usuario;
    private static ArrayList<Usuario> ListaUsuarios;
    public static Usuario getUsuario() {
        return usuario;
    }

    public static void setUsuario(Usuario usuario) {
        svData.usuario = usuario;
    }
}
