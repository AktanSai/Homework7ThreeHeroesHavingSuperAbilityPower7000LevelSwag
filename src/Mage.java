public class Mage extends Hero{

    public Mage(int health, int damage, String superAbility) {
        super(health, damage, superAbility);
    }

    @Override
    public String superAbilityType() {
        return "Mage is casting FireBall!";
    }
}
