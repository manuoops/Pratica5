public class Mensalista extends Empregado {
    private String cargo;

    public Mensalista(String nome, String endereco, double salario, String cargo) {
        super(nome, endereco, salario);
        this.cargo = cargo;
    }

    public String getCargo() { return cargo; }
    public void setCargo(String cargo) { this.cargo = cargo; }

    @Override
    public double calSalario() {
        switch (cargo) {
            case "Programador I":       return 5000.00;
            case "Programador II":      return 7000.00;
            case "Programador III":     return 10000.00;
            case "Analista de Sistemas": return 8500.00;
            case "Gerente de Projetos": return 12000.00;
            default:                    return salario;
        }
    }

    @Override
    public double impRenda() {
        double sal = calSalario();
        if (sal < 1800.00) {
            return sal * 0.10;
        } else {
            return sal * 0.27;
        }
    }

    @Override
    public double calInss() {
        return calSalario() * 0.11;
    }
}