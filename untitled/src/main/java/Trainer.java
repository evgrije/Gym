import java.util.List;

public class Trainer {
    private String name;

    private int salary;
    private List<Groups> listOfGroups;
    private int percent;


    public int getSalary() {
        int salary = 0;
        for (int i = 0; i<listOfGroups.size();i++){
            salary += listOfGroups.get(i).getPaymentWithEachTrainings();
        }
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    public List<Groups> getListOfGroups() {
        return listOfGroups;
    }

    public void setListOfGroups(List<Groups> listOfGroups) {
        this.listOfGroups = listOfGroups;
    }

    public int getPercent() {
        return percent;
    }

    public void setPercent(int percent) {
        this.percent = percent;
    }

    public Trainer(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
