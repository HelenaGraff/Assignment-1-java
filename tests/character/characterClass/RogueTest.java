package character.characterClass;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class RogueTest {

    @Test
    public void is_rogue_created_with_proper_default_attributes()
    {
        // Arrange
        Rogue myRogue = new Rogue("Sierra");
        myRogue.strength = 2;
        myRogue.dexterity = 6;
        myRogue.intelligence = 1;

        int expectedStrength = 2;
        int expectedDexterity = 6;
        int expectedIntelligence = 1;

        // Act
        int actualStrength = (int) myRogue.getStrength();
        int actualDexterity = (int) myRogue.getDexterity();
        int actualIntelligence = (int) myRogue.getIntelligence();

        //Assert
        assertEquals(actualStrength, expectedStrength);
        assertEquals(actualDexterity, expectedDexterity);
        assertEquals(actualIntelligence, expectedIntelligence);
    }


    @Test
    public void is_rogue_attributes_increased_when_levelling_up()
    {
        // Arrange
        Rogue myRogue = new Rogue("Sierra");
        myRogue.levelUp();
        int expectedStrength = 3;
        int expectedDexterity = 10;
        int expectedIntelligence = 2;

        // Act
        int actualStrength = (int) myRogue.getStrength();
        int actualDexterity = (int) myRogue.getDexterity();
        int actualIntelligence = (int) myRogue.getIntelligence();

        // Assert
        assertEquals(actualStrength, expectedStrength);
        assertEquals(actualDexterity, expectedDexterity);
        assertEquals(actualIntelligence, expectedIntelligence);
    }
}