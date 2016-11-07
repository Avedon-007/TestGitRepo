package lesson1.part2;

public class CustomerGoods 
{
			protected String goodsType;
			private String color;
			private String smell;
			private String condition;
			protected String typeOfPacking;
			protected String dateOfProduction;
			protected String expiringDate;
			protected double price;
			
			//CONSTRUCTORs//
			
	public CustomerGoods(){}
	
	public CustomerGoods(String goodsType, String color, String smell, String condition, 
						String typeOfPacking, String dateOfProduction, String expiringDate, double price)
	{
		this.goodsType = goodsType;
		this.color = color;
		this.smell = smell;
		this.condition = condition;
		this.typeOfPacking = typeOfPacking;
		this.dateOfProduction = dateOfProduction;
		this.expiringDate = expiringDate;
		this.price = price;
	}
	
	public String getGoodsType() 
	{
		return goodsType;
	}
	public void setGoodsType(String goodsType)
	{
		this.goodsType = goodsType;
	}

	public String getColor() 
	{
		return color;
	}
	public void setColor(String color) 
	{
		this.color = color;
	}

	public String getSmell() 
	{
		return smell;
	}
	public void setSmell(String smell) 
	{
		this.smell = smell;
	}

	public String getCondition() 
	{
		return condition;
	}
	public void setCondition(String condition) 
	{
		this.condition = condition;
	}

	public String getTypeOfPacking() 
	{
		return typeOfPacking;
	}
	public void setTypeOfPacking(String typeOfPacking) 
	{
		this.typeOfPacking = typeOfPacking;
	}

	public String getDateOfProduction() 
	{
		return dateOfProduction;
	}
	public void setDateOfProduction(String dateOfProduction) 
	{
		this.dateOfProduction = dateOfProduction;
	}

	public String getExpiringDate() 
	{
		return expiringDate;
	}
	public void setExpiringDate(String expiringDate) 
	{
		this.expiringDate = expiringDate;
	}

	public double getPrice()
	{
		return price;
	}
	public void setPrice(double price) 
	{
		this.price = price;
	}

	public static void main(String[] args)
	{
		
		CustomerGoods apple = new CustomerGoods("food","green","yes", "solid", "no packing", 
					"12.12.2016", "01.06.2017", 2.35);
		
		System.out.println(">>Constructor<<");
		System.out.println("APPLE:");
		System.out.println("The type of goods is: " + apple.getGoodsType());
		System.out.println("Color of goods is: " + apple.getColor());
		System.out.println("Smell of goods is: " + apple.getSmell());
		System.out.println("Condition of goods is: " + apple.getCondition());
		System.out.println("The type of packing is: " + apple.getTypeOfPacking());
		System.out.println("The date of production is: " + apple.getDateOfProduction());
		System.out.println("The expiring date is: " + apple.getExpiringDate());
		System.out.println("The price of goods is: " + apple.getPrice());
		
		CustomerGoods water = new CustomerGoods("food","no color","no smell", "liquid", "bottle", 
				"06.10.2015", "20.06.2017", 16.50);
		
		System.out.println(">>Constructor<<");
		System.out.println("WATER:");
		System.out.println(water.goodsType + "\n" + water.color + "\n" + water.smell + "\n" + water.condition + "\n" + water.typeOfPacking 
						   + "\n" + water.dateOfProduction + "\n" +  water.expiringDate + "\n" + water.price);
		
	}
}

/*
 public void buy() {}
	public void sale() {}
	
	
=============================================================
	
	
	
	//CONSTRUCTOR//
	public CustomerGoods(String gt, String col, String sm, String cond, String tp, 
					String dp, String ed, double p) {
	
					goodsType=gt;
					color=col;
					smell=sm;
					condition=cond;
					typeOfPacking=tp;
					dateOfProduction=dp;
					expiringDate=ed;
					price=p;
					
	// Also we can add:  	System.out.println(gt+" "+col+" "+sm+" "+cond+" "+tp+" "+dp+" "+ed+" "+p);
	// It will be printed as string		
	
================================================================	
	
	
	
	CustomerGoods Water = new CustomerGoods("food","no color","no smell", "liquid", "bottle", 
				"06.10.2015", "20.06.2017", 16.50);
		
		System.out.println(">>Constructor<<");
		System.out.println("WATER:");
		System.out.println(water.goodsType);
		System.out.println(water.color);
		System.out.println(water.smell);
		System.out.println(water.condition);
		System.out.println(water.typeOfPacking);
		System.out.println(water.dateOfProduction);
		System.out.println(water.expiringDate);
		System.out.println(water.price);
		
==================================================================
	*/
