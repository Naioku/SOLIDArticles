package me.naioku.solid_article;

import me.naioku.solid_article.leveling_system.LevelingService;
import me.naioku.solid_article.skill_classes.mage.Mage;
import me.naioku.solid_article.skill_classes.mage.Spell;

public class Player {

    LevelingService levelingService = new LevelingService();
    Mage mage = new Mage();

    /* PLAYER STATS */
    public void showPlayerStats() {
        levelingService.showPlayerStats();
    }

    public void addExperience(int experience) {
        levelingService.addExperience(experience);
    }
    /* END OF PLAYER STATS */

    /* MAGE */
    public void setActiveSpell(Spell activeSpell) {
        mage.setActiveSpell(activeSpell);
    }

    public void castActiveSpell() {
        mage.castActiveSpell();
    }
    /* END OF MAGIC */
}
