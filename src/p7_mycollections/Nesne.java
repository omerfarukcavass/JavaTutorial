package p7_mycollections;

public class Nesne {
	int eleman;
	
	public Nesne() {
		eleman=100;
	}
	public Nesne(int eleman) {
		this.eleman=eleman;
	}
	
	@Override
	public String toString() {
		return "Nesne [eleman=" + eleman + "]";
	}
	
	public void nesneFun() {
		System.out.println("rasasfas");
	}
	
}
