public class AutomovelLuxo extends Automovel {

    @Override
    public float verificarCustoEmprestimo() {
        return this.getDias_emprestimo()*200.0f;
    }
}
