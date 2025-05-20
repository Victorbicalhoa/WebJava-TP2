import static org.junit.jupiter.api.Assertions.assertEquals;

import org.example.Etapa09;
import org.junit.jupiter.api.Test;

public class Etapa09Test {

    @Test
    void deveCalcularReembolsoComHelper() {
        Etapa09 etapa09 = new Etapa09();
        Etapa09.Consulta consulta = Etapa09.criarConsultaPadrao();

        // Executando o cálculo de reembolso
        double resultado = etapa09.calcularReembolso(consulta);

        // Validando que o cálculo está correto
        assertEquals(140.0, resultado, 0.01);
    }

    @Test
    void deveCriarConsultaPadraoCorretamente() {
        Etapa09.Consulta consulta = Etapa09.criarConsultaPadrao();

        assertEquals("Paciente Teste", consulta.getPaciente());
        assertEquals(200.0, consulta.getValor(), 0.01);
        assertEquals(0.7, consulta.getCobertura(), 0.01);
    }

    @Test
    void deveCalcularReembolsoComValorDiferente() {
        Etapa09 etapa09 = new Etapa09();
        Etapa09.Consulta consulta = new Etapa09.Consulta("Outro Paciente", 300.0, 0.5);

        double resultado = etapa09.calcularReembolso(consulta);

        assertEquals(150.0, resultado, 0.01);
    }
}