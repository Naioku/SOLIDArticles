package me.naioku.solid_article;

public class Mage {

    public void castSpell(CastSpells spell) {
        spell.cast();
    }

    public void useSpellOnYourself(UseOnYourselfSpells spell) {
        spell.useOnYourself();
    }
}
