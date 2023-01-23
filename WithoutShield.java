public class WithoutShield extends Warrior{

    public WithoutShield(String name, int healthPoint, Sword sword, Defended defended) {
        super(name, healthPoint, sword, null);
            
    }

    @Override
    public String toString() {
        return "Warrior without a shield, " + super.toString();
    }

    // @Override
    // public Defended getDefended() {
    //     return null;
    // }
    
}
