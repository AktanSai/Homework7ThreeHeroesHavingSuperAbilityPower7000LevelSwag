public class Warrior extends Hero{


    public Warrior(int health, int damage, String superAbility) {
        super(health, damage, superAbility);
    }

    @Override
    public String superAbilityType() {
        return "Warrior CRITICAL EMOTIONAL DAMAGE";
    }
}
