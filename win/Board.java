class Board {
    String type;
    String size;
    String material;
    
    Board(String typeLocal, String sizeLocal, String materialLocal) {
       
	    type=typeLocal;
	    size=sizeLocal;
		material=materialLocal;
		
        System.out.println("Created Board with type, size, material");
        System.out.println("type: " + type);
        System.out.println("size: " + size);
        System.out.println("material: " + material);
		System.out.println("typeLocal: " + typeLocal);
        System.out.println("sizeLocal: " + sizeLocal);
        System.out.println("materialLocal: " + materialLocal);
    }
}