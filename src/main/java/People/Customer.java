package People;

import Product.Game;

import java.util.ArrayList;
import java.util.Scanner;

public class Customer {
    
    private double wallet;
    private ArrayList<Game> ownedGames;

    public Customer(double wallet, ArrayList<Game> ownedGames) {
        this.wallet = wallet;
        this.ownedGames = ownedGames;
    }

    public double getWallet() {
        return wallet;
    }

    public void setWallet(double wallet) {
        this.wallet = wallet;
    }

    public ArrayList<Game> getOwnedGames() {
        return ownedGames;
    }

    public void setOwnedGames(ArrayList<Game> ownedGames) {
        this.ownedGames = ownedGames;
    }

    public String requestGame(String title) {
//        Scanner input = new Scanner(System.in);
//        System.out.println("Request game:");
//        String title = input.nextLine();
        return title;
    }

    public void addGame(Game game) {
        this.ownedGames.add(game);
    }
}
