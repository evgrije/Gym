import java.util.List;

public class Groups {

    private String type;
    private String name;
    private Trainer trainer;
    private List<Training> listOfTrainings;

    public Groups(String type, String name) {
        this.type = type;
        this.name = name;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Trainer getTrainer() {
        return trainer;
    }

    public void setTrainer(Trainer trainer) {
        this.trainer = trainer;
    }

    public List<Training> getListOfTrainings() {
        return listOfTrainings;
    }

    public void setListOfTrainings(List<Training> listOfTrainings) {
        this.listOfTrainings = listOfTrainings;
    }

 public int getPaymentWithEachTrainings() {

        int sum = 0;
        for (int i = 0; i<listOfTrainings.size();i++){
            sum += listOfTrainings.get(i).getPayments();
        }
        return sum;

    }
}
