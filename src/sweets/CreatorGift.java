package sweets;

import comparators.SweetPriceComparator;
import comparators.SweetSugarComparator;
import comparators.SweetWeightComparator;

import java.util.LinkedList;
import java.util.List;

/**
 * Created by Elena on 10.10.2016.
 */
public class CreatorGift {

    private Gift gift;

    public CreatorGift(){ }

    /**Making a gift
     * @param gift1
     * @return
     */
    public Gift makeGift(List<Sweet> gift1){
        System.out.println("Making gift...");
        this.gift = new Gift();
        for(Sweet sweet : gift1){
            this.gift.add(sweet);
        }
        System.out.println("Gift was made");
        return this.gift;
    }

    /**Sorting sweets in gift by amount of sugar
     * @return sorted gift
     */
    public Gift sortBySugar() {
        SweetSugarComparator sweetSugarComparator = new SweetSugarComparator();
        this.gift.getGift().sort(sweetSugarComparator);
        return this.gift;
    }

    /**Sorting sweets in gift by price
     * @return sorted gift
     */
    public Gift sortByPrice() {
        SweetPriceComparator sweetPriceComparator = new SweetPriceComparator();
        this.gift.getGift().sort(sweetPriceComparator);
        return this.gift;
    }

    /**Sorting sweets in gift by weight
     * @return sorted gift
     */
    public Gift sortByWeight() {
        SweetWeightComparator sweetWeightComparator = new SweetWeightComparator();
        this.gift.getGift().sort(sweetWeightComparator);
        return this.gift;
    }


    /**Searching sweets with parameters in gift
     * @param price
     * @param sugar
     * @param weight
     * @return list of sweets
     */
    public List<Sweet> searchSweet(double price, double sugar, double weight){
        List<Sweet> sweetList = new LinkedList<>();
        for(Sweet sweet: this.gift.getGift()){
            if(sweet.getPrice() <= price && sweet.getSugar() <= sugar &&
                    sweet.getWeight() <= weight){
                sweetList.add(sweet);
            }
        }
        return sweetList;
    }

    /**Count weight of gift
     * @return weight
     */
    public double totalWeight() {
        double weight = 0;
        for (Sweet sweet : this.gift.getGift()) {
            weight += sweet.getWeight();
        }
        return weight;
    }

    /**Showing created gift
     */
    public void showGift(){
        System.out.println(this.gift.toString());
    }
}
