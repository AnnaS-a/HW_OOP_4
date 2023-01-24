import java.util.*;

public class Team<E extends Warrior> implements Iterable<E> {
    private List<E> team = new ArrayList<>();

    public Team<E> addWarriorToTeam(E person) {
        team.add(person);
        return this;
    }

    @Override
    public Iterator<E> iterator() {
        return team.iterator();
    }

    public String maxTeamRange() {
        int maxRange = 0;
        for (E item : team) {
            if (item instanceof Archer) {
                if (((Archer) item).shotRange() > maxRange)
                    maxRange = ((Archer) item).shotRange();
            }
        }
        return String.format("maxRange= %d", maxRange);
        // return maxRange;
    }

    public String minTeamProtection() {
        int minRepulse = Integer.MAX_VALUE;
        int minArmor = Integer.MAX_VALUE;
        for (E item : team) {
            if (item instanceof Archer) {
                if (((Archer) item).strengthWoodenShield() < minRepulse) {
                    minRepulse = ((Archer) item).strengthWoodenShield();
                }
            }
        }
        for (E item : team) {
            if (item instanceof Swordman) {
                if (((Swordman) item).strengthIronShield() < minArmor) {
                    minArmor = ((Swordman) item).strengthIronShield();
                }
            }
        }
        if (minRepulse == Integer.MAX_VALUE) {
            minRepulse = 0;
        }
        if (minArmor == Integer.MAX_VALUE) {
            minArmor = 0;
        }
        return String.format("minRepulse= %d, minArmor= %d", minRepulse, minArmor);
    }


    // public String minTeamProtection() {
    //     int minArmor = 1000;
    //     for (E item : team) {
    //         if (item.getDefended().protection() < minArmor) {
    //         minArmor = item.getDefended().protection();
    //         }
    //     }
    //     return String.format("minArmor= %d", minArmor);    
    // }
}


