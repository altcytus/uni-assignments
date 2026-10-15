package CSS217.PRACTICE2;

class Armor extends CharacterDecorator {

    public Armor(Character character) {
        super(character);
    }

    @Override
    public String getDescription() {
        return character.getDescription() + " + Armor";
    }

    @Override
    public int getAttackPower() {
        return character.getAttackPower() + 1;
    }
}