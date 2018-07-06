package cucumbertest;

import cucumber.api.PendingException;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.When;
import cucumber.api.java.en.Then;
import cucumber.api.junit.Cucumber;
import org.junit.runner.RunWith;

import static org.junit.Assert.*;

@RunWith(Cucumber.class)
public class Stepdefs {
    //private String dni = "1234567A";
    //private Profesor profesor = new Profesor(dni);

    @Given("^Profe logado en el sistema$")
    public void profe_logado_en_el_sistema() {
        String dni = "1234567A";
        Profesor profesor = new Profesor(dni);
        profesor.set_login(true);
        //throw new PendingException();
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
}