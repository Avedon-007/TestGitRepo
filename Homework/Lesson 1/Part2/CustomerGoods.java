public class CustomerGoods {
			private String goodsType;
			private String color;
			private String smell;
			private String condition;
			private String typeOfPacking;
			private String dateOfProduction;
			private String expiringDate;
			private double price;
			
	public String getGoodsType() {
		return goodsType;
		}
	public void setGoodsType(String newGoodsType) {
		goodsType=newGoodsType;
		}
	public String getColor() {
		return color;
		}
	public void setColor(String newColor) {
		color=newColor;
		}
	public String getSmell() {
		return smell;
		}
	public void setSmell(String newSmell) {
		smell=newSmell;
		}
	public String getCondition() {
		return condition;
		}
	public void setCondition(String newCondition) {
		condition=newCondition;
		}
	public String getTypeOfPacking() {
		return typeOfPacking;
		}
	public void setTypeOfPacking(String newTypeOfPacking) {
		typeOfPacking=newTypeOfPacking;
		}
	public String getDateOfProduction() {
		return dateOfProduction;
		}
	public void setDateOfProductiom(String newDateOfProduction) {
		dateOfProduction=newDateOfProduction;
		}
	public String getExpiringDate() {
		return expiringDate;
		}
	public void setExpiringDate(String newExpiringDate) {
		expiringDate=newExpiringDate;
		}
	public double getPrice() {
		return price;
		}
	public void setPrice(double newPrice) {
		price=newPrice;
		}
	public void buy() {}
	public void sale() {}
					
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
										
	}

	public static void main(String[] args){
		
		CustomerGoods apple=new CustomerGoods("food","green","yes", "solid", "no packing", 
					"12.12.2016", "01.06.2017", 2.35);
		
		System.out.println(">>Constructor<<");
		System.out.println("APPLE:");
		System.out.println(apple.goodsType);
		System.out.println(apple.color);
		System.out.println(apple.smell);
		System.out.println(apple.typeOfPacking);
		System.out.println(apple.dateOfProduction);
		System.out.println(apple.expiringDate);
		System.out.println(apple.price);
		
		CustomerGoods Water=new CustomerGoods("food","no color","no smell", "liquid", "bottle", 
				"06.10.2015", "20.06.2017", 16.50);
		
		System.out.println(">>Constructor<<");
		System.out.println("WATER:");
		System.out.println(Water.goodsType);
		System.out.println(Water.color);
		System.out.println(Water.smell);
		System.out.println(Water.typeOfPacking);
		System.out.println(Water.dateOfProduction);
		System.out.println(Water.expiringDate);
		System.out.println(Water.price);
	}
}
