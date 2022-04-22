package com.robot.robot;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Debut {
    public List<Player> players;
    public void StartGame(){
        System.out.println("Bonjour cher joueurs,\nVeuillez entrer le nombre de particiant:");
        Scanner scanner = new Scanner(System.in);
        int nbrjoueur = scanner.nextInt();
        this.players= new ArrayList();
        for(int i=1;i<=nbrjoueur;i++){
            players.add(new Player());
        }
        scanner.nextLine();
        for(int i=1;i<=players.size();i++){
            System.out.println("Joueur "+i+"\nQuel est votre nom:");
            String nom = scanner.nextLine();
            Player var=players.get(i-1);
            var.nom=nom;
            System.out.println("Voici le nom que vous avez choisi: "+var.nom);
        }
    }
    public static List<Player> players(){
        return players();
    }
}
