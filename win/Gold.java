class Gold {
    String weight;
    String purity;
    String value;
    
    Gold(String weightLocal, String purityLocal, String valueLocal) {
		weight=weightLocal;
		purity=purityLocal;
		value=valueLocal;
       
        System.out.println("Created Gold with weight, purity, value");
        System.out.println("weight: " + weight);
        System.out.println("purity: " + purity);
        System.out.println("value: " + value);
		System.out.println("weight Local :"+weightLocal);
		System.out.println("purity Local :"+purityLocal);
		System.out.println("value Local :"+valueLocal);
    }
}