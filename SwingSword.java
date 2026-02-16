package strategy.attack;

public class SwingSword implements AttackStrategy {

    @Override
    public void attack() {
        System.out.println("Swinging a Sword!");
    }
}
