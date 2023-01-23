public class Swordman extends Warrior {

    public Swordman(String name, int healthPoint, Sword sword, IronShield ironShield) {
        super(name, healthPoint, sword, ironShield);
    }

    public int  strengthIronShield() {
        return ((IronShield) getDefended()).getArmor();
    }

    @Override
    public String toString() {
        return "Swordman, " + super.toString();
    }
    
}