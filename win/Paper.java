class Paper {
    double thickness;
    String size;
    String quality;
    String color;

    public void book()
	{
		System.out.println("thickness :"+thickness);
		System.out.println("size :"+size);
		System.out.println("quality :"+quality);
		System.out.println("color :"+color);
	}
    void setThickness(double thickness) {
        this.thickness = thickness;
    }

    void setSize(String size) {
        this.size = size;
    }

    void setQuality(String quality) {
        this.quality = quality;
    }

    void setColor(String color) {
        this.color = color;
    }
	 Paper(double thickness, String size, String quality, String color) {
        this.thickness = thickness;
        this.size = size;
        this.quality = quality;
        this.color = color;
    }
	
	Paper()
	{
        this.thickness = 0.05;
        this.size = "A4";
        this.quality = "High";
        this.color = "White";
    }

  
    static Paper createPaper(double thickness, String size, String quality, String color) 
	{
        return new Paper(thickness, size, quality, color);
    }


}