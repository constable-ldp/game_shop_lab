package Distributor;

import java.util.HashMap;

import People.Customer;
import Product.Game;

public class Shop {

    private HashMap<Game, Integer> games;
    private Double till;

     public Shop(HashMap<Game, Integer> games, Double till) {
         this.games = games;
         this.till = till;
     }


    public Double getTill() {
        return till;
    }

    public void setTill(Double till) {
        this.till = till;
    }

    public HashMap<Game, Integer> getGames() {
        return games;
    }

    public int getGamesSize() {
         return games.size();
    }

    public void setGames(HashMap<Game, Integer> games) {
        this.games = games;
    }

    public void sellGame(Customer customer,Game game) {
         if (customer.getWallet() >= game.getPrice()) {
             games.put(game, games.get(game) - 1);
             customer.addGame(game);
             customer.setWallet(customer.getWallet() - game.getPrice());
             this.till += game.getPrice();
         }

    }

    public void buyFromSupplier(Game game) {
         this.games.put(game, 1);
         this.till -= game.getPrice()*0.8;

    }
}
