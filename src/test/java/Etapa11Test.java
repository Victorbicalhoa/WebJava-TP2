import static org.junit.jupiter.api.Assertions.assertEquals;

import org.example.Etapa11;
import org.junit.jupiter.api.Test;

public class Etapa11Test {

    @Test
    void deveAplicarTetoDeReembolso() {
        Etapa11 etapa11 = new Etapa11();
        double resultado = etapa11.calcularReembolso(300.0, 0.7);

        // Como 300 * 0.7 = 210, o sistema deve limitar para 150
        assertEquals(150.0, resultado, 0.01);
    }

    @Test
    void devePermitirReembolsoMenorQueTeto() {
        Etapa11 etapa11 = new Etapa11();
        double resultado = etapa11.calcularReembolso(200.0, 0.7);

        // 200 * 0.7 = 140, que está dentro do limite
        assertEquals(140.0, resultado, 0.01);
    }

    @Test
    void deveRetornarZeroSeConsultaEhZero() {
        Etapa11 etapa11 = new Etapa11();
        double resultado = etapa11.calcularReembolso(0.0, 0.7);

        assertEquals(0.0, resultado, 0.01);
    }
}