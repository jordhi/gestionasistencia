package gestionasistencia.model;

public class Profesor {
    private String dni;
    private boolean login;

    public Profesor(String dni) {
        this.dni = dni;
    }

    public void set_login(boolean b) {
        this.login = b;
    }
}
