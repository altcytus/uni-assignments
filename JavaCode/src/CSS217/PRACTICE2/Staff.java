package CSS217.PRACTICE2;

class Staff extends CharacterDecorator {

    public Staff(Character character) {
        super(character);
    }

    @Override
    public String getDescription() {
        return character.getDescription() + " + MagicRing";
    }

    @Override
    public int getAttackPower() {
        return character.getAttackPower() + 6;
    }
}