package gestionasistencia;

import cucumber.api.PendingException;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.When;
import cucumber.api.java.en.Then;
import cucumber.api.junit.Cucumber;
import gestionasistencia.model.Profesor;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
public class Stepdefs {
    //private String dni = "1234567A";
    //private gestionasistencia.model.Profesor profesor = new gestionasistencia.model.Profesor(dni);

    @Given("^Profe logado en el sistema$")
    public void profe_logado_en_el_sistema() {
        String dni = "12345678A";
        Profesor profesor = new Profesor(dni);
        profesor.setLogin(true);
        System.out.println(profesor.getDni() + " login " + profesor.isLogin());
    }

    @And("^Alumno logado en el sistema$")
    public void alumno_logado_en_el_sistema() {
        throw new PendingException();
    }

    @When("^Profe lista alumnos$")
    public void profe_lista_alumnos() {
        throw new PendingException();
    }

    @Then("^Mostrar alumno presente$")
    public void mostrar_alumno_presente() {
        throw new PendingException();
    }

    @Then("^Mostrar alumno no presente$")
    public void mostrarAlumnoNoPresente() throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        throw new PendingException();
    }
}