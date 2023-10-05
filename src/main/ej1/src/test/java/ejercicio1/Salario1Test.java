package ejercicio1;
import org.example.Salarios1;
import org.junit.jupiter.api.Test;
import static org.mockito.Mockito.*;
import static org.junit.jupiter.api.Assertions.*;

public class Salario1Test {
    @Test
    public void testCalcularDescuentoSinDescuento() {

        Salarios1 salarioManager = spy(new Salarios1());
        double salario = 1500.0;
        doReturn(0.0).when(salarioManager).calcularDescuento(salario);

        double descuento = salarioManager.calcularDescuento(salario);
        verify(salarioManager, times(1)).calcularDescuento(salario);
        assertEquals(0.0, descuento);
    }
    @Test
    public void testCalcularDescuentoDescuento5PorCiento() {
        Salarios1 salarioManager = spy(new Salarios1());
        double salario = 2100.0;

        doReturn(0.05 * salario).when(salarioManager).calcularDescuento(salario);

        double descuento = salarioManager.calcularDescuento(salario);
        verify(salarioManager, times(1)).calcularDescuento(salario);

        assertEquals(0.05 * salario, descuento);
    }
    @Test
    public void testCalcularDescuentoDescuento15PorCiento() {

        Salarios1 salarioManager = spy(new Salarios1());
        double salario = 3000.0;
        doReturn(0.15 * salario).when(salarioManager).calcularDescuento(salario);

        double descuento = salarioManager.calcularDescuento(salario);

        verify(salarioManager, times(1)).calcularDescuento(salario);

        assertEquals(0.15 * salario, descuento);
    }
}
