/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import com.mycompany.mavenproject1.Parte2.Mediana;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Lua
 */
public class TesteMediana {
    
   @Test
     public void testvetorNulo() {
        double vetor[]= null;
        Mediana mediana = new Mediana();
        try {
            double res = mediana.acharMediana(vetor);
            fail();
        } catch (Exception ex) {
            assertEquals("Erro vetor e nulo", ex.getMessage());
        }
     }
    @Test
     public void testvetorVazio() {
        double vetor[]= {};
        Mediana mediana = new Mediana();
        try {
            double res = mediana.acharMediana(vetor);
            fail();
        } catch (Exception ex) {
            assertEquals("Erro vetor e vazio", ex.getMessage());
        }
     }
     @Test
     public void acharMedianaimpar() throws Exception {
        double vetor[]= {1,2,3,4,5};
        Mediana mediana = new Mediana();
        double res = mediana.acharMediana(vetor);
        assertEquals(3.00,res,0.01);
     }
     @Test
     public void acharMedianaimparDesordenado() throws Exception {
        double vetor[]= {2,3,1,4,5};
        Mediana mediana = new Mediana();
        double res = mediana.acharMediana(vetor);
        assertEquals(3.00,res,0.01);
     }
}
