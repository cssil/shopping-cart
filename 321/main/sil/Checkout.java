package sil;

import java.util.Arrays;
import java.util.List;
import java.util.Map;

import static java.util.function.UnaryOperator.identity;
import static java.util.stream.Collectors.counting;
import static java.util.stream.Collectors.groupingBy;

/**
 * Created by silvestras on 09/09/2017.
 */
public class Checkout {

    public long getPrice(List<String> items) {
        Map<String, Long> groups = items.stream().collect(groupingBy(identity(), counting()));
        Long price = 0L;
        for (Map.Entry<String, Long> group : groups.entrySet()) {
            String fruit = group.getKey();
            Long count = group.getValue();
            switch (fruit) {
                case "Apples":
                    price += count * 35;
                    break;
                case "Bananas":
                    price += count * 20;
                    break;
                case "Melons":
                    price += ((count / 2) * 50) + ((count % 2) * 50);
                    break;
                case "Limes":
                    price += ((count / 3) * 30) + ((count % 3) * 15);
                    break;
                default:
                    System.out.println("Unknown item.");
            }
        }
        return price;
    }

    public static void main(String[] args) {
        System.out.println(new Checkout().getPrice(Arrays.asList("Apples", "Bananas", "Apples", "Limes", "Limes", "Limes", "Melons")));
    }

}
