package CSS217.PRACTICE2;

class Sword extends CharacterDecorator {

    public Sword(Character character) {
        super(character);
    }

    @Override
    public String getDescription() {
        return character.getDescription() + " + Sword";
    }

    @Override
    public int getAttackPower() {
        return character.getAttackPower() + 10;
    }
}
