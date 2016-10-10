package main;

import giftCreator.CreatorGift;
import sweetTypes.*;
import sweets.Sweet;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by Elena on 10.10.2016.
 */
public class Main {
    public static void main(String args[]) throws IOException {

        BufferedReader reader = new BufferedReader(new FileReader("date.txt"));

        String line;

        List<Sweet> gift = new ArrayList<>();
        while ((line = reader.readLine()) != null) {
            if(line.equals("Butterscotch")){
                gift.add(new Butterscotch(reader.readLine(),
                                        Double.parseDouble(reader.readLine()),
                                        Double.parseDouble(reader.readLine()),
                                        Double.parseDouble(reader.readLine()),
                                        Double.parseDouble(reader.readLine())));
            }
            if(line.equals("Chocolate")){
                gift.add(new Chocolate(reader.readLine(),
                        Double.parseDouble(reader.readLine()),
                        Double.parseDouble(reader.readLine()),
                        Double.parseDouble(reader.readLine()),
                        Double.parseDouble(reader.readLine())));
            }
            if(line.equals("Jelly")){
                gift.add(new Jelly(reader.readLine(),
                        Double.parseDouble(reader.readLine()),
                        Double.parseDouble(reader.readLine()),
                        Double.parseDouble(reader.readLine()),
                        Double.parseDouble(reader.readLine())));
            }
            if(line.equals("Liqueur")){
                gift.add(new Jelly(reader.readLine(),
                        Double.parseDouble(reader.readLine()),
                        Double.parseDouble(reader.readLine()),
                        Double.parseDouble(reader.readLine()),
                        Double.parseDouble(reader.readLine())));
            }
            if(line.equals("Wafer")){
                gift.add(new Jelly(reader.readLine(),
                        Double.parseDouble(reader.readLine()),
                        Double.parseDouble(reader.readLine()),
                        Double.parseDouble(reader.readLine()),
                        Double.parseDouble(reader.readLine())));
            }
        }

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
