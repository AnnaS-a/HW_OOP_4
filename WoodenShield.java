import java.util.Random;

public class WoodenShield extends Shield {
    private int repulse;

    public WoodenShield(int pointOfProtection, int repulse) {
        super(pointOfProtection);
        this.repulse = repulse;
    }

    public int getRepulse() {
        return repulse;
    }

    

    @Override
    public int protection() {
        return new Random().nextInt(0, pointOfProtection);
    }

    @Override
    public String toString() {
        return String.format("WoodenShield protection= %d, repulse= %d", pointOfProtection, repulse);
    }
    
}
