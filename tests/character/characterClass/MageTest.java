package character.characterClass;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MageTest {

    @Test
    public void check_character_level_when_created()
    {
        // Arrange
        Mage myMage = new Mage("Layla");
        int expected = 1;

        // Act
        int actual = myMage.getLevel();

        // Assert
        assertEquals(actual, expected);
    }

    @Test
    public void check_character_level_increased()
    {
        // Arrange
        Mage myMage = new Mage("Layla");
        myMage.levelUp();
        int expected = 2;

        // Act
        int actual = myMage.getLevel();

        // Assert
        assertEquals(actual, expected);
    }

    @Test
    public void is_mage_created_with_proper_default_attributes()
    {
        // Arrange
        Mage myMage = new Mage("Layla");
        myMage.strength = 1;
        myMage.dexterity = 1;
        myMage.intelligence = 8;

        int expectedStrength = 1;
        int expectedDexterity = 1;
        int expectedIntelligence = 8;

        // Act
        int actualStrength = (int) myMage.getStrength();
        int actualDexterity = (int) myMage.getDexterity();
        int actualIntelligence = (int) myMage.getIntelligence();

        //Assert
        assertEquals(actualStrength, expectedStrength);
        assertEquals(actualDexterity, expectedDexterity);
        assertEquals(actualIntelligence, expectedIntelligence);
    }


    @Test
    public void is_character_attributes_increased_when_levelling_up()
    {
        // Arrange
        Mage myMage = new Mage("Layla");
        myMage.levelUp();
        int expectedStrength = 2;

        // Act
        int actual = (int) myMage.getStrength();

        // Assert
        assertEquals(actual, expectedStrength);
    }

}