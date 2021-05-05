import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class FraccionesTest {

    private Fracciones fraccion;

    @Before
    public void before(){
        this.fraccion = new Fracciones(4,8);
    }


    @Test
    public void getSubtract() {
        assertEquals(-4,this.fraccion.getSubtract() );
    }
}