package strategy.attack;

public class ShootArrow implements AttackStrategy {

    @Override
    public void attack() {
        System.out.println("Shooting an Arrow!");
    }
}
