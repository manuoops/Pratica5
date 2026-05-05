public class Heranca {
    public static void main(String[] args) {
        Mensalista m1 = new Mensalista("Ana", "Rua das Flores", 3000.00, "Analista de Sistemas");
        Horista h1 = new Horista("Carlos", "Av. Central", 25.00, 160);

        System.out.println("=== Mensalista ===");
        m1.imprimir();
        System.out.println();
        System.out.println("=== Horista ===");
        h1.imprimir();
    }
}