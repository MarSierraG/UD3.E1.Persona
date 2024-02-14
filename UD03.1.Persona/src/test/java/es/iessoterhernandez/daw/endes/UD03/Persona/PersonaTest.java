// src/test/java/es/iessoterhernandez/daw/endes/UD03/Persona/PersonaTest.java
package es.iessoterhernandez.daw.endes.UD03.Persona;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class PersonaTest {

    private static Persona persona;

    @BeforeEach
    public void Persona1() {
        persona = new Persona("Juan", 25, 'H', 70.0, 1.75);
    }

    @Test
    public void testPesoIdeal() {
        assertEquals(Persona.PESO_IDEAL, persona.calcularIMC());
    }

    @Test
    public void testPocoPeso() {
        persona.setPeso(18.0); 
        assertEquals(Persona.INFRAPESO, persona.calcularIMC());
    }

    @Test
    public void testSobrepeso() {
        persona.setPeso(30.0); 
        assertEquals(Persona.SOBREPESO, persona.calcularIMC());
    }

    @Test
    public void testEsMayorDeEdad() {
        assertTrue(persona.esMayorDeEdad());
    }
    
    @Test
    public void testEsMenorDeEdad() {
    	persona.setEdad(17);
        assertFalse(persona.esMayorDeEdad());
    }
 

}
