// Реализовать абстрактный класс Warrior, с полями name, weapon, healthPoint
// Создать интерфейс Weapon с методом damage(), который будет показывать наносимый урон
// На основе класса Warrior создать различные типы воинов, например, лучник, меченосец, ополченец и т.п.
// У лучника добавить поле расстояние поражения. 
// Создать различные виды вооружения, например, меч, лук, лопата.
// Обеспечить, чтобы определенный тип воина мог нести только определенной оружие
// Создать класс командира

public class Main {
    public static void main(String[] args) {
        Team <Swordman> team1 = new Team<>();
        team1.addWarriorToTeam(new Swordman("Vasya", 250, new Sword(25), new IronShield(10, 30)))
        .addWarriorToTeam(new Swordman("Gena", 170, new Sword(40), new IronShield(15, 18)))
        .addWarriorToTeam(new Swordman("John", 200, new Sword(50), new IronShield(20, 20)));
        
        for (Swordman swordman : team1) {
            System.out.println(swordman);
        }

        Team <Archer> team2 = new Team<>();
        team2.addWarriorToTeam(new Archer("Kolya", 150, new Bow(100, 50), new WoodenShield(15, 35)))
        .addWarriorToTeam(new Archer("Petr", 220, new Bow(65, 75), new WoodenShield(22, 30)))
        .addWarriorToTeam(new Archer("Paul", 200, new Bow(75, 70), new WoodenShield(20, 33)));

        for (Archer person : team2) {
            System.out.println(person);
        }

        Team <Warrior> team3 = new Team<>();
        team3.addWarriorToTeam(new Swordman("Leo", 230, new Sword(40), new IronShield(15, 15)))
        .addWarriorToTeam(new Swordman("Oleg", 180, new Sword(20), new IronShield(15, 20)))
        .addWarriorToTeam(new Archer("Sem", 210, new Bow(140, 55), new WoodenShield(20, 21)))
        .addWarriorToTeam(new Archer("Nik", 190, new Bow(120, 60), new WoodenShield(25, 35)))
        .addWarriorToTeam(new WithoutShield("Vova", 250, new Sword(77), null));

        for (Warrior pers : team3) {
            System.out.println(pers);
        }

        System.out.printf("team1 " + team1.maxTeamRange() + "\n");
        System.out.printf("team2 " + team2.maxTeamRange() + "\n");
        System.out.printf("team3 " + team3.maxTeamRange() + "\n");
        System.out.printf("team1 " + team1.minTeamProtection() + "\n");
        System.out.printf("team2 " + team2.minTeamProtection() + "\n");
        System.out.printf("team3 " + team3.minTeamProtection());


    }
    
    
}