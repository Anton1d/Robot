package com.robot.robot;

public class Player {
    public static int point;
    public String nom;

    public static int getPoint() {
        return point;
    }

    public String getNom() {
        return nom;
    }

    public static void setPoint(int point) {
        Player.point = point;
    }

    public void setNom(String nom) {
        // ne dois pas pouvoir se faire utiliser
        System.out.println("action impossible, on ne peut changer de nom en cours de partie");
    }
    public Player(){
        point=0;
        nom="";
    }
}
