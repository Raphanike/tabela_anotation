import java.lang.annotation.*;
import java.lang.reflect.*;

// Usando a Annotation @Tabela em classes

@Tabela(nome = "clientes")
public class Cliente {
    private String nome;
    private int idade;

    // Getters e setters
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }
}

