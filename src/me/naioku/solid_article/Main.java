package me.naioku.solid_article;

public class Main {
    public static void main(String[] args) {
        Player player = new Player();
        player.addExperience(499);
        player.showPlayerStats();

        player.addExperience(1);
        player.showPlayerStats();

        player.addExperience(1000);
        player.showPlayerStats();

        player.castActiveSpell();

        player.setActiveSpell(new Slow());
        player.castActiveSpell();

        player.setActiveSpell(new DragonShout());
        player.castActiveSpell();

    }
}
