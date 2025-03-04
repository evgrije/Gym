import java.util.List;

public class Main {
    public static void main (String[] args){
        Gym gym = new Gym("Be strong");

        Trainer trainer1 = new Trainer("John");
        Trainer trainer2 = new Trainer("Gloria");

        gym.setListOfTrainers(List.of(trainer1,trainer2));

        Groups group1 = new Groups("pilates", "Group1");
        Groups group2 = new Groups("bicycle", "Group2");
        gym.setListOfGroups(List.of(group1, group2));
        group1.setTrainer(trainer1);
        group2.setTrainer(trainer2);

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

       System.out.println(gym.getTotalAmount());


    }
}
