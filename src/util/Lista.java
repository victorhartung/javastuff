package util;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Lista {
    public static void main(String[] args){

        List<Integer> list = new ArrayList<>();
        List<String> lista = new ArrayList<>();


        lista.add("Victor");
        lista.add("Joao");
        lista.add("Fe em deus");
        lista.add(2, "Famoso");
        System.out.println(lista.size());
        //for(int x : list) {
         //   System.out.println(x);
        //}
        lista.remove("Joao");

        for(String k : lista) {
            System.out.println(k);
        }

        lista.removeIf(x -> x.charAt(0) == 'J');
        System.out.println("---------------------------");
        System.out.println("Index of Bob: " + list.indexOf("Bob"));
        List<String> result = lista.stream().filter(x -> x.charAt(0) == 'A').collect(Collectors.toList());

        for(String x : result) {
            System.out.println(x);
        }
        System.out.println("---------------------------");
        String name = lista.stream().filter(x -> x.charAt(0) == 'A').findFirst().orElse(null);
        System.out.println(name);
    }
}
