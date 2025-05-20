import static org.junit.jupiter.api.Assertions.assertEquals;

import org.example.Etapa02;
import org.junit.jupiter.api.Test;

public class Etapa02Test {

    @Test
    void deveRetornarZeroQuandoConsultaEhZero() {
        Etapa02 etapa02 = new Etapa02();
        double resultado = etapa02.calcularReembolso(0.0, 0.7);
        assertEquals(0.0, resultado, 0.01);
    }

    @Test
    void deveRetornarZeroQuandoCoberturaEhZero() {
        Etapa02 etapa02 = new Etapa02();
        double resultado = etapa02.calcularReembolso(200.0, 0.0);
        assertEquals(0.0, resultado, 0.01);
    }

    @Test
    void deveRetornarValorTotalQuandoCoberturaEh100() {
        Etapa02 etapa02 = new Etapa02();
        double resultado = etapa02.calcularReembolso(200.0, 1.0);
        assertEquals(200.0, resultado, 0.01);
    }
}