package me.naioku.solid_article.skill_classes.mage;

public class Mage {

    private Spell activeSpell = new Fireball();

    public void setActiveSpell(Spell activeSpell) {
        this.activeSpell = activeSpell;
    }

    public void castActiveSpell() {
        activeSpell.cast();
    }
}
