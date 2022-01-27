package me.naioku.solid_article;

public class Player {

    private int level = 0;
    private long experience = 0;
    private long nextLevelThreshold = 500;

    private Spell activeSpell = new Fireball();

    /* PLAYER STATS */
    public void showPlayerStats() {
        System.out.println("=== PLAYER STATISTICS ===");
        System.out.println("  -> Level: " + level);
        System.out.println("  -> Experience: " + experience);
        System.out.println("  -> Next level threshold: " + nextLevelThreshold);
        System.out.println();
    }

    public void addExperience(int experience) {
        this.experience += experience;
        while (isNextLevel()) {
            levelUp();
            calculateNewThreshold();
        }
    }

    private void calculateNewThreshold() {
        nextLevelThreshold = Math.round(nextLevelThreshold * 1.5);
    }

    private boolean isNextLevel() {
        return experience >= nextLevelThreshold;
    }

    private void levelUp() {
        level++;
    }
    /* END OF PLAYER STATS */

    /* MAGE */
    public void setActiveSpell(Spell activeSpell) {
        this.activeSpell = activeSpell;
    }

    public void castActiveSpell() {
        activeSpell.cast();
    }
    /* END OF MAGIC */
}
