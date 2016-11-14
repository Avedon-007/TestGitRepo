package lesson1.part3.extendsCustomerGoods;

import lesson1.part2.CustomerGoods;

abstract class Candy extends CustomerGoods //класс абстрактный - не можо создать экземпл€р объекта
{
			private String foodType;		
			private String sweetsType;
			private String taste;
	
	public Candy(){}
	
	public Candy(String goodsType, String foodType, String sweetsType, String taste)
	{
		this.goodsType = goodsType;
		this.foodType = foodType;
		this.sweetsType = sweetsType;
		this.taste = taste;
	}

	public String getFoodType() {
		return foodType;
	}

	public void setFoodType(String foodType) {
		this.foodType = foodType;
	}

	public String getSweetsType() {
		return sweetsType;
	}

	public void setSweetsType(String sweetsType) {
		this.sweetsType = sweetsType;
	}

	public String getTaste() {
		return taste;
	}

	public void setTaste(String taste) {
		this.taste = taste;
	}
	
	/*public static void main(String[] args)
	{		
		Candy chupaChups1 = new Candy("food", "Candy", "Lollipop", "Sweet, banana");	//класс абстрактный
		System.out.println("CHUPA CHUPS Banana");
		System.out.println("The type of goods is: " + chupaChups1.getGoodsType());
		System.out.println("Type of food is: " + chupaChups1.getFoodType());
		System.out.println("Type of sweets is: " + chupaChups1.getSweetsType());
		System.out.println("Taste is: " + chupaChups1.getTaste());
		
	}*/
}

/*
public void uncover() {}
public void eat(){}	 



*/