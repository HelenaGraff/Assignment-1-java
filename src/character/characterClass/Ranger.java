package character.characterClass;

public class Ranger extends CharacterClass {
    public Ranger(String name) {
        super(name);
        this.strength = 1;
        this.dexterity = 7;
        this.intelligence = 1;
        this.usableArmour = new String[]{"Leather", "Mail"};
        this.usableWeapons = new String[]{"Bow"};
    }

    public String getClassName() {
        return "Ranger";
    }

    @Override
    public void levelUp() {
        this.level += 1;
        this.strength += 1;
        this.dexterity += 5;
        this.intelligence += 1;
    }

}
