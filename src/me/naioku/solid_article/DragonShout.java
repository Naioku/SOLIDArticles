package me.naioku.solid_article;

public class DragonShout implements Spell {

    @Override
    public void cast() {
        System.out.println("Cast: FUS RO DAH!");
    }

    @Override
    public void useOnYourself() throws NoSuchMethodException {
        throw new NoSuchMethodException();
    }
}
