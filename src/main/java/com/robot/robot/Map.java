package com.robot.robot;

import javafx.scene.control.Cell;

import java.util.List;

public class Map {
    List<robot> tourobot;
    public static Cell[][] cases = new Cell[16][16];
    static boolean collision;
    static int[][] mur;
    public static int x;
    public static int y;
    public static void creationmap(){
        for(int k = 1; k<=4; k++){
            planche(k);
        }
    }
    public static void planche(int k){
        switch (k){
            case 1 :
                planche1(); //à terme, on peux ici appliquer un random pour jongler avec d'autres planches
                break;
            case 2:
                planche2(); //à terme, on peux ici appliquer un random pour jongler avec d'autres planches
                break;
            case 3:
                planche3(); //à terme, on peux ici appliquer un random pour jongler avec d'autres planches
                break;
            case 4:
                planche4(); //à terme, on peux ici appliquer un random pour jongler avec d'autres planches
                break;
        }
    }
    public static void planche1(){
        mur = new int[][]{{0,0,0,10,0,0,0,0},{0,0,200,0,0,0,0,0},{0,0,0,0,0,0,11,0},{0,0,0,0,0,0,1,0,0},{0,0,0,0,0,0,0,0,100},{0,10,0,0,0,0,0,0},{0,1,0,0,0,0,0,0},{1,0,0,0,1,10,0,111}};
        for(int i=0;i<8;i++){
            for(int j = 0;j<8;j++){
                x=i;
                y=j;
                Cell cell;
                cell = new Cell();
                cases[i][j] = cell;
            }
        }
    }
    public static void planche2(){
    }
    public static void planche3(){
    }
    public static void planche4(){
    }

    public static void setCollision(boolean collision) {
        Map.collision = collision;
    }
}

