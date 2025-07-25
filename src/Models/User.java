package Models;

import exceptions.LibraryException;

public class User {

    private static int contadorId ;
    private final String id ;
    private  String usuario ;
    private  String nombre ;


    public User (String nombre, String usuario) throws LibraryException {

        if (nombre == null || nombre.trim().isEmpty()) {
            throw new LibraryException("El nombre no puede ser nulo o vacío.");
        }
        if (usuario == null || usuario.trim().isEmpty()) {
            throw new LibraryException("El usuario no puede ser nulo o vacío.");
        }

        this.id = String.valueOf(++User.contadorId);
        this.usuario = usuario;
        this.nombre = nombre;
    }

    public String getId() {
        return id;
    }

    public String getNombre() {
        return nombre;
    }
    public void setNombre(String nombre) throws LibraryException {
        if (nombre == null || nombre.trim().isEmpty()) {
            throw new LibraryException("El nombre no puede ser nulo o vacío.");
        }
        this.nombre = nombre;
    }

    public String getUsuario(){return usuario;}
    public void setUsuario(String usuario) throws LibraryException{
        if (usuario == null || usuario.trim().isEmpty()) {
            throw new LibraryException("El usuario no puede ser nulo o vacío.");
        }
        this.usuario = usuario;
    }
}
