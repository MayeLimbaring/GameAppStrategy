package character;

import strategy.attack.SwingSword;
import strategy.defense.*;

public class Knight extends GameCharacter {

    public Knight() {

        attackStrategy = new SwingSword();

        defenseStrategies.add(new Shield());
        defenseStrategies.add(new Dodge());
        defenseStrategies.add(new CreateMagic());
    }
}
