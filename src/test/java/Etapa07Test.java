import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.example.Etapa07;
import org.junit.jupiter.api.Test;

public class Etapa07Test {

    static class AuditoriaSpy implements Etapa07.Auditoria {
        private boolean metodoChamado = false;

        @Override
        public void registrarConsulta(String paciente, double valor, double cobertura) {
            metodoChamado = true;  // Marca que o método foi chamado
        }

        public boolean foiChamado() {
            return metodoChamado;
        }
    }

    @Test
    void deveChamarAuditoriaAoRegistrarConsulta() {
        // Criando Spy manual
        AuditoriaSpy auditoriaSpy = new AuditoriaSpy();
        Etapa07.SistemaReembolso sistema = new Etapa07.SistemaReembolso(auditoriaSpy);

        // Executando o cálculo de reembolso
        double resultado = sistema.calcularReembolso("Victor", 200.0, 0.7);

        // Validando o cálculo do reembolso
        assertEquals(140.0, resultado, 0.01);

        // Garantindo que o método registrarConsulta() foi chamado
        assertTrue(auditoriaSpy.foiChamado());
    }
}