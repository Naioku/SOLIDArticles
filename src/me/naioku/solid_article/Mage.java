package me.naioku.solid_article;

public class Mage {

    public void castSpell(Spell spell) {
        spell.cast();
    }

    public void useSpellOnYourself(Spell spell) {
        spell.useOnYourself();
    }
}
