import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class Main {

    public static void main(String[] args){

        List<Person> people = getPeople();
        List<Person> females = new ArrayList<>();

        // Imperative approach

        for (Person person : people){
            if(person.getGender().equals(Gender.FEMALE)){
                females.add(person);
            }
        }
        //females.forEach(System.out::println);




        //Declarative approach

        //Filter functionality
        List<Person> filterFemales = people.stream()
                .filter(person -> person.getGender().equals(Gender.FEMALE))
                .collect(Collectors.toList());

        filterFemales.forEach(System.out::println);
        System.out.println("\n");
        System.out.println("\n");

        //Sort functionality
        List<Person> sortedPeople = people.stream()
                .sorted(Comparator.comparing(Person::getAge).reversed())
                        .collect(Collectors.toList());

        sortedPeople.forEach(System.out::println);
        System.out.println("\n");
        System.out.println("\n");

    }

    private static List<Person> getPeople(){
        return List.of
        (
                new Person("Antonio", 20, Gender.MALE),
                new Person("Alina Smith", 33, Gender.FEMALE),
                new Person("Helen White", 57, Gender.FEMALE),
                new Person("Alex Boz", 14, Gender.MALE),
                new Person("Jamie Goa", 99, Gender.MALE),
                new Person("Anna Cook", 7, Gender.FEMALE),
                new Person("Zelda Brown", 120, Gender.FEMALE)
        );
    }

}
