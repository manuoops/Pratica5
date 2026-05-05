public class Horista extends Empregado {
    private int horas;

    public Horista(String nome, String endereco, double salario, int horas) {
        super(nome, endereco, salario);
        this.horas = horas;
    }

    public int getHoras() { return horas; }
    public void setHoras(int horas) { this.horas = horas; }

    @Override
    public double calSalario() {
        return horas * salario;
    }
}
