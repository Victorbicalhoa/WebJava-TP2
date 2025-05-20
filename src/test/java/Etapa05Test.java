import static org.junit.jupiter.api.Assertions.assertEquals;

import org.example.Etapa05;
import org.junit.jupiter.api.Test;

import java.util.List;

public class Etapa05Test {

    @Test
    void deveCalcularReembolsoERegistrarConsulta() {
        Etapa05 etapa05 = new Etapa05();

        // Calcula reembolso e registra consulta
        double resultado = etapa05.calcularReembolso("Victor", 200.0, 0.7);

        // Verifica se cálculo do reembolso está correto
        assertEquals(140.0, resultado, 0.01);

        // Verifica se a consulta foi registrada no histórico
        List<String> consultas = etapa05.listarConsultas();
        assertEquals(1, consultas.size());
        assertEquals("Paciente: Victor | Valor: 200.0 | Cobertura: 0.7", consultas.get(0));
    }
}