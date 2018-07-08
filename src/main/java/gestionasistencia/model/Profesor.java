package gestionasistencia.model;

public class Profesor {
    private String dni;
    private boolean login;

    public Profesor(String dni) {
        this.dni = dni;
    }

    public void setLogin(boolean b) {
        this.login = b;
    }

    public String getDni() {
        return dni;
    }

    public boolean isLogin() {
        return login;
    }
}
