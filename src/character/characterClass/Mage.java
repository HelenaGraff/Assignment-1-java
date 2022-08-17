package character.characterClass;

import com.sun.tools.javac.Main;

import java.util.Arrays;
import java.util.Scanner;

public class Mage extends CharacterClass {

    public Mage(String name) {
        super(name);
        this.strength = 1;
        this.dexterity = 1;
        this.intelligence = 8;
        this.usableWeapons = new String[]{"Wand", "Staff"};
        this.usableArmour = new String[]{"Cloth"};
    }

    public String getClassName() {
        return "Mage";
    }

    @Override
    public void levelUp() {
        this.level += 1;
        this.strength += 1;
        this.dexterity += 1;
        this.intelligence += 5;
    }

    public String showUsableWeaponsOrArmour()
    {
        System.out.println("Press \"w\" to show usable weapons or press \"a\" to show usable armour");
        Scanner scanner = new Scanner(System.in);
        String userInput = scanner.nextLine();
        if (userInput.equals("w"))
        {
            System.out.println("You can use " + Arrays.toString(Mage.myMage.usableWeapons) + "to attack opponent");
        } else if (userInput.equals("a")) {
            System.out.println("You can use " + Arrays.toString(Mage.myMage.usableArmour) + "to defend yourself");
        }
        return userInput;
    }

}
