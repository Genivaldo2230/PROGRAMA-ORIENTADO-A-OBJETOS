

// Classe abstrata Funcionario
public abstract class Funcionario {
    // Atributos comuns a todos os funcionarios
    private int codigo;
    private String nome;
    private double salarioBase;

    // Construtor
    public Funcionario(int codigo, String nome, double salarioBase) {
        this.codigo = codigo;
        this.nome = nome;
        this.salarioBase = salarioBase;
    }

    // Getters e setters
    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getSalarioBase() {
        return salarioBase;
    }

    public void setSalarioBase(double salarioBase) {
        this.salarioBase = salarioBase;
    }

    // Metodo abstrato para calcular o salario final de cada funcionario
    public abstract double calcularSalario();

}