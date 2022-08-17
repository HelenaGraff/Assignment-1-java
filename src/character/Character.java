package character;

import equipment.Equipment;

import java.util.HashMap;
import java.util.Map;

public abstract class Character {

    private String name;
    double damage;
    public int level;
    Map<String, Equipment> equipmentMap;

    public Character(String name) {
        this.name = name;
        this.level = 1;
        this.equipmentMap = new HashMap<>();
        this.damage = 0;

        equipmentMap.put("Head", null);
        equipmentMap.put("Body", null);
        equipmentMap.put("Legs", null);
        equipmentMap.put("Weapon", null);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public char getEquipment() {
        equipmentMap.forEach((key, value) -> {
                    if (value == null) {
                        System.out.println("You currently don't have anything equipped in the " + key + " slot");
                    } else {
                        System.out.println("You're equipping a: " + value
                                + " in your: "
                                + key + " slot");
                    }
                }
        );
        return 0;
    }

    public void dealDamage(){

    }

    public void addEquipment(Equipment equipment) {
        equipmentMap.putIfAbsent(equipment.getEquipmentSlot(), equipment);
    }

    public double getDamage() {
        return damage;
    }

    public void setDamage(double damage) {
        this.damage = damage;
    }

    public String getDetails() {
        return "I'm a character";
    }
}
