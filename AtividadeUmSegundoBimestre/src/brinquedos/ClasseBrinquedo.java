package brinquedos;

public class ClasseBrinquedo {
    private String nome;
    private String faixaEtaria;
    private float preco;

    // Construtor padrão
    public ClasseBrinquedo() {
        this.nome = "";
        this.faixaEtaria = "";
        this.preco = 0.0f;
    }

    // Construtor com o nome
    public ClasseBrinquedo(String nome) {
        this.nome = nome;
        this.faixaEtaria = "";
        this.preco = 0.0f;
    }

    // Construtor com nome e preço
    public ClasseBrinquedo(String nome, float preco) {
        this.nome = nome;
        this.faixaEtaria = "";
        this.preco = preco;
    }

    // Getter e Setter para nome
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    // Getter e Setter para faixaEtaria com validação
    public String getFaixaEtaria() {
        return faixaEtaria;
    }

    public void setFaixaEtaria(String faixaEtaria) {
        if (faixaEtaria.equals("0 a 2") || 
            faixaEtaria.equals("3 a 5") || 
            faixaEtaria.equals("6 a 10") || 
            faixaEtaria.equals("acima de 10")) {
            this.faixaEtaria = faixaEtaria;
        } else {
            System.out.println("Faixa etária inválida. Valores permitidos: '0 a 2', '3 a 5', '6 a 10', 'acima de 10'.");
        }
    }

    // Getter e Setter para preco
    public float getPreco() {
        return preco;
    }

    public void setPreco(float preco) {
        this.preco = preco;
    }

    // Método para mostrar as informações do brinquedo
    public void mostrar() {
        System.out.println("Nome: " + nome);
        System.out.println("Faixa Etária: " + faixaEtaria);
        System.out.println("Preço: " + preco);
    }
}
