import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class AutomovelLuxoTest {

    @Test
    void deveRetonarCusto() {
        AutomovelLuxo automovelLuxo = new AutomovelLuxo();
        automovelLuxo.setAno("1018");
        automovelLuxo.setId(2);
        automovelLuxo.setModelo("Jeep Renegade 1.8");
        automovelLuxo.setDias_emprestimo(3);
        assertEquals(600.0f, automovelLuxo.verificarCustoEmprestimo());
    }

    @Test
    void deveRetornarInformacoes() {
        AutomovelLuxo automovelLuxo = new AutomovelLuxo();
        automovelLuxo.setId(2);
        automovelLuxo.setAno("2018");
        automovelLuxo.setModelo("Jeep Renegade 1.8");
        automovelLuxo.setDias_emprestimo(3);
        assertEquals("{id=2, modelo='Jeep Renegade 1.8', custo final=600.0}", automovelLuxo.getInfo());
    }

}