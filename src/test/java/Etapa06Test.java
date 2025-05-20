import static org.junit.jupiter.api.Assertions.assertEquals;

import org.example.Etapa06;
import org.junit.jupiter.api.Test;

public class Etapa06Test {

    @Test
    void deveCalcularReembolsoParaPlano50() {
        Etapa06 etapa06 = new Etapa06();
        Etapa06.PlanoSaude plano50 = new Etapa06.PlanoSaude50();  // Usando a implementação dentro de Etapa06
        double resultado = etapa06.calcularReembolso(plano50, 200.0);
        assertEquals(100.0, resultado, 0.01);
    }

    @Test
    void deveCalcularReembolsoParaPlano80() {
        Etapa06 etapa06 = new Etapa06();
        Etapa06.PlanoSaude plano80 = new Etapa06.PlanoSaude80();  // Usando a implementação dentro de Etapa06
        double resultado = etapa06.calcularReembolso(plano80, 200.0);
        assertEquals(160.0, resultado, 0.01);
    }
}