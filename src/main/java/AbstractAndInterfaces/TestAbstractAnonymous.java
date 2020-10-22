package AbstractAndInterfaces;

  abstract class TestAbstractAnonymous {
	   void printInfo() {
		  System.out.println("fsdfsfsfsdff");
	  }
	  
	  abstract public  void abstractshowinfo();
	  public static void main(String[] args) {
		new TestAbstractAnonymous() {
			
			@Override
			public void abstractshowinfo() {
				System.out.println("Inside show info");
				
			}
		  }.printInfo();
		//}.abstractshowinfo();
	}
     
}
