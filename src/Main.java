public class Main {
    public static void main(String[] args) {
        Mage mage = new Mage(200, 50, "Fireball");
        Medic medic = new Medic(200, 25, "Heal");
        Warrior warrior = new Warrior(300, 55, "Critical Damage");

        HavingSuperAbility [] heroes = {warrior, mage, medic};
        for (int i = 0; i < heroes.length ; i++) {
            System.out.println(heroes[i].superAbilityType());
        }
    }
}