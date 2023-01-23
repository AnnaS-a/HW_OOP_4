import java.util.Random;

public class IronShield extends Shield {
    private int armor;

    public IronShield(int pointOfProtection, int armor) {
        super(pointOfProtection);
        this.armor = armor;
    }

    public int getArmor() {
        return armor;
    }

    @Override
    public int protection() {
        return new Random().nextInt(0, pointOfProtection);
    }

    @Override
    public String toString() {
        return String.format("IronShield protection = %d, armor= %d", pointOfProtection, armor);
    }
    
}
