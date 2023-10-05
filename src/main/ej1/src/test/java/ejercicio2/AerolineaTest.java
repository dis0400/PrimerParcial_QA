package ejercicio2;
import Reservas.Aerolinea;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
public class AerolineaTest {
    @Test
    public void testReservaVuelo_PasajesDisponibles() {
        Aerolinea aerolinea = new Aerolinea();

        boolean pasajesDisponibles = true;

        int dia = 29;
        int mes = 5;
        int gestion = 2023;

        String resultado = aerolinea.reservaVuelo("La Paz", dia, mes, gestion);
        String mensajeEsperado = "el día Lunes 29 Mayo 2023 existen 2 pasajes para La Paz";
        assertEquals(mensajeEsperado, resultado);
    }

    @Test
    public void testReservaVuelo_PasajesNoDisponibles() {
        Aerolinea aerolinea = new Aerolinea();

        boolean pasajesDisponibles = false;

        int dia = 29;
        int mes = 5;
        int gestion = 2023;

        String resultado = aerolinea.reservaVuelo("La Paz", dia, mes, gestion);
        String mensajeEsperado = "no existen suficientes pasajes para La Paz";
        assertEquals(mensajeEsperado, resultado);
    }
}
