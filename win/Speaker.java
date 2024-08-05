//Init properties using 4 different ways
//Declare a method to print all instance variables
//Create least 3 copies


//Speaker : brand,size,cost,output
//Rocket: country,speed,fuelCapacity,noOfThrusters
//Chocolate: brand,price,flavour,size
//Projector: company,type,color,weight
//Paper : thickness,size,quality,color

class Speaker {
    String brand;
    String size;
    double cost;
    int output;

	public void wtever()
	{
		System.out.println("brand :"+brand);
		System.out.println("size :"+size);
		System.out.println("cost :"+cost);
		System.out.println("output :"+output);
	}
    
    void setBrand(String brand) {
        this.brand = brand;
    }

    void setSize(String size) {
        this.size = size;
    }

    void setCost(double cost) {
        this.cost = cost;
    }

    void setOutput(int output) {
        this.output = output;
    }
	
	 Speaker(String brand, String size, double cost, int output) {
        this.brand = brand;
        this.size = size;
        this.cost = cost;
        this.output = output;
    }
	
	 Speaker() {
        this.brand = "Sony";
        this.size = "Medium";
        this.cost = 99.99;
        this.output = 50;
    }

    static Speaker createSpeaker(String brand, String size, double cost, int output)
	{
        return new Speaker(brand, size, cost, output);
    }
  
}







