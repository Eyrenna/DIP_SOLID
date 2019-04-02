package org.lasencinas;

import org.junit.Assert;
import org.junit.Test;
import org.lasencinas.negocio.ControladorStock;
import org.lasencinas.negocio.InventarioBBDD;

public class ControladorStockTest {

    @Test
    public void test_control_estoc() {
        ControladorStock controlador = new ControladorStock(new InventarioBBDD());

        Assert.assertFalse(controlador.necesitaReponer("tienda norte", "mesa"));
        Assert.assertTrue(controlador.necesitaReponer("tienda norte", "lampara"));

    }

}

