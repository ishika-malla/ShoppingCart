
public class Item
{
    String itemName;
    double itemPrice;
    int itemBulkQty;
    double itemBulkPrc;
    public Item (String name, double price)
    {
        itemName=name;
        itemPrice=price;
    }
    public Item (String name, double price, int bulkQty, double bulkPrice)
    {
    	if(bulkQty<0 || bulkPrice<0)
        {
     	   throw new IllegalArgumentException("error");
        }
    	itemName=name;
        itemPrice=price;
        itemBulkQty=bulkQty;
        itemBulkPrc=bulkPrice;
    }
    public double priceFor(int quantity)
    {
       if(quantity<0)
       {
    	   throw new IllegalArgumentException("error");
       }
       
    	if(quantity>=itemBulkQty && itemBulkQty>0)
       {
           return quantity*itemBulkPrc;
       }
       else
       {
           return quantity*itemPrice;
       }
    }
    public boolean equals (Object obj)
    {
        if(obj==null)
        {
            return false;
        }
        Item x= (Item) obj;
        return this.itemName.equals(x.itemName);
    }
    public String toString()
    {
    	 if (itemBulkQty > 0) 
    	 {
             return itemName + ", $" + itemPrice + " (" + itemBulkQty + " for $" + itemBulkPrc + ")";
         } 
    	 else 
    	 {
             return itemName + ", $" + itemPrice;
         }
    }
}



