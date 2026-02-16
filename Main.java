import character.*;
import strategy.attack.CastSpell;
import strategy.defense.Shield;

public class Main {

    public static void main(String[] args) {

        GameCharacter knight = new Knight();
        GameCharacter wizard = new Wizard();
        GameCharacter archer = new Archer();

        System.out.println("=== Default Strategies ===");

        System.out.println("\nKnight:");
        knight.performAttack();
        knight.performDefense();

        System.out.println("\nWizard:");
        wizard.performAttack();
        wizard.performDefense();

        System.out.println("\nArcher:");
        archer.performAttack();
        archer.performDefense();


        // DYNAMIC CHANGE
        System.out.println("\n=== Strategy Changed Dynamically ===");

        knight.setAttackStrategy(new CastSpell());
        knight.addDefenseStrategy(new Shield());

        System.out.println("\nKnight learned magic!");
        knight.performAttack();
        knight.performDefense();
    }
}
