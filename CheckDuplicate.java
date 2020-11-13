package repetedelements;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class CheckDuplicate {
	
	public static void main(String args[]) {
		
		int[] myarray= {1,2,3,1,4,1,4};
		
		Set<Integer> mySet=new HashSet<Integer>();
		
		for(int i=0;i<myarray.length;i++)
		{
	
		if(!mySet.add(myarray[i])
		{
			System.out.println("The no "+ myarray[i]+" repeated");
		}	
	}
	
}
}

