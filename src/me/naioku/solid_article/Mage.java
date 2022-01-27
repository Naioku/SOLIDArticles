package me.naioku.solid_article;

public class Mage {

    public void castSpell(Fireball fireball) {
        fireball.cast();
    }

    public void castSpell(Slow slow) {
        slow.cast();
    }

    public void castSpell(DragonShout dragonShout) {
        dragonShout.cast();
    }
}
