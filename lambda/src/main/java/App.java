import java.util.function.Consumer;
import java.util.function.Function;

public class App {
    public static void main(String[] args) {
        stringFun((String str) -> "*" + str + "*", "hello world");
        consumerFun((String str) -> System.out.println("*" + str + "*"), "hello world");


        System.out.println(powerFun((int num) -> num * num, 25));
        System.out.println(function((Integer num) -> num * num, 30));
    }

    public static void stringFun(StringFunction stringFunction, String str) {
        System.out.println(stringFunction.getString(str));
    }

    public static void consumerFun(Consumer<String> consumer, String str) {
        consumer.accept(str);
    }

    public static int powerFun(PowerFunction powerFunction, int num) {
        return powerFunction.getPower(num);
    }

    public static int function(Function<Integer, Integer> fun, int num) {
        return fun.apply(num);
    }

}


@FunctionalInterface
interface StringFunction {
    String getString(String str);
}

@FunctionalInterface
interface PowerFunction{
    int getPower(int num);
}
