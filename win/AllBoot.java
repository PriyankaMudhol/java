class AllBoot
 {
    public static void main(String[] args) {
        
        Speaker speaker1 = new Speaker();
        speaker1.setBrand("JBL");
        speaker1.setSize("Large");
        speaker1.setCost(199.99);
        speaker1.setOutput(100);
        
        Speaker speaker2 = new Speaker();
        speaker2.setBrand("Sony");
        speaker2.setSize("Medium");
        speaker2.setCost(149.99);
        speaker2.setOutput(80);
        
        Speaker speaker3 = new Speaker();
        speaker3.setBrand("Bose");
        speaker3.setSize("Small");
        speaker3.setCost(99.99);
        speaker3.setOutput(60);

        speaker1.wtever();
        speaker2.wtever();
        speaker3.wtever();

       
        Rocket rocket1 = new Rocket();
        rocket1.setCountry("India");
        rocket1.setSpeed(30000);
        rocket1.setFuelCapacity(200000);
        rocket1.setNoOfThrusters(6);
        
        Rocket rocket2 = new Rocket();
        rocket2.setCountry("USA");
        rocket2.setSpeed(25000);
        rocket2.setFuelCapacity(150000);
        rocket2.setNoOfThrusters(4);
        
        Rocket rocket3 = new Rocket();
        rocket3.setCountry("Russia");
        rocket3.setSpeed(28000);
        rocket3.setFuelCapacity(180000);
        rocket3.setNoOfThrusters(5);

        rocket1.enoOnd();
        rocket2.enoOnd();
        rocket3.enoOnd();

        
        Chocolate chocolate1 = new Chocolate();
        chocolate1.setBrand("Cadbury");
        chocolate1.setPrice(1.99);
        chocolate1.setFlavour("Milk Chocolate");
        chocolate1.setSize("Medium");
        
        Chocolate chocolate2 = new Chocolate();
        chocolate2.setBrand("Nestle");
        chocolate2.setPrice(2.99);
        chocolate2.setFlavour("Dark Chocolate");
        chocolate2.setSize("Large");
        
        Chocolate chocolate3 = new Chocolate();
        chocolate3.setBrand("Lindt");
        chocolate3.setPrice(3.99);
        chocolate3.setFlavour("White Chocolate");
        chocolate3.setSize("Small");

        chocolate1.choco();
        chocolate2.choco();
        chocolate3.choco();

        
        Projector projector1 = new Projector();
        projector1.setCompany("Epson");
        projector1.setType("LCD");
        projector1.setColor("Black");
        projector1.setWeight(2.5);
        
        Projector projector2 = new Projector();
        projector2.setCompany("Sony");
        projector2.setType("DLP");
        projector2.setColor("White");
        projector2.setWeight(3.0);
        
        Projector projector3 = new Projector();
        projector3.setCompany("BenQ");
        projector3.setType("LED");
        projector3.setColor("Gray");
        projector3.setWeight(2.8);

        projector1.projector();
        projector2.projector();
        projector3.projector();

        
        Paper paper1 = new Paper();
        paper1.setThickness(0.05);
        paper1.setSize("A4");
        paper1.setQuality("High");
        paper1.setColor("White");
        
        Paper paper2 = new Paper();
        paper2.setThickness(0.07);
        paper2.setSize("A3");
        paper2.setQuality("Medium");
        paper2.setColor("Yellow");
        
        Paper paper3 = new Paper();
        paper3.setThickness(0.08);
        paper3.setSize("A5");
        paper3.setQuality("Low");
        paper3.setColor("Blue");

        paper1.book();
        paper2.book();
        paper3.book();
    }
}