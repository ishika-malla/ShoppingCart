import java.util.ArrayList;

public class Catalog 
{
  String catalogName;
  ArrayList<Item> catalog = new ArrayList<>();
  public Catalog(String name)
  {
	  catalogName=name;
  }
  public void add(Item item)
  {
	catalog.add(item);
  }
  public int size()
  {
	  return catalog.size();
  }
  public Item get(int index)
  {
      if (index < 0 || index >= catalog.size()) 
      {
          throw new IndexOutOfBoundsException("Index out of bounds.");
      }
      return catalog.get(index);
  }
  public String getName()
  {
	  return catalogName;
  }
  
}
