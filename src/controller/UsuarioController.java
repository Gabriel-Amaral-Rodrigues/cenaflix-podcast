package controller;

import model.Usuario;

public class UsuarioController {

    public static Usuario autenticar(String login, String senha) {

        if (login.equals("admin") && senha.equals("123"))
            return new Usuario(login, senha, "ADMIN");

        if (login.equals("operador") && senha.equals("123"))
            return new Usuario(login, senha, "OPERADOR");

        if (login.equals("user") && senha.equals("123"))
            return new Usuario(login, senha, "USUARIO");

        return null;
    }
}