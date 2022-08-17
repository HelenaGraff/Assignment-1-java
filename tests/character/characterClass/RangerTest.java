package character.characterClass;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class RangerTest {

    @Test
    public void is_ranger_created_with_proper_default_attributes()
    {
        // Arrange
        Ranger myRanger = new Ranger("Baxia");
        myRanger.strength = 1;
        myRanger.dexterity = 7;
        myRanger.intelligence = 1;

        int expectedStrength = 1;
        int expectedDexterity = 7;
        int expectedIntelligence = 1;

        // Act
        int actualStrength = (int) myRanger.getStrength();
        int actualDexterity = (int) myRanger.getDexterity();
        int actualIntelligence = (int) myRanger.getIntelligence();

        //Assert
        assertEquals(actualStrength, expectedStrength);
        assertEquals(actualDexterity, expectedDexterity);
        assertEquals(actualIntelligence, expectedIntelligence);
    }

    @Test
    public void is_ranger_attributes_increased_when_levelling_up()
    {
        // Arrange
        Ranger myRanger = new Ranger("Baxia");
        myRanger.levelUp();
        int expectedStrength = 2;
        int expectedDexterity = 12;
        int expectedIntelligence = 2;

        // Act
        int actualStrength = (int) myRanger.getStrength();
        int actualDexterity = (int) myRanger.getDexterity();
        int actualIntelligence = (int) myRanger.getIntelligence();

        // Assert
        assertEquals(actualStrength, expectedStrength);
        assertEquals(actualDexterity, expectedDexterity);
        assertEquals(actualIntelligence, expectedIntelligence);
    }

}