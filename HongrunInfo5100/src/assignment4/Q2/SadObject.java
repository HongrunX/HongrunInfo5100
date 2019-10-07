package assignment4.Q2;

public class SadObject extends MoodyObject {
	protected String getMood() {
		return "sad";
	}
	public void expressFeelings() {
		System.out.println("'wah' 'boo boo' 'weep' 'sob' 'weep'");
	}
	public String toString() {
		return " Subject cris a lot\n";
	}
}
