package exerciseone;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class TestExercise {
	public static void main(String [] args)
	
	{
		
		// define a for collection for product 
		Product p1=new Product(1,"desc1",1200,"Titan");
		Product p2=new Product(2,"desc2",2002,"Rado");
		Product p3=new Product(3,"desc3",5000,"Thomson");
		Product p4=new Product(4,"desc4",6700,"Patek phillipe");
		Product p5=new Product(5,"desc5",2500,"Blancpain");
		Product p6=new Product(6,"desc6",8000,"chopard");
		Product p7=new Product(7,"desc2",12892,"Rolex");
		Product p8=new Product(8,"desc3",12345345,"tissot");
		Product p9=new Product(9,"desc4",6098,"Cartier");
		Product p10=new Product(10,"desc5",125341,"Omega");	
		
		ArrayList<Product> list=new ArrayList<>();
		list.add(p1);
		list.add(p2);
		list.add(p3);
		list.add(p4);
		list.add(p5);
		list.add(p6);
		list.add(p7);
		list.add(p8);
		list.add(p9);
		list.add(p10);
		//to filter items with brand name starting with T
	//List<Product> list2= list.stream().filter(i->i.getBrand().startsWith("T")).collect(Collectors.toList());
		List<Product> list2= list.stream().filter(i->i.getBrand().toUpperCase().startsWith("T")).collect(Collectors.toList());

	list2.forEach(s->System.out.println(s));
	System.out.println("....................................................");	
	
	//System.out.println("sorting according to assending order of salary");	

	//List<Product> list3= list.stream().sorted((Product pro1,Product pro2)->(pro1.getPrice()-pro2.getPrice())).collect(Collectors.toList());
		
	//list3.forEach(s->System.out.println(s));
	System.out.println("....................................................");	

	System.out.println("sorting according to decending order of salary");	

	List<Product> list4= list.stream().sorted((Product pro1,Product pro2)->(pro2.getPrice()-pro1.getPrice())).collect(Collectors.toList());
		
	list4.forEach(s->System.out.println(s));
	}

}
