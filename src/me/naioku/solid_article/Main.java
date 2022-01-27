package me.naioku.solid_article;

public class Main {
    public static void main(String[] args) {
        Mage mage = new Mage();

        mage.castSpell(new Fireball());
        mage.castSpell(new Slow());
        mage.castSpell(new DragonShout());
        mage.castSpell(new Heal());
        mage.useSpellOnYourself(new Heal());
    }
}
