public abstract class Automovel {
    private int id;
    private String modelo;
    private String ano;
    private int dias_emprestimo;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getAno() {
        return ano;
    }

    public void setAno(String ano) {
        this.ano = ano;
    }

    public float getDias_emprestimo() {
        return dias_emprestimo;
    }

    public void setDias_emprestimo(int dias_emprestimo) {
        this.dias_emprestimo = dias_emprestimo;
    }

    public abstract float verificarCustoEmprestimo();

    public String getInfo() {
        return "{" +
                "id=" + this.id +
                ", modelo='" + this.modelo + '\'' +
                ", custo final=" + this.verificarCustoEmprestimo() +
                '}';
    }
}
