package me.naioku.solid_article;

import me.naioku.solid_article.leveling_system.LevelingService;

public class Monster {

    LevelingService levelingService = new LevelingService();

    public void showMonsterStats() {
        levelingService.showPlayerStats();
    }

    public void addExperience(int experience) {
        levelingService.addExperience(experience);
    }
}
