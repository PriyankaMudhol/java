class WebCam{
	public static void capture()
	{
		String location="parking lot"; //info cannot change it from outside the method
		System.out.println("location:"+location);
		System.out.println("capture without parameter");
	}
	public static void capture(String location)//parameter
	{
		System.out.println("location :"+location);
		System.out.println("capture with string parameter");
	}
	public static void main(String[] args)
	{
		System.out.println("Webcam is running");
		capture();
		
		capture("CAR"); //invoke the ref of the string declared withing paranthesis as parameter
		Sport.player("virat kohli", "India");
		Sport.player(18);
	}
}

