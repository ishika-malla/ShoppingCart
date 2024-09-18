
public class ItemOrder 
{
 Item item;
 int quantity;
 public ItemOrder(Item itm, int qty)
 {
	 
	 item=itm;
	 quantity=qty;
 }
 public double getPrice()
 {
	 return item.priceFor(quantity);
 }
 Item getItem()
 {
	 return item;
 }
 public boolean equals(Object obj) 
 {
     if (obj == null) 
     {
         return false;
     }
     ItemOrder y = (ItemOrder) obj;
     return this.item.equals(y.item);
 }
 public String toString()
 {
	 return quantity + " x " + item.toString() + " = $" + getPrice();
	 
 }
}
