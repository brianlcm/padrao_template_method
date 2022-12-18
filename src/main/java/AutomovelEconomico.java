public class AutomovelEconomico extends Automovel {

    @Override
    public float verificarCustoEmprestimo() {
        return this.getDias_emprestimo()*50.0f;
    }
}
