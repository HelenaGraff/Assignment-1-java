package character.characterClass;

public class Warrior extends CharacterClass {
    public Warrior(String name) {
        super(name);
        this.strength = 5;
        this.dexterity = 2;
        this.intelligence = 1;
        this.usableArmour = new String[]{"Mail"};
        this.usableWeapons = new String[]{"Axe", "Hammer", "Sword"};
    }

    public String getClassName() {
        return "Warrior";
    }

    @Override
    public void levelUp() {
        this.level += 1;
        this.strength += 3;
        this.dexterity += 2;
        this.intelligence += 1;
    }
}
