class Rocket {
    String country;
    int speed;
    int fuelCapacity;
    int noOfThrusters;

    public void print()
	{
		System.out.println("country :"+country);
		System.out.println("speed :"+speed);
		System.out.println("fuelCapacity :"+fuelCapacity);
		System.out.println("noOfThrusters :"+noOfThrusters);
	}
    void setCountry(String country) {
        this.country = country;
    }

    void setSpeed(int speed) {
        this.speed = speed;
    }

    void setFuelCapacity(int fuelCapacity) {
        this.fuelCapacity = fuelCapacity;
    }

    void setNoOfThrusters(int noOfThrusters) {
        this.noOfThrusters = noOfThrusters;
    }

	Rocket(String country, int speed, int fuelCapacity, int noOfThrusters) {
        this.country = country;
        this.speed = speed;
        this.fuelCapacity = fuelCapacity;
        this.noOfThrusters = noOfThrusters;
    }
	Rocket() {
        this.country = "USA";
        this.speed = 265000;
        this.fuelCapacity = 200000;
        this.noOfThrusters = 5;
    }

    
    static Rocket createRocket(String country, int speed, int fuelCapacity, int noOfThrusters) 
	{
        return new Rocket(country, speed, fuelCapacity, noOfThrusters);
    }
    
}