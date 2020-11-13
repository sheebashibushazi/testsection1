package exerciseone;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class TestExercise {
	public static void main(String [] args)
	
	{
		
		try {	
				ArrayList<Product> list=new ArrayList<>();
				list.add(new Product(1,"desc1",new BigDecimal(1123),"Titan"));
				list.add(new Product(2,"desc2",new BigDecimal(234),"Rado"));
				list.add(new Product(3,"desc3",new BigDecimal(5000),"Thomson"));
				list.add(new Product(4,"desc4",new BigDecimal(6700),"Patek phillipe"));
				list.add(new Product(5,"desc5",new BigDecimal(2500),"Blancpain"));
				list.add(new Product(6,"desc6",new BigDecimal(8000),"chopard"));
				list.add(new Product(7,"desc7",new BigDecimal(12892),"Rolex"));
				list.add(new Product(8,"desc8",new BigDecimal(12345345),"tissot"));
				list.add(new Product(9,"desc9",new BigDecimal(6098),"Cartier"));
				list.add(new Product(10,"desc10",new BigDecimal(30985),"Cart"));
				System.out.println("items whose brand name is starting with T");
				List<Product> list2= list.stream().filter(i->i.getBrand().toUpperCase().startsWith("T")).collect(Collectors.toList());
				list2.forEach(s->System.out.println(s));		
				System.out.println("sorting items according to decending order of price");
				List<Product> list4=list.stream().sorted((pro1,pro2)->pro2.getPrice().compareTo(pro1.getPrice())).collect(Collectors.toList());				
				list4.forEach(s->System.out.println(s));							
				}
				catch(Exception e)
				{
					e.printStackTrace();
				}
	}

}
