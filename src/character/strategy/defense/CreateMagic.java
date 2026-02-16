package strategy.defense;

public class CreateMagic implements DefenseStrategy {

    @Override
    public void defend() {
        System.out.println("Creating Magic Barrier!");
    }
}
