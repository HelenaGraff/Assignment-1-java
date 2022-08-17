import character.characterClass.CharacterClass;
import character.characterClass.Mage;
import character.characterClass.Warrior;
import equipment.Weapon;

import java.util.Arrays;
import java.util.Scanner;

public class Main {

    static Mage myMage = new Mage("Layla");

    public static void main(String[] args) {

        System.out.println("Welcome to RPG Game");


        System.out.println("Your character is a: " + myMage.getClassName());
        System.out.println("and your character is called: " + myMage.getName());

        System.out.println();

        System.out.println("You are currently in level: " + myMage.level);
        System.out.println("In level: " + myMage.level + " your characters intelligence is: " + myMage.getIntelligence());
        System.out.println("In level: " + myMage.level + " your characters strength is: " + myMage.getStrength());
        System.out.println("In level: " + myMage.level + " your characters dexterity is: " + myMage.getDexterity());

        getOpponent();

        System.out.println("An opponent has just been created");
        Warrior myWarrior = new Warrior("Zilong");
        System.out.println("Your opponent is a: " + myWarrior.getClassName());
        System.out.println("and your opponent is called: " + myWarrior.getName());

        System.out.println("To fight Zilong you must equip either a weapon or an armour");
        //System.out.println(myMage.showUsableWeaponsOrArmour());

        System.out.println("The weapons available for your character to equip is: " + Arrays.toString(myMage.usableWeapons));

        Weapon myMageWeapon = new Weapon("Wand of wizard", 1, "Weapon", 5, "Wand");

        myMage.addEquipment(myMageWeapon);

       // myMage.getEquipment();

        System.out.println();

        System.out.println(myMageWeapon.getRequiredLevel());

        //System.out.println(myMage.getEquipment());
        // System.out.println(Arrays.toString(myMage.usableArmour));
        //System.out.println(Arrays.toString(myMage.usableWeapons));

        //myMage.levelUp();

        // System.out.println(myMage.getIntelligence());




       // myWarrior.getEquipment();

        Weapon myWarriorWeapon = new Weapon("Axe from hell", 1, "Weapon", 6, "Axe");

        myWarrior.addEquipment(myWarriorWeapon);

        myWarrior.getEquipment();
    }

    public static void getOpponent() {
        System.out.println("Press \"ENTER\" to get an opponent");
        Scanner scanner = new Scanner(System.in);
        scanner.nextLine();
    }
}
