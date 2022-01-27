package me.naioku.solid_article;

public class Mage {

    public void castSpell(Object spell) {
        if (spell instanceof Fireball) {
            Fireball fireball = (Fireball) spell;
            fireball.cast();
        } else if (spell instanceof Slow) {
            Slow slow = (Slow) spell;
            slow.cast();
        } else {
            System.out.println("No such spell!");
        }
    }
}
