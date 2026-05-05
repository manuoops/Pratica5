public class Empregado {
    protected String nome;
    protected String endereco;
    protected double salario;

    public Empregado(String nome, String endereco, double salario) {
        this.nome = nome;
        this.endereco = endereco;
        this.salario = salario;
    }

    public String getNome() { return nome; }
    public void setNome(String nome) { this.nome = nome; }

    public String getEndereco() { return endereco; }
    public void setEndereco(String endereco) { this.endereco = endereco; }

    public double getSalario() { return salario; }
    public void setSalario(double salario) { this.salario = salario; }


    public double impRenda() {
        if (salario < 1800.00) {
            return salario * 0.10;
        } else {
            return salario * 0.27;
        }
    }

    public double calInss() {
        return salario * 0.11;
    }

    public double calSalario() {
        return salario;
    }

    public void imprimir() {
        System.out.println("Nome: " + nome);
        System.out.println("Endereço: " + endereco);
        System.out.println("Salário: R$ " + calSalario());
        System.out.println("Imposto de Renda: R$ " + impRenda());
        System.out.println("INSS: R$ " + calInss());
    }
}
