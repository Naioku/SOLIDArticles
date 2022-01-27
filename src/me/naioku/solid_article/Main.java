package me.naioku.solid_article;

public class Main {
    public static void main(String[] args) {
        Mage mage = new Mage();

        mage.castSpell(new Fireball());
        mage.castSpell(new Slow());
        mage.castSpell(new DragonShout());
        mage.castSpell(new Heal());

        try {
            mage.useSpellOnYourself(new Heal());
        } catch (NoSuchMethodException e) {
            System.out.println("No such method implemented!");
        }

        //mage.useSpellOnYourself(new DragonShout());
    }
}
