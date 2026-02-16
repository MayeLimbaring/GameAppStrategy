package strategy.defense;

public class Shield implements DefenseStrategy {

    @Override
    public void defend() {
        System.out.println("Defending with Shield!");
    }
}
