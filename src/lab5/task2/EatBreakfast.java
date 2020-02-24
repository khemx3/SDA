package lab5.task2;

public class EatBreakfast {
	public static void main(String[] args) {

		System.out.println("Omelette with Salt and Pepper\n-------------");
		AbstractBreakfast omelette = new Omelette();
		omelette.wantsCondiments();
		omelette.start(2);
		System.out.println("==========================");
		System.out.println("ScrambledEggs with Salt and Pepper\n-------------");
		AbstractBreakfast scrambleeggs = new ScrambledEggs();
		scrambleeggs.wantsCondiments();
		scrambleeggs.start(3);
		System.out.println("==========================");
		System.out.println("SunnySide\n-------------");
		AbstractBreakfast sunnyside = new SunnySide();
		sunnyside.start(5);
	}

}
