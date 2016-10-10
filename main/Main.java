package main;

import giftCreator.CreatorGift;
import sweetTypes.*;
import sweets.Sweet;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Elena on 10.10.2016.
 */
public class Main {
    public static void main(String args[]) {

        List<Sweet> gift = new ArrayList<>();

        Sweet sweet1 = new Butterscotch("Iris kitty", 5, 3, 5, 1);

        Sweet sweet2 = new Chocolate("Shokolapki", 6.5, 4, 7, 2);

        Sweet sweet3 = new Jelly("Jelly bears", 4.96, 3, 6, 2);

        Sweet sweet4 = new Liqueur("Capital", 8, 4, 7, 2);

        Sweet sweet5 = new Wafer("Aeroflot", 4, 3, 5, 0.5);

        gift.add(sweet1);
        gift.add(sweet2);
        gift.add(sweet3);
        gift.add(sweet4);
        gift.add(sweet5);

        CreatorGift creator = new CreatorGift();

        creator.makeGift(gift);

        System.out.println("Weight of gift:");
        System.out.print(creator.totalWeight());
        System.out.println();

        System.out.println("Sort by price:");
        creator.sortByPrice();
        creator.showGift();
        System.out.println();

        System.out.println("Sort by amount of sugar");
        creator.sortBySugar();
        creator.showGift();
        System.out.println();

        System.out.println("Sort by weight:");
        creator.sortByWeight();
        creator.showGift();
        System.out.println();

        System.out.println("Search by price (<=10), amount of sugar( <= 3), weight (<= 5):");
        List<Sweet> sweetList = creator.searchSweet(10, 3, 5);
        for(Sweet elem: sweetList){
            System.out.println(elem.toString());
        }

        System.out.println();
    }

}
