package me.naioku.solid_article.skill_classes.mage;

public class Slow implements Spell {
    @Override
    public void cast() {
        System.out.println("SLOW!");
    }
}
