package character;

import strategy.attack.CastSpell;
import strategy.defense.CreateMagic;

public class Wizard extends GameCharacter {

    public Wizard() {

        attackStrategy = new CastSpell();

        defenseStrategies.add(new CreateMagic());
    }
}
