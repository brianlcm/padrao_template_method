import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class AutomovelEconomicoTest {

    @Test
    void deveRetonarAprovado() {
        AutomovelEconomico automovelEconomico = new AutomovelEconomico();
        automovelEconomico.setAno("2014");
        automovelEconomico.setId(1);
        automovelEconomico.setModelo("Fiat Mobi");
        automovelEconomico.setDias_emprestimo(3);
        assertEquals(150.0f, automovelEconomico.verificarCustoEmprestimo());
    }

    @Test
    void deveRetornarInformacoes() {
        AutomovelEconomico automovelEconomico = new AutomovelEconomico();
        automovelEconomico.setId(1);
        automovelEconomico.setAno("2014");
        automovelEconomico.setModelo("Fiat Mobi");
        automovelEconomico.setDias_emprestimo(3);
        assertEquals("{id=1, modelo='Fiat Mobi', custo final=150.0}", automovelEconomico.getInfo());
    }

}