import java.lang.annotation.*;

// Definindo a Annotation @Tabela
@Documented
@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.TYPE)  // A annotation será aplicada apenas a classes (TIPOS)
public @interface Tabela {
    String nome();  // Nome da tabela
}
