package character;

import strategy.attack.AttackStrategy;
import strategy.defense.DefenseStrategy;

import java.util.ArrayList;
import java.util.List;

public abstract class GameCharacter {

    protected AttackStrategy attackStrategy;
    protected List<DefenseStrategy> defenseStrategies;

    public GameCharacter() {
        defenseStrategies = new ArrayList<>();
    }

    public void performAttack() {
        if (attackStrategy != null)
            attackStrategy.attack();
        else
            System.out.println("No attack strategy assigned.");
    }

    public void performDefense() {

        if (defenseStrategies.isEmpty()) {
            System.out.println("No defense strategy assigned.");
            return;
        }

        for (DefenseStrategy defense : defenseStrategies) {
            defense.defend();
        }
    }

    // DYNAMIC STRATEGY CHANGE
    public void setAttackStrategy(AttackStrategy attackStrategy) {
        this.attackStrategy = attackStrategy;
    }

    public void addDefenseStrategy(DefenseStrategy defenseStrategy) {
        defenseStrategies.add(defenseStrategy);
    }

    public void clearDefenseStrategies() {
        defenseStrategies.clear();
    }
}
