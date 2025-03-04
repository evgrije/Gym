import java.util.List;

public class Gym {
    private String name;

    private List <Trainer> listOfTrainers;
    private List <Groups> listOfGroups;

    public List<Trainer> getListOfTrainers() {
        return listOfTrainers;
    }

    public void setListOfTrainers(List<Trainer> listOfTrainers) {
        this.listOfTrainers = listOfTrainers;
    }

    public List<Groups> getListOfGroups() {
        return listOfGroups;
    }

    public void setListOfGroups(List<Groups> listOfGroups) {
        this.listOfGroups = listOfGroups;
    }

    public Gym(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

  public int getTotalAmount(){
        int sum = 0;
        for (int i = 0; i<listOfGroups.size();i++){
            sum += listOfGroups.get(i).getPaymentWithEachTrainings();
        }
      return sum;
    }
}
