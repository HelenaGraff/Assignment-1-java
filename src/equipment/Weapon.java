package equipment;

public class Weapon extends Equipment{

    double damage;
   // double DPS;
    String type;

    public Weapon(String name, int requiredLevel, String equipmentSlot, double damage, String type) {
        super(name, requiredLevel, equipmentSlot);
        this.damage = damage;
       // this.DPS = damage;
        this.type = type;
    }

    @Override
    public void getType() {

    }

    /*public double getDPS()
    {
        return this.DPS;
    }

     */
}
