package me.naioku.solid_article;

public class Heal implements CastSpells, UseOnYourselfSpells {

    @Override
    public void cast() {
        System.out.println("Cast: HEAL!");
    }

    @Override
    public void useOnYourself() {
        System.out.println("Use on yourself: HEAL!");
    }
}
