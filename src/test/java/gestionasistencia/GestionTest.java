package gestionasistencia;

import gestionasistencia.model.Profesor;
import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class GestionTest {

    private Profesor profesor;

    @Before
    public void setUp() {
        String dni = "12345678X";
        profesor = new Profesor(dni);
    }

    @Test
    public void testCrearProfesor() {
        //Profesor profe = new Profesor("11111111A");
        Assert.assertNotNull(profesor);
        Assert.assertEquals("12345678X",profesor.getDni());
    }

    @Test
    public void testLoginProfesor() {
        profesor.setLogin(true);
        boolean b = profesor.isLogin();
        Assert.assertTrue(b);
    }

    @After
    public void tearDown() {
        System.out.println("End");
    }
}
