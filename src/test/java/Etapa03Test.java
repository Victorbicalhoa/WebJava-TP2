import static org.junit.jupiter.api.Assertions.assertEquals;

import org.example.Etapa03;
import org.junit.jupiter.api.Test;

public class Etapa03Test {

    @Test
    void deveCalcularReembolsoCorretamente() {
        Etapa03 etapa03 = new Etapa03();
        double resultado = etapa03.calcularReembolso(200.0, 0.7);
        assertEquals(140.0, resultado, 0.01);
    }

    @Test
    void deveRetornarZeroQuandoConsultaEhZero() {
        Etapa03 etapa03 = new Etapa03();
        double resultado = etapa03.calcularReembolso(0.0, 0.7);
        assertEquals(0.0, resultado, 0.01);
    }

    @Test
    void deveRetornarZeroQuandoCoberturaEhZero() {
        Etapa03 etapa03 = new Etapa03();
        double resultado = etapa03.calcularReembolso(200.0, 0.0);
        assertEquals(0.0, resultado, 0.01);
    }

    @Test
    void deveRetornarValorTotalQuandoCoberturaEh100() {
        Etapa03 etapa03 = new Etapa03();
        double resultado = etapa03.calcularReembolso(200.0, 1.0);
        assertEquals(200.0, resultado, 0.01);
    }
}