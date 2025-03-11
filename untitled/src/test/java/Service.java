public class Service {
    public int getPercent(Trainer trainer, Gym gym){
        return (trainer.getSalary() * 100) / gym.getTotalAmount();
    }

  public Trainer getRichBitch(Gym gym) {

      Trainer max = gym.getListOfTrainers().get(0);
      for (int i = 0; i < gym.getListOfTrainers().size(); i++){
          if (gym.getListOfTrainers().get(i).getSalary() > max.getSalary()){
              max = gym.getListOfTrainers().get(i);
          }
       }
       return max;
   }

    public Trainer getHomelessBitch(Gym gym) {

        Trainer min = gym.getListOfTrainers().get(0);
        for (int i = 0; i < gym.getListOfTrainers().size(); i++){
            if (gym.getListOfTrainers().get(i).getSalary() < min.getSalary()){
                min = gym.getListOfTrainers().get(i);
            }
        }
        return min;
    }


}
