package repel1;


/**
 * SubClass of Item
 */
public class _216_OnSaleItem extends _216_Item {
    /**
     * private instance variable, used for discount percentage
     */
    private double discount;

    /**
     * public constructor for OnSaleItem
     * @param name
     * @param quantity
     * @param catalogNumber
     * @param price
     * @param discount
     *
     * - Calls Super class constructor by passing name,quantity,catalogNumber,price
     * - it will assign the price after deducting(minus) discount from the price
     * - assigns discount
     */
    public _216_OnSaleItem(String name,int quantity,int catalogNumber,double price, double discount) {
      
      super(name, quantity, catalogNumber, price);
      this.discount= discount;
    }

    
    /**
     * getter for discount
     * @return
     */
    public double getDiscount() {
     
        return discount;
    }

    /**
     * setter for discount
     * @param discount
     */
    public void setDiscount(double discount) {
       this.discount=discount;
    }


	@Override
	public String toString() {
		return "OnSaleItem [discount=" + discount + ", getPrice()=" + getPrice() + ", getName()=" + getName()
				+ ", getQuantity()=" + getQuantity() + ", getCatalogNumber()=" + getCatalogNumber() + "]";
	}
}
    /**
     * overrides toString from Item:
     *
     * @returns Object description in this format:
     *      * "OnSaleItem{discount=20.0%, name=ItemName, price=100.45}"
     *
     */
    
//    @Override
//    public String toString() {
//        return "OnSaleItem{discount=20.0%, name=ItemName, price=100.45}";
//    }

