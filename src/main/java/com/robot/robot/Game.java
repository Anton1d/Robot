package com.robot.robot;

import java.util.List;

public class Game {
    static int nbrtour;
    static int deplacement;
    List<Player> players;
    List<Jeton> jetons;
    List<Map> map;
    public static void game(){
        Map.creationmap();
    }
}
