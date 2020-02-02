package lab3.lab3Code.xmastree;
public class Test_tree {

	public static void main(String[] args) {
		Tree mytree = new BlueSpruce();
		mytree = new Star(mytree);
		mytree = new Ruffles(mytree);
		mytree = new BallsSilver(mytree);
		mytree = new BallsRed(mytree);
		mytree = new BallsBlue(mytree);
		//mytree = new Star(mytree);
		System.out.println(mytree.getDescription() + " costs:" +mytree.cost());

		Tree mytree2 = new FraserFir();
		mytree2 = new Star(mytree2);
		mytree2 = new Star(mytree2);
		mytree2 = new Ruffles(mytree2);
		mytree2 = new LEDS(mytree2);
		mytree2 = new Ribbons(mytree2);
		mytree2 = new BallsSilver(mytree2);
		System.out.println(mytree2.getDescription() + " costs:" +mytree2.cost());


	}
}
