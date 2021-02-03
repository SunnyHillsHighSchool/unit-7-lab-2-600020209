//(c) A+ Computer Science
//www.apluscompsci.com
//Name -
//Date -

import java.util.List;
import java.util.ArrayList;

public class ListLast
{
	public static boolean go( List<Integer> ray)
	{
		//Begin for loop, with iterator i initialized with 0, while i is less than 1 less the length of the list, and with i incremented by one each run:
    for(int i = 0; i < ray.size() - 1; i++){
      //If the element of list at index i is equal to the element of list at index 1 less the length of list obtained with get methods:
      if(ray.get(i) == ray.get(ray.size() - 1)){
      //return true
      return true;
      //end if
      }
    //end for
    }
    //return false
    return false;
	}
}