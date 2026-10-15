package CSS217.PRACTICE2;public class Headband extends CharacterDecorator {

    public Headband(Character character) {
        super(character);
    }

    @Override
    public String getDescription() {
        return character.getDescription() + " + Headband";
    }

    @Override
    public int getAttackPower() {

        if (hasArmor(character)) {
            return character.getAttackPower() + 10000;
        }

        return character.getAttackPower() + 2;
    }

    private boolean hasArmor(Character ch) {

        if (ch instanceof Armor) {
            return true;
        }

        if (ch instanceof CharacterDecorator) {
            return hasArmor(((CharacterDecorator) ch).character);
        }

        return false;
    }
}