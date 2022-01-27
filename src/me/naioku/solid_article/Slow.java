package me.naioku.solid_article;

public class Slow implements Spell {

    @Override
    public void cast() {
        System.out.println("Cast: SLOW!");
    }

    @Override
    public void useOnYourself() throws NoSuchMethodException {
        throw new NoSuchMethodException();
    }
}