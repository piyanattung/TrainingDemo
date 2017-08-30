

class Hello {
    
    public Hello() {
        System.out.println("Hello! We are:");
        this.Krerk();
		this.Piyanat() ;
    }
    
    private void Krerk() {
        System.out.println("Trainer - Krerk Piromsopa, Ph.D.");
        System.out.println("  Demo  - Krerk Piromsopa, Ph.D.");
    }
	
	private void Piyanat(){
        System.out.println("  Demo  - Piyanat Kongkaew");
	}
    
    public static void main(String [] argv) {
        new Hello();
    }
}
