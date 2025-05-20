import static org.junit.jupiter.api.Assertions.assertEquals;

import org.example.Etapa01;
import org.junit.jupiter.api.Test;

public class Etapa01Test {

    @Test
    void calcularReembolso() {
        Etapa01 etapa01 = new Etapa01();
        double resultado = etapa01.calcularReembolso(200.0, 0.7);
        assertEquals(140.0, resultado, 0.01);
    }
}