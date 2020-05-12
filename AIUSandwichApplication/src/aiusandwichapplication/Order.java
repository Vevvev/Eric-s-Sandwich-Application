/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aiusandwichapplication;

/**
 *
 * @author ericb
 */
public class Order {
    private String beverage;
    private String bread;
    private String meatType;
    private SandwichSize size;
    
    public Order(String beverage, String bread, String meatType, SandwichSize size){
        this.beverage=beverage;
        this.bread=bread;
        this.size=size;
        this.meatType=meatType;
    }

    /**
     * @return the beverage
     */
    public String getBeverage() {
        return beverage;
    }

    /**
     * @param beverage the beverage to set
     */
    public void setBeverage(String beverage) {
        this.beverage = beverage;
    }

    /**
     * @return the bread
     */
    public String getBread() {
        return bread;
    }

    /**
     * @param bread the bread to set
     */
    public void setBread(String bread) {
        this.bread = bread;
    }

    /**
     * @return the meatType
     */
    public String getMeatType() {
        return meatType;
    }

    /**
     * @param meatType the meatType to set
     */
    public void setMeatType(String meatType) {
        this.meatType = meatType;
    }

    /**
     * @return the size
     */
    public SandwichSize getSize() {
        return size;
    }

    /**
     * @param size the size to set
     */
    public void setSize(SandwichSize size) {
        this.size = size;
    }
}
