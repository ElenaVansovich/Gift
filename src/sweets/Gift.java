package sweets;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Elena on 10.10.2016.
 */
public class Gift {

    private List<Sweet> gift;

    private int size;

    public Gift(){
        this.gift = new ArrayList<>();
        this.size = 0;
    }

    /**
     * @param size
     */
    public Gift(int size){
        this.size = size;
        this.gift = new ArrayList<>(size);
    }

    /**
     * @return
     */
    public String toString(){
        String str = "";
        for(Sweet sweet : this.gift){
            str += sweet.toString()+"\n";
        }
        return str;
    }

    /**Adding sweet to gift
     * @param sweet
     */
    public void add(Sweet sweet){
        this.gift.add(sweet);
        this.size++;
    }

    /**Removing sweet from gift
     * @param sweet
     */
    public void remove(Sweet sweet){
        this.gift.remove(sweet);
        this.size--;
    }

    /**
     * @return gift
     */
    public List<Sweet> getGift() {
        return this.gift;
    }

    /**
     * @param gift
     */
    public void setGift(List<Sweet> gift) {
        this.gift = gift;
    }

    /**
     * @return
     */
    public int getSize() {
        return size;
    }

    /**
     * @param size
     */
    public void setSize(int size) {
        this.size = size;
    }

}
