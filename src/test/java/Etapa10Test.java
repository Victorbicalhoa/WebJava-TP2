import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.junit.jupiter.api.Assertions.assertFalse;

import org.example.Etapa10;
import org.junit.jupiter.api.Test;

public class Etapa10Test {

    @Test
    void deveCompararComMargemDeErroCorretamente() {
        // Comparação dentro da margem de erro
        assertTrue(Etapa10.compararComMargem(140.0, 140.005));
        assertTrue(Etapa10.compararComMargem(140.0, 139.995));

        // Comparação fora da margem de erro
        assertFalse(Etapa10.compararComMargem(140.0, 140.02));
        assertFalse(Etapa10.compararComMargem(140.0, 139.97));
    }

    @Test
    void deveCalcularReembolsoComComparaçãoDeMargem() {
        Etapa10 etapa10 = new Etapa10();
        double resultado = etapa10.calcularReembolso(200.0, 0.7);

        // Comparação usando a nova função
        assertTrue(Etapa10.compararComMargem(140.0, resultado));
    }

    @Test
    void deveValidarComparacaoDeValoresExatos() {
        assertTrue(Etapa10.compararComMargem(100.0, 100.0));
        assertFalse(Etapa10.compararComMargem(100.0, 100.02));
    }
}