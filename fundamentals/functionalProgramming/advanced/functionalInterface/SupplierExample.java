package functionalProgramming.advanced.functionalInterface;

import java.util.List;
import java.util.function.Supplier;

public class SupplierExample {
    public static void main(String[] args) {
        System.out.println(getDBConnectionUrlSupplier.get());
    }
    static Supplier<List<String>> getDBConnectionUrlSupplier = () -> {
        List <String> localHosts = List.of("jdbc://localhost:5432/users",
                "jdbc://localhost:5432/customer");

        return localHosts;
    };
}
