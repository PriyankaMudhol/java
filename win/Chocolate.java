class Chocolate {
    String brand;
    double price;
    String flavour;
    String size;

	public void chocy()
	{
		System.out.println("brand :"+brand);
		System.out.println("price :"+price);
		System.out.println("flavour :"+flavour);
		System.out.println("size :"+size);
	}
    
    void setBrand(String brand) {
        this.brand = brand;
    }

    void setPrice(double price) {
        this.price = price;
    }

    void setFlavour(String flavour) {
        this.flavour = flavour;
    }

    void setSize(String size) {
        this.size = size;
    }

	 Chocolate(String brand, double price, String flavour, String size) {
        this.brand = brand;
        this.price = price;
        this.flavour = flavour;
        this.size = size;
    }
	Chocolate() {
        this.brand = "Cadbury";
        this.price = 21.99;
        this.flavour = "Milk Chocolate";
        this.size = "Small";
    }
	static Chocolate createChocolate(String brand, double price, String flavour, String size) 
	{
        return new Chocolate(brand, price, flavour, size);
    }
   
}