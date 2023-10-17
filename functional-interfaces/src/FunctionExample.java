import java.util.Arrays;
import java.util.List;
import java.util.function.Function;
import java.util.stream.Collectors;

public class FunctionExample {
    public static void main(String[] args) {
        List<Integer> numeros = Arrays.asList(1, 2, 3, 4, 5);

        Function<Integer, Integer> dobrar = numero -> numero * 2;

        List<Integer> numerosDobrados = numeros.stream().map(dobrar).toList();

        numerosDobrados.forEach(System.out::println);
        
        //Expressão lambda

        List<Integer> numerosDobradosLambda = numeros.stream().map(n -> n * 2).toList();

        numerosDobradosLambda.forEach(System.out::println);
    }
}
