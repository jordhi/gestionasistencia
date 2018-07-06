package gestionasistencia;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class GestionTest {

    @Before
    public void setUp() {
        System.out.println("init");
    }

    @Test
    public void creacionInstanciaGestor() {
        Gestion g = new Gestion();
        assert g != null;
    }

    @After
    public void tearDown() {
        System.out.println("End");
    }
}
