package exercises;

public class FinalVars {

	/*
	 * Final variables : assigned only once
	 * cannot be changed.
	 */
	
	final int x=0;	// assign immediately
	final int a;
	
	public FinalVars(int a) {
		this.a=a;	// or in constructor.
	}

//	public FinalVars() {	// must assign for each constructor.
//	}
	
//	public void setA(int a) {  // cannot assign  elsewhere.
//		this.a=a;
//	}
	
	
}
