package character.characterClass;

public class Rogue extends CharacterClass {
    public Rogue(String name) {
        super(name);
        this.strength = 2;
        this.dexterity = 6;
        this.intelligence = 1;
        this.usableArmour = new String[]{"Leather", "Mail"};
        this.usableWeapons = new String[]{"Dagger", "Sword"};

    }

    public String getClassName() {
        return "Rouge";
    }

    @Override
    public void levelUp() {
        this.level += 1;
        this.strength += 1;
        this.dexterity += 4;
        this.intelligence += 1;
    }

}
