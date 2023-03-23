package arraylist;
/**
 * This is the edited ArrayList class written for the lab. This class
 * stores an array of any object.
 * @param <T>
 * @author Fanni Kertesz
 * @version 2.0
 * Lab 3
 * CS131-01
 */
public class ArrayList<T> {

	private final int DEFAULT_SIZE=10;//default size if undefined
   	private int currentItem=0;//iterator
   	private T arList[];//array containing objects
	
   	/*
   	 * empty-argument constructor with default size
   	 */
   	@SuppressWarnings("unchecked")
	public ArrayList()
	{   
   	/*
   	 * The code below will cause a compile error because T is cast to object
   	 * if we cast object to whatever T is (like a String) we will cause a runtime error.
   	 * We could use a java collection like ArrayList for this.     
   	 */
	// arList=new T[DEFAULT_SIZE];                                        				  	
			  
    //this is the proper way to initialize this object using a call to new Object.                                                            	    	                                      				 		                                                                                         		
	arList=(T[]) new Object[DEFAULT_SIZE];
    }//end empty-argument constructor 

   	/*
   	 * preferred-argument constructor with preferred size
   	 * @param length preferred size
   	 */
  @SuppressWarnings("unchecked")
    public ArrayList(int length)
    {
	  // arList=new T[length]; //causes a compile error (see above)
	  arList=(T[]) new Object[length];
	  
    }//end preferred constructor
	
  	/*
  	 * method that adds an item to the array unless array is full
  	 * @param item object of type to be stored in the array
  	 * @return true if added, false if not added
  	 */
  	public boolean addItem(T item)
  	{
  		if(currentItem != 9)
  		{
  			arList[currentItem] = item;
  			currentItem++;
  			return true;
  		}//end if
  		else
  			return false;
  	}//end addItem
  	
  	/*
  	 * toString method for the array
  	 * @return s array in string form
  	 */
	@Override 
  	public String toString()
  	{
  		StringBuilder s = new StringBuilder();
  		for(int i = 0; i < currentItem; i++)
  		{
  	  	  		s.append(arList[i].toString());
  	  	  		s.append(" ");
  		}//end for
  		return s.toString();
  	}//end toString
	
}//end class