package me.naioku.solid_article.skill_classes.mage;

public enum Spells {
    FIREBALL(new Fireball(), "Fireball"),
    SLOW(new Slow(), "Slow"),
    DRAGON_SHOUT(new DragonShout(), "DragonShout");

    private Spell spell;
    private String spellName;

    Spells(Spell spell, String spellName) {
        this.spell = spell;
        this.spellName = spellName;
    }

    public void castSpell() {
        spell.cast();
    }

    public String getSpellName() {
        return spellName;
    }
}
