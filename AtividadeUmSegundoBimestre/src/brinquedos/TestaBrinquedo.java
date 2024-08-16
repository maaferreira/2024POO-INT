package brinquedos;

public class TestaBrinquedo {
    public static void main(String[] args) {
        // Testando o construtor padrão
    	ClasseBrinquedo brinquedo1 = new ClasseBrinquedo();
        brinquedo1.setNome("Carrinho");
        brinquedo1.setFaixaEtaria("3 a 5");
        brinquedo1.setPreco(29.99f);
        brinquedo1.mostrar();

        // Testando o construtor com nome
        ClasseBrinquedo brinquedo2 = new ClasseBrinquedo("Boneca");
        brinquedo2.setFaixaEtaria("6 a 10");
        brinquedo2.setPreco(49.99f);
        brinquedo2.mostrar();

        // Testando o construtor com nome e preço
        ClasseBrinquedo brinquedo3 = new ClasseBrinquedo("Quebra-cabeça", 19.99f);
        brinquedo3.setFaixaEtaria("acima de 10");
        brinquedo3.mostrar();

        // Testando faixa etária inválida
        ClasseBrinquedo brinquedo4 = new ClasseBrinquedo("Brinquedo Inválido");
        brinquedo4.setFaixaEtaria("12 a 15"); // Deve exibir mensagem de erro
        brinquedo4.mostrar();
    }
}
