// Testando o uso da annotation @Tabela
public class TesteTabela {
    public static void main(String[] args) throws Exception {
        // Acessando a annotation da classe Cliente
        Class<?> classeCliente = Cliente.class;
        if (classeCliente.isAnnotationPresent(Tabela.class)) {
            Tabela tabelaCliente = classeCliente.getAnnotation(Tabela.class);
            System.out.println("Classe Cliente - Tabela: " + tabelaCliente.nome());
        }

        // Acessando a annotation da classe Produto
        Class<?> classeProduto = Produto.class;
        if (classeProduto.isAnnotationPresent(Tabela.class)) {
            Tabela tabelaProduto = classeProduto.getAnnotation(Tabela.class);
            System.out.println("Classe Produto - Tabela: " + tabelaProduto.nome());
        }
    }
}
