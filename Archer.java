public class Archer extends Warrior {

    public Archer(String name, int healthPoint, Bow bow, WoodenShield woodenShield) {
        super(name, healthPoint, bow, woodenShield);
    }

    @Override
    public String toString() {
        return "Archer, " + super.toString();
    }

    public int shotRange() {
        return ((Bow) getWeapon()).getRange();
    }
    

    public int  strengthWoodenShield() {
        return ((WoodenShield) getDefended()).getRepulse();
    }
}