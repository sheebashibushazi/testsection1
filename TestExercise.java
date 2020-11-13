package exerciseone;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class TestExercise {
	public static void main(String [] args)
	
	{
		
		ArrayList<Product> list=new ArrayList<>();
		list.add(new Product(1,"desc1",1200,"Titan"));
		list.add(new Product(2,"desc2",2002,"Rado"));
		list.add(new Product(3,"desc3",5000,"Thomson"));
		list.add(new Product(4,"desc4",6700,"Patek phillipe"));
		list.add(new Product(5,"desc5",2500,"Blancpain"));
		list.add(new Product(6,"desc6",8000,"chopard"));
		list.add(new Product(7,"desc2",12892,"Rolex"));
		list.add(new Product(8,"desc3",12345345,"tissot"));
		list.add(new Product(9,"desc4",6098,"Cartier"));
		list.add(new Product(9,"desc4",6098,"Cartier"));
		System.out.println("items whose brand name is starting with T");
		List<Product> list2= list.stream().filter(i->i.getBrand().toUpperCase().startsWith("T")).collect(Collectors.toList());
		list2.forEach(s->System.out.println(s));		
		System.out.println("sorting items according to decending order of price");
		List<Product> list4= list.stream().sorted((Product pro1,Product pro2)->(pro2.getPrice()-pro1.getPrice())).collect(Collectors.toList());			
		list4.forEach(s->System.out.println(s));
	}

}
