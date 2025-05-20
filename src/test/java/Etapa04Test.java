import static org.junit.jupiter.api.Assertions.assertEquals;

import org.example.Etapa04;
import org.junit.jupiter.api.Test;

public class Etapa04Test {

    @Test
    void deveCalcularReembolsoCorretamente() {
        Etapa04.Paciente pacienteDummy = new Etapa04.Paciente("Teste");
        Etapa04 etapa04 = new Etapa04();
        double resultado = etapa04.calcularReembolso(pacienteDummy, 200.0, 0.7);
        assertEquals(140.0, resultado, 0.01);
    }

    @Test
    void deveRetornarZeroQuandoConsultaEhZero() {
        Etapa04.Paciente pacienteDummy = new Etapa04.Paciente("Teste");
        Etapa04 etapa04 = new Etapa04();
        double resultado = etapa04.calcularReembolso(pacienteDummy, 0.0, 0.7);
        assertEquals(0.0, resultado, 0.01);
    }

    @Test
    void deveRetornarZeroQuandoCoberturaEhZero() {
        Etapa04.Paciente pacienteDummy = new Etapa04.Paciente("Teste");
        Etapa04 etapa04 = new Etapa04();
        double resultado = etapa04.calcularReembolso(pacienteDummy, 200.0, 0.0);
        assertEquals(0.0, resultado, 0.01);
    }

    @Test
    void deveRetornarValorTotalQuandoCoberturaEh100() {
        Etapa04.Paciente pacienteDummy = new Etapa04.Paciente("Teste");
        Etapa04 etapa04 = new Etapa04();
        double resultado = etapa04.calcularReembolso(pacienteDummy, 200.0, 1.0);
        assertEquals(200.0, resultado, 0.01);
    }
}