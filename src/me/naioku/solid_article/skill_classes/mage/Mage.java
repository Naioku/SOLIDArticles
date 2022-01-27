package me.naioku.solid_article.skill_classes.mage;

public class Mage {

    private Spells activeSpell = Spells.FIREBALL;

    public void setActiveSpell(String activeSpell) {
        boolean isSpellFound = false;
        for (Spells spellFromEnum : Spells.values()) {
            if (spellFromEnum.getSpellName().equals(activeSpell)) {
                this.activeSpell = spellFromEnum;
                isSpellFound = true;
            }
        }
        if (!isSpellFound) {
            System.out.println("No such spell!");
        }
    }

    public void castActiveSpell() {
        activeSpell.castSpell();
    }
}
