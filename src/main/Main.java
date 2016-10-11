package main;

import sweets.CreatorGift;
import sweets.*;
import sweets.Sweet;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by Elena on 10.10.2016.
 */
public class Main {

    public static final String filename = "date.txt";

    public static void main(String args[]) throws IOException {

        BufferedReader reader = new BufferedReader(new FileReader(filename));

        String line;

        List<Sweet> sweets = new ArrayList<>();
        while ((line = reader.readLine()) != null) {
            if(line.equals(SweetType.BUTTERSCOTCH.toString())){
                sweets.add(new Butterscotch(reader.readLine(),
                                        Double.parseDouble(reader.readLine()),
                                        Double.parseDouble(reader.readLine()),
                                        Double.parseDouble(reader.readLine()),
                                        Double.parseDouble(reader.readLine())));
            }
            if(line.equals(SweetType.CHOCOLATE.toString())){
                sweets.add(new Chocolate(reader.readLine(),
                        Double.parseDouble(reader.readLine()),
                        Double.parseDouble(reader.readLine()),
                        Double.parseDouble(reader.readLine()),
                        Double.parseDouble(reader.readLine())));
            }
            if(line.equals(SweetType.JELLY.toString())){
                sweets.add(new Jelly(reader.readLine(),
                        Double.parseDouble(reader.readLine()),
                        Double.parseDouble(reader.readLine()),
                        Double.parseDouble(reader.readLine()),
                        Double.parseDouble(reader.readLine())));
            }
            if(line.equals(SweetType.LIQUEUR.toString())){
                sweets.add(new Liqueur(reader.readLine(),
                        Double.parseDouble(reader.readLine()),
                        Double.parseDouble(reader.readLine()),
                        Double.parseDouble(reader.readLine()),
                        Double.parseDouble(reader.readLine())));
            }
            if(line.equals(SweetType.WAFER.toString())){
                sweets.add(new Wafer(reader.readLine(),
                        Double.parseDouble(reader.readLine()),
                        Double.parseDouble(reader.readLine()),
                        Double.parseDouble(reader.readLine()),
                        Double.parseDouble(reader.readLine())));
            }
        }

        CreatorGift creator = new CreatorGift();

        creator.makeGift(sweets);

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
        List<Sweet> searchSweets = creator.searchSweet(10, 3, 5);
        for(Sweet sweet: searchSweets){
            System.out.println(sweet.toString());
        }

        System.out.println();
    }

}
