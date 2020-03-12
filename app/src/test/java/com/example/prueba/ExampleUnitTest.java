package com.example.prueba;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Example local unit test, which will execute on the development machine (host).
 *
 * @see <a href="http://d.android.com/tools/testing">Testing documentation</a>
 */
public class ExampleUnitTest {

    @Test
    public void addition_isCorrect() {
        assertEquals(4, 2 + 2);
    }

    private static MainActivity mainActivity=null;

    public static MainActivity getInstance(){
        if(mainActivity==null){
            mainActivity = new MainActivity();
        }
        return mainActivity;
    }

    @Test
    public void compareText(){
        Assert.assertEquals(6,mainActivity.onClickRegistrar());
    }



    //se probara el metodo booleano que confirma si un string recibido es cero.
    @Test
    public void isZero() {
        //caso normal
        assertTrue(mainActivity.isZero("0"));
        // varios ceros
        assertTrue(mainActivity.isZero("0000"));
        //numero diferente de 0
        assertFalse(mainActivity.isZero("011"));
        //letras
        assertFalse(mainActivity.isZero("kkd@"));
        //null
        assertFalse(mainActivity.isZero(""));// Nota: el metodo no esta preparado para recibir el parametro null
    }

}