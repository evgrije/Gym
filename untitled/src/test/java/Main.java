import java.util.List;

public class Main {
    public static void main (String[] args){
        Gym gym = new Gym("Be strong");
        Service service = new Service();

        Trainer trainer1 = new Trainer("John");
        Trainer trainer2 = new Trainer("Gloria");

        gym.setListOfTrainers(List.of(trainer1,trainer2));

        Groups group1 = new Groups("pilates", "Group1");
        Groups group2 = new Groups("bicycle", "Group2");
        gym.setListOfGroups(List.of(group1, group2));
        trainer1.setListOfGroups(List.of(group1));
        trainer2.setListOfGroups(List.of(group2));

        Training training1 = new Training(1500, List.of(
                new Member("Petya", 19),
                new Member("Sasha", 19),
                new Member("Anya", 22)
        ));
        Training training2 = new Training(2000, List.of(
                new Member("Pes", 22),
                new Member("Cat", 33)
        ));

        group1.setListOfTrainings(List.of(training1, training2));

        Training training3 = new Training(2200, List.of(
                new Member("Ira", 33),
                new Member("Masha", 33),
                new Member("Misha", 33),
                new Member("Zina", 22),
                new Member("Nadya", 25)
        ));
        Training training4 = new Training(1700, List.of(
                new Member("Ira", 33),
                new Member("Masha", 33),
                new Member("Misha", 33),
                new Member("Zina", 22),
                new Member("Nadya", 25),
                new Member("Nadya", 20)

        ));

        group2.setListOfTrainings(List.of(training3, training4));

       System.out.println("сколько заработал бар" + " " + gym.getTotalAmount());
        System.out.println("/////////");
       System.out.println("trainer1" + " " + (service.getPercent(trainer1, gym) + "%"));
       System.out.println("trainer2" + " " + (service.getPercent(trainer2, gym) + "%"));
       System.out.println("/////////");
       Trainer maxSalary = service.getRichBitch(gym);
       System.out.println("самый богатый" + " " + maxSalary.getSalary() + " " + maxSalary.getName());
        System.out.println("/////////");
        Trainer minSalary = service.getHomelessBitch(gym);
        System.out.println("самый бедный" + " " + minSalary.getSalary() + " " + minSalary.getName());




    }
}
