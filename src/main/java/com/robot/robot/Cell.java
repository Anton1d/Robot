package com.robot.robot;

import com.robot.robot.Map;

public class Cell extends Map {
    static int coordonnéex;
    static int coordonnéey;
    public static int mur;
    protected int murs; //stocker sous un entier, les centaines indiques des murs en biais, les dizaines, les murs d'ouest et les unités, les murs au nords

    public Cell(){
        setCoordonnéex(Map.x);
        setCoordonnéey(Map.y);
        setMurs(Map.mur[Map.x][Map.y]);
    }

    public static void setCoordonnéey(int coordonnéey) {
        Cell.coordonnéey = coordonnéey;
    }

    public static void setCoordonnéex(int coordonnéex) {
        Cell.coordonnéex = coordonnéex;
    }

    public void setMurs(int murs) {
        this.murs = murs;
    }

    public static int getCoordonnéex() {
        return coordonnéex;
    }

    public static int getCoordonnéey() {
        return coordonnéey;
    }

    public int getMurs() {
        return murs;
    }
}
