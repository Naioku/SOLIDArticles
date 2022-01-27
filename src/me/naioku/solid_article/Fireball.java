package me.naioku.solid_article;

public class Fireball implements Spell {

    @Override
    public void cast() {
        System.out.println("Cast: FIREBALL!");
    }

    @Override
    public void useOnYourself() throws NoSuchMethodException {
        throw new NoSuchMethodException();
    }
}
