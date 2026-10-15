package CSS217.PRACTICE2;
public class MainCharacter {
    public static void main(String[] args) {

        Character warrior = new MagicRing(
                new Armor(
                        new Sword(
                                new Warrior()
                        )
                )
        );


        System.out.println("Character: " +warrior.getDescription());
        System.out.println("Attack Power: " +warrior.getAttackPower());

        System.out.println();
        Character mage =
                new Armor(
                        new MagicRing(
                                new Mage()
                        )
                );

        Character mage2 =
                new Headband(new Armor(new Mage()));


        System.out.println("Character: " +mage.getDescription());
        System.out.println("Attack Power: " +mage.getAttackPower());

        System.out.println("Character: " +mage2.getDescription());
        System.out.println("Attack Power: " +mage2.getAttackPower());
    }
}