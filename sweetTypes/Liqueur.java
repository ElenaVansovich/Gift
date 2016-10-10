package sweetTypes;

import sweets.Sweet;

/**
 * Created by Elena on 10.10.2016.
 */
public class Liqueur extends Sweet {

    private double liqeueur;

    public Liqueur(){
        super();
    }

    /**
     * @param name
     * @param price
     * @param sugar
     * @param weight
     * @param liqeueur
     */
    public Liqueur(String name, double price, double sugar, double weight, double liqeueur){
        super(name, price, sugar, weight);
        this.liqeueur = liqeueur;
    }

    /**
     * @return
     */
    public double getLiqueur() {
        return liqeueur;
    }

    /**
     * @param liqeueur
     */
    public void setLiqueur(double liqeueur) {
        this.liqeueur = liqeueur;
    }

    /**
     * @return
     */
    @Override
    public String toString() {
        String str = super.toString() +
                "Amount of liqeueur: " + this.getLiqueur() + "\n";
        return str;
    }

    /**
     * @param liqeueurSweet
     * @return
     */
    @Override
    public boolean equals(Object liqeueurSweet){
        if(this == liqeueurSweet){
            return true;
        }if(liqeueurSweet == null){
            return false;
        }
        if(getClass() != liqeueurSweet.getClass()){
            return false;
        }
        if(!super.equals(liqeueurSweet)){
            return false;
        }
        Liqueur other = (Liqueur)liqeueurSweet;
        if(this.liqeueur != other.liqeueur){
            return false;
        }
        return true;
    }

    /**
     * @return
     */
    @Override
    public int hashCode(){
        final int prime = 31;
        int result = super.hashCode()*prime + (int)this.liqeueur;
        return result;
    }

}
