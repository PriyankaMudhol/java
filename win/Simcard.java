class Simcard {
    String carrier;
    String number;
    String plan;
    
    Simcard(String carrierLocal, String numberLocal, String planLocal) {
        
		carrier=carrierLocal;
		number=numberLocal;
		plan=planLocal;
		
        System.out.println("Created Simcard with carrier, number, plan");
        System.out.println("carrier: " + carrier);
        System.out.println("number: " + number);
        System.out.println("plan: " + plan);
		System.out.println("carrierLocal: " + carrierLocal);
        System.out.println("numberLocal: " + numberLocal);
        System.out.println("planLocal: " + planLocal);
    }
}
