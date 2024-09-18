import java.util.ArrayList;

public class ShoppingCart 
{
 ArrayList<ItemOrder> itemorder;
 public ShoppingCart()
 {
  itemorder = new ArrayList<>();
 }
 public void add(ItemOrder newOrder)
 {
	 for(int i=0;i<itemorder.size();i++)
	 {
		 if(itemorder.get(i).getItem().equals(newOrder.getItem()))
		 {
			 itemorder.set(i, newOrder);
			 return;
		 }
	 }
	 itemorder.add(newOrder);
	 //System.out.print(itemorder);
 }
 public double getTotal()
 {
	 double cost=0;
	 for(int i=0;i<itemorder.size();i++)
	 {
	   cost+=itemorder.get(i).getPrice();
	 }
	 return cost;
 }
}
