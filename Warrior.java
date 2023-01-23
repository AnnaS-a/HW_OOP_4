public abstract class Warrior {
    private String name;
    private int healthPoint;
    private Weaponable weapon;
    private Defended defended;
    
    public Warrior(String name, int healthPoint, Weaponable weapon, Defended defended) {
        this.name = name;
        this.healthPoint = healthPoint;
        this.weapon = weapon;
        this.defended = defended;
    }
    
    public String getName() {
        return name;
    }
    public int getHealthPoint() {
        return healthPoint;
    }
    public Weaponable getWeapon() {
        return weapon;
    }

    public Defended getDefended() {
        return defended;
    }

    public void setHealthPoint(int healthPoint) {
        this.healthPoint = healthPoint;
    }

    @Override
    public String toString() {
        // return String.format("Warrior name= %s, healthPoint= %d, weapon= %s ,defended = %d", 
        // name, healthPoint, weapon, defended);
        return "Warrior [name= " + name + ", healthPoint= " + healthPoint + ", weapon= " + weapon + ", defended= " + defended + "]";
    }

    
}
