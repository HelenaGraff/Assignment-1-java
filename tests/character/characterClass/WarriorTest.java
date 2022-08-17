package character.characterClass;

import equipment.Weapon;
import exceptions.InvalidWeaponException;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class WarriorTest {

    @Test
    public void is_warrior_created_with_proper_default_attributes()
    {
        // Arrange
        Warrior myWarrior = new Warrior("Zilong");
        myWarrior.strength = 5;
        myWarrior.dexterity = 2;
        myWarrior.intelligence = 1;

        int expectedStrength = 5;
        int expectedDexterity = 2;
        int expectedIntelligence = 1;

        // Act
        int actualStrength = (int) myWarrior.getStrength();
        int actualDexterity = (int) myWarrior.getDexterity();
        int actualIntelligence = (int) myWarrior.getIntelligence();

        //Assert
        assertEquals(actualStrength, expectedStrength);
        assertEquals(actualDexterity, expectedDexterity);
        assertEquals(actualIntelligence, expectedIntelligence);
    }


    @Test
    public void is_warrior_attributes_increased_when_levelling_up()
    {
        // Arrange
        Warrior myWarrior = new Warrior("Zilong");
        myWarrior.levelUp();
        int expectedStrength = 8;
        int expectedDexterity = 4;
        int expectedIntelligence = 2;

        // Act
        int actualStrength = (int) myWarrior.getStrength();
        int actualDexterity = (int) myWarrior.getDexterity();
        int actualIntelligence = (int) myWarrior.getIntelligence();

        // Assert
        assertEquals(actualStrength, expectedStrength);
        assertEquals(actualDexterity, expectedDexterity);
        assertEquals(actualIntelligence, expectedIntelligence);
    }

    @Test
    public void warrior_tries_to_equip_a_high_level_weapon()
    {
        // Arrange
        Warrior myWarrior = new Warrior("Zilong");
        Weapon myWarriorWeapon = new Weapon("Axe from hell", 2, "Weapon", 6, "Axe");

        String expectedMessage = "Warrior needs to be at least on level 2 in order to equip this weapon";

        // Act
        InvalidWeaponException thrown = assertThrows(
                InvalidWeaponException.class,
                () -> myWarrior.addEquipment(myWarriorWeapon)
        );

        // Assert
        assertEquals(expectedMessage, thrown.getMessage());

    }

}