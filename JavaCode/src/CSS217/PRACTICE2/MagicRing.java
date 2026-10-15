package CSS217.PRACTICE2;

class MagicRing extends CharacterDecorator {

    public MagicRing(Character character) {
        super(character);
    }

    @Override
    public String getDescription() {
        return character.getDescription() + " + MagicRing";
    }

    @Override
    public int getAttackPower() {
        return character.getAttackPower() + 12;
    }
}