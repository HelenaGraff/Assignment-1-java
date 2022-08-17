package equipment;

public class Armour extends Equipment{

    String type;

    public Armour(String name, int requiredLevel, String equipmentSlot, String type) {
        super(name, requiredLevel, equipmentSlot);
        this.type = type;
    }

    @Override
    public void getType() {

    }
}
