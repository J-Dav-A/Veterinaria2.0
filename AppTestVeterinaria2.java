package co.edu.uniquindio.poo;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.junit.jupiter.api.Assertions.assertTrue;

import java.util.logging.Logger;

import org.junit.jupiter.api.Test;

public class AppTestVeterinaria2 {

    private static final Logger LOG = Logger.getLogger(AppTestVeterinaria2.class.getName());

    /*
     * prueba para verificar que el nombre de la veterinaria este correcto
     */

    @Test
    public void datosCompletosCurso(){
        LOG.info("inicio test datosCompletosVeterinaria");
        Veterinaria2 veterinaria2 = new Veterinaria2("Amigos Peludos");
        assertEquals("Amigos Peludos", veterinaria2.getNombre());
        LOG.info("fin test datosCompetosVeterinaria");
    }

    /*
     * prueba para verificar datos de la veterinaria nulos
     */

    @Test
    public void datosNulosVeterinaria2(){
        LOG.info("inicio test datosNulosVeterinaria");
        assertThrows(Throwable.class, () -> new Veterinaria2(null));
        LOG.info("fin test datosNulosVeterinaria");

    }

    /* 
     * prueba para registrar mascotas
    */

    @Test 
    public void registrarMascota(){
        LOG.info("inicio test resgistrarMascota");
        Veterinaria2 veterinaria2 = new Veterinaria2("amigos peludos");
        Mascota mascota = new Mascota("Chispa", "canino", "criollo", (byte)5, "hembra", "chocolate", 16, "12242019");

        veterinaria2.agregarMascota(mascota);
        assertTrue(veterinaria2.getMascotas().contains(mascota));
        assertEquals(1, veterinaria2.getMascotas().size());

        LOG.info("fin test registrarMascota");

    }

    @Test
    public void verificarIdMascota(){
        LOG.info("inicio test verificarIdMascota");
        Veterinaria2 veterinaria2 = new Veterinaria2("amigos peludos");

        Mascota mascota1 = new Mascota("Chispa", "canino", "criollo", (byte)5, "hembra", "chocolate", 16, "12242019");
        
        Mascota mascota2 = new Mascota("firulais", "canino", "pastor aleman", (byte)3, "macho", "cafe", 25, "12345678");

        veterinaria2.agregarMascota(mascota1);

        veterinaria2.agregarMascota(mascota2);

        LOG.info("fin test verificarIdMascota");


    }
}
