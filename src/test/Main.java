package test;

import model.Champion;
import service.ChampionService;

public class Main {
    public static void main(String[] args) {
        Champion champion = Champion.getInstance();
        champion.setName("Aronian");
        champion.setYear(2010);
        System.out.println(champion);
        System.out.println(champion.hashCode());
        ChampionService.serializeChampion(champion);

        Champion newChampion = ChampionService.deserializeChampion();
        System.out.println(newChampion);
        System.out.println(newChampion.hashCode());

        System.out.println(champion.equals(newChampion));
        System.out.println(champion == newChampion);
    }
}
