import Distributor.Shop;
import People.Customer;
import Product.*;
import org.junit.Before;
import org.junit.Test;

import java.time.Year;
import java.util.ArrayList;
import java.util.HashMap;

import static org.junit.Assert.assertEquals;

public class CustomerTest {

    Customer customer1;
    Game game1;
    Game game2;
    Game game3;
    Shop shop;
    N64 n64;
    PS1 ps1;
//    HashMap<Game, Integer> testHashMap;

    @Before
    public void before() {
        customer1 = new Customer(100, new ArrayList<Game>());
        game1 = new Game("Mortal Kombat", Genre.ACTION, "Microsoft", n64, 7.99, Year.of(1992) );
        game2 = new Game("Mortal Kombat 2", Genre.ACTION, "Microsoft", ps1, 7.99, Year.of(1992) );
        game3 = new Game("Duke Nuken 3D", Genre.ACTION, "3D Realms", ps1, 14.99, Year.of(1996) );

        ps1 = new PS1();
        n64 = new N64();


        shop = new Shop(new HashMap<Game, Integer>(), 200.00);

        shop.buyFromSupplier(game1);
        shop.buyFromSupplier(game2);
        shop.buyFromSupplier(game3);
    }

    @Test
    public void canBuyGamesFromSupplier() {
        assertEquals(3, shop.getGamesSize());
    }

    @Test
    public void canSellGameToCustomer() {
        shop.sellGame(customer1, game2);
        assertEquals("Mortal Kombat 2", customer1.getOwnedGames().get(0).getTitle());
        assertEquals( 207.99, shop.getTill(), 0.01);



}
