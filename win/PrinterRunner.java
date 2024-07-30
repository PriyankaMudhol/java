// Declare two instance variables and init it using const
//Create a minimum of 11 instances
// Fish,Lamp,PrintingMachine,Lens,Coil

//Declare three instance variables and init it using const
//Cap,Gold,Board,Led,SimCard


class PrinterRunner
{
	public static void main(String[] args)
	{
		System.out.println("Start");
		
		//assignment
		Fish fish=new Fish("Goldfish" , "EIGHT INCHES");
		Fish fish1 =new Fish("Goldfish", "6 inches");
		Fish fish2 =new Fish("Clownfish", "4 inches");
		Fish fish3 = new Fish("Betta Fish", "3 inches");
		Fish fish4 = new Fish("Guppy", "2 inches");
		Fish fish5 = new Fish("Neon Tetra", "1 inch");
		Fish fish6 = new Fish("Angelfish", "8 inches");
		Fish fish7 =new Fish("Oscar Fish", "16 inches");
		Fish fish8 =new Fish("Rainbow Trout", "25 inches");
		Fish fish9 =  new Fish("Blue Tang", "12 inches");
		Fish fish10 = new Fish("Catfish", "24 inches");
		Fish fish11 =new Fish("Great White Shark", "20 feet");
		
		Lamp lamp1 =new Lamp("White", "60W");
		Lamp lamp2 =new Lamp("Yellow", "75W");
		Lamp lamp3 =new Lamp("Blue", "40W");
		Lamp lamp4 =new Lamp("Red", "100W");
		Lamp lamp5 =new Lamp("Green", "50W");
		Lamp lamp6 =new Lamp("Pink", "25W");
		Lamp lamp7 =new Lamp("Black", "85W");
		Lamp lamp8 =new Lamp("Purple", "30W");
		Lamp lamp9 =new Lamp("Orange", "55W");
		Lamp lamp10 =new Lamp("Brown", "90W");
		Lamp lamp11 =new Lamp("Gray", "65W");
		
		PrintingMachine printing_machine1 =new PrintingMachine("HP", "30 ppm");
		PrintingMachine printing_machine2 =new PrintingMachine("Canon", "25 ppm");
		PrintingMachine printing_machine3 =new PrintingMachine("Epson", "20 ppm");
		PrintingMachine printing_machine4 =new PrintingMachine("Brother", "35 ppm");
		PrintingMachine printing_machine5 =new PrintingMachine("Samsung", "40 ppm");
		PrintingMachine printing_machine6 =new PrintingMachine("Dell", "22 ppm");
		PrintingMachine printing_machine7 =new PrintingMachine("Lexmark", "28 ppm");
		PrintingMachine printing_machine8 =new PrintingMachine("Xerox", "33 ppm");
		PrintingMachine printing_machine9 =new PrintingMachine("Kyocera", "27 ppm");
		PrintingMachine printing_machine10 =new PrintingMachine("Ricoh", "26 ppm");
		PrintingMachine printing_machine11 =new PrintingMachine("OKI", "29 ppm");
		
		Lens lens1 =new Lens("50mm", "f/1.8");
		Lens lens2 =new Lens("35mm", "f/1.4");
		Lens lens3 =new Lens("85mm", "f/1.2");
		Lens lens4 =new Lens("24-70mm", "f/2.8");
		Lens lens5 =new Lens("70-200mm", "f/2.8");
		Lens lens6 =new Lens("16-35mm", "f/4");
		Lens lens7 =new Lens("100mm", "f/2.8");
		Lens lens8 =new Lens("200mm", "f/2");
		Lens lens9 = new Lens("28mm", "f/1.8");
		Lens lens10 =new Lens("40mm", "f/2.8");
		Lens lens11 = new Lens("14mm", "f/2.8");
		Coil coil1 = new Coil("Copper", 100);
		
		Coil coil2 = new Coil("Aluminum", 150);
		Coil coil3 =new Coil("Steel", 200);
		Coil coil4 =new Coil("Iron", 250);
		Coil coil5 =new Coil("Nickel", 300);
		Coil coil6 =new Coil("Silver", 350);
		Coil coil7 =new Coil("Gold", 400);
		Coil coil8 =new Coil("Platinum", 450);
		Coil coil9 =new Coil("Zinc", 500);
		Coil coil10 =new Coil("Tin", 550);
		Coil coil11 =new Coil("Lead", 600);
		
		Cap cap1 = new Cap("Red", "M", "Cotton");
        Cap cap2 = new Cap("Blue", "L", "Polyester");
        Cap cap3 = new Cap("Green", "S", "Wool");
        Cap cap4 = new Cap("Black", "XL", "Nylon");
        Cap cap5 = new Cap("White", "M", "Leather");
        Cap cap6 = new Cap("Yellow", "L", "Canvas");
        Cap cap7 = new Cap("Purple", "S", "Silk");
        Cap cap8 = new Cap("Brown", "XL", "Denim");
        Cap cap9 = new Cap("Pink", "M", "Acrylic");
        Cap cap10 = new Cap("Gray", "L", "Fleece");
        Cap cap11 = new Cap("Orange", "S", "Suede");
		
		Gold gold1 = new Gold("10g", "24K", "$600");
        Gold gold2 = new Gold("20g", "22K", "$1200");
        Gold gold3 = new Gold("30g", "18K", "$1800");
        Gold gold4 = new Gold("40g", "14K", "$2400");
        Gold gold5 = new Gold("50g", "10K", "$3000");
        Gold gold6 = new Gold("60g", "24K", "$3600");
        Gold gold7 = new Gold("70g", "22K", "$4200");
        Gold gold8 = new Gold("80g", "18K", "$4800");
        Gold gold9 = new Gold("90g", "14K", "$5400");
        Gold gold10 = new Gold("100g", "10K", "$6000");
        Gold gold11 = new Gold("110g", "24K", "$6600");

        Board board1 = new Board("Whiteboard", "4x6", "Plastic");
        Board board2 = new Board("Chalkboard", "3x5", "Slate");
        Board board3 = new Board("Corkboard", "2x3", "Cork");
        Board board4 = new Board("Bulletin Board", "4x4", "Fabric");
        Board board5 = new Board("Display Board", "5x7", "Cardboard");
        Board board6 = new Board("Foam Board", "2x4", "Foam");
        Board board7 = new Board("Pegboard", "3x6", "Metal");
        Board board8 = new Board("Marker Board", "5x8", "Glass");
        Board board9 = new Board("Flip Chart Board", "4x5", "Paper");
        Board board10 = new Board("Magnetic Board", "6x6", "Steel");
        Board board11 = new Board("Tack Board", "3x4", "Fabric");

        Led led1 = new Led("Red", "50 lm", "5W");
        Led led2 = new Led("Blue", "60 lm", "6W");
        Led led3 = new Led("Green", "70 lm", "7W");
        Led led4 = new Led("Yellow", "80 lm", "8W");
        Led led5 = new Led("White", "90 lm", "9W");
        Led led6 = new Led("Warm White", "100 lm", "10W");
        Led led7 = new Led("Cool White", "110 lm", "11W");
        Led led8 = new Led("Purple", "120 lm", "12W");
        Led led9 = new Led("Pink", "130 lm", "13W");
        Led led10 = new Led("Orange", "140 lm", "14W");
        Led led11 = new Led("Amber", "150 lm", "15W");

        Simcard simcard1 = new Simcard("Verizon", "123-456-7890", "Unlimited");
        Simcard simcard2 = new Simcard("AT&T", "234-567-8901", "Family Plan");
        Simcard simcard3 = new Simcard("T-Mobile", "345-678-9012", "Prepaid");
        Simcard simcard4 = new Simcard("Sprint", "456-789-0123", "Unlimited");
        Simcard simcard5 = new Simcard("Vodafone", "567-890-1234", "International");
        Simcard simcard6 = new Simcard("Jio", "678-901-2345", "Data Only");
        Simcard simcard7 = new Simcard("Airtel", "789-012-3456", "Pay As You Go");
        Simcard simcard8 = new Simcard("Reliance", "890-123-4567", "Postpaid");
        Simcard simcard9 = new Simcard("BSNL", "901-234-5678", "Roaming");
        Simcard simcard10 = new Simcard("Idea", "012-345-6789", "Corporate");
        Simcard simcard11 = new Simcard("MTNL", "123-456-7891", "Residential");
 		System.out.println("end");
   }
		
		
}








