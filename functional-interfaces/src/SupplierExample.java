import java.util.List;
import java.util.function.Supplier;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class SupplierExample {
    public static void main(String[] args) {
        Supplier<String> saudacao = () -> "Olá, seja bem-vindo(a)";

        List<String> listaSaudacoes = Stream.generate(saudacao)
                .limit(5)
                .collect(Collectors.toList());

        listaSaudacoes.forEach(System.out::println);

        // usar Suplier diretamente no generate

        List<String> listaSaudacoes2 = Stream.generate(() -> "Olá, seja bem-vindo!").limit(5).toList();

        listaSaudacoes2.forEach(System.out::println);

    }
}
