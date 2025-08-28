import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();

        list.add("Marcia");
        list.add("Ana");
        list.add("Rodolfo");
        list.add("Heltom");
        list.add("Luana");
        list.add("Thalita");
        list.add("Aliandro");
        list.add("Leonei");
        list.add("Leo");
        list.add("Paloma");
        list.add(2, "Mariana");
        list.add(1, "Romeu");

        System.out.println(list.size()); // retorna o tamanho da lista

        for (String x: list){
            System.out.println(x);
        }

        System.out.println("___________Removendo___________");
        list.remove("Ana");
        list.remove(1);
        list.removeIf(x -> x.charAt(0) == 'M'); // remove todoa que tem M


        for (String x: list){
            System.out.println(x);
        }

        System.out.println("___________Index___________");
        list.add("Index of Leo: " + list.indexOf("Leo"));
        list.add("Index of Mariana; " + list.indexOf("Mariana")); // quando nao esta mais na lista o retorno é -1


        for (String x: list){
            System.out.println(x);
        }

        System.out.println("___________Filtrando___________");
        List<String> result = list.stream().filter(x -> x.charAt(0) == 'L').collect(Collectors.toList());

        System.out.println(result);

        System.out.println("________Primeiro__Predicado_______");
        String name = list.stream().filter(x -> x.charAt(0) == 'L').findFirst().orElse(null);
        System.out.println(name);
    }
}