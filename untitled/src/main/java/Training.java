import java.util.List;

public class Training {
    private int price;
    private List<Member> listOfMembers;

    public Training(int price, List<Member> listOfMembers) {
        this.listOfMembers = listOfMembers;
        this.price = price;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public List<Member> getListOfMembers() {
        return listOfMembers;
    }

    public void setListOfMembers(List<Member> listOfMembers) {
        this.listOfMembers = listOfMembers;
    }

       public int getPayments() {
        return this.price * this.listOfMembers.size();
    }
}
