
public class Task03 {

	public static void main(String[] args) {
		ImtiazStore I = new ImtiazStore(5420);
		BinHashimStore B = new BinHashimStore(11560);
		I.CalculateBill();
		B.CalculateBill();
	}

}
abstract class Store{
	abstract void CalculateBill();
}

class ImtiazStore{
	double totalbill;
	ImtiazStore(){}
	ImtiazStore(double bill){
		totalbill = bill;
	}
	void CalculateBill() {
		System.out.println("========== Imtiaz Store ==========");
		System.out.println("Totalbill: " + totalbill);
		System.out.println("Bill after (7%) discount: " + (totalbill - (totalbill * 0.07)));
	}
}

class BinHashimStore{
	double totalbill;
	BinHashimStore(){}
	BinHashimStore(double bill){
		totalbill = bill;	
	}
	void CalculateBill() {
		System.out.println(" ");
		System.out.println("========== BinHashim Store ==========");
		System.out.println("Totalbill: " + totalbill);
		System.out.println("Bill after (5%) discount: " + (totalbill - (totalbill * 0.05)));
	}
}