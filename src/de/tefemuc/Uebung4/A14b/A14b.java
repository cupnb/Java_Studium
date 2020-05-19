package de.tefemuc.Uebung4.A14b;

import java.time.LocalDate;
import java.time.format.DateTimeParseException;
import java.util.Random;
import java.util.TreeSet;

public class A14b {

    public static void main(String[] args){
        if (args.length < 2) {
            System.err.println("Not enough arguments!");
            return;
        }

        Random r = new Random();
        TreeSet<A14bEmployee> tree = new TreeSet<>((x, y) -> Integer.compare(x.getId(), y.getId()));

        for (int i = 0; i < args.length; i += 2){
            A14bEmployee e;
            try {
                e = new A14bEmployee(1001 + r.nextInt(10), args[i], LocalDate.parse(args[i + 1]));
            } catch (A14bIllegalInputException ex) {
                System.err.println(ex.getMessage());
                return;
            } catch (DateTimeParseException ex){
                System.err.println("Invalid date: " + ex.getParsedString());
                return;
            }

            if (tree.contains(e)) {
                System.err.println(e.getName() + " is already in the Tree. Continuing!");
                continue;
            }
            tree.add(e);
        }

        tree.forEach(System.out::println);
    }
}
