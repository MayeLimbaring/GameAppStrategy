package character;

import strategy.attack.ShootArrow;
import strategy.defense.Dodge;

public class Archer extends GameCharacter {

    public Archer() {

        attackStrategy = new ShootArrow();

        defenseStrategies.add(new Dodge());
    }
}
