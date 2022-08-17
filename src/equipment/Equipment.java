package equipment;

public abstract class Equipment implements EquipmentType {

    String name;
    int requiredLevel;
    String equipmentSlot;

    public Equipment(String name, int requiredLevel, String equipmentSlot) {
        this.name = name;
        this.requiredLevel = requiredLevel;
        this.equipmentSlot = equipmentSlot;
    }

    public String getName() {
        return name;
    }

    public int getRequiredLevel() {
        return requiredLevel;
    }

    public String getEquipmentSlot() {
        return equipmentSlot;
    }

    @Override
    public String toString() {
        return "'" + name + "'";
    }

    public String getDetails(){
        return "I'm a: " + this.name;
    }
}
