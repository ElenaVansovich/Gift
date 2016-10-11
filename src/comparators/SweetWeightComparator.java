package comparators;

import sweets.Sweet;

import java.util.Comparator;

/**
 * Created by Elena on 10.10.2016.
 */
public class SweetWeightComparator implements Comparator<Sweet> {
    /**
     * @param o1
     * @param o2
     * @return
     */
    @Override
    public int compare(Sweet o1, Sweet o2) {
        if(o1.getWeight()> o2.getWeight())
            return 1;
        else if(o1.getWeight()< o2.getWeight())
            return -1;
        else
            return 0;
    }
}
