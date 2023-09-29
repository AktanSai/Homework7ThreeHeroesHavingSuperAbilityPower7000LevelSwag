public class Medic extends Hero{
    public Medic(int health, int damage, String superAbility) {
        super(health, damage, superAbility);
    }

    @Override
    public String superAbilityType() {
        return "Medic is healing everyone";
    }
}
