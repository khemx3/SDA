package lab5.task2;

public class EatBreakfast {
	public static void main(String[] args) {
//		lab5.task2.ScrambledEggs scrambled = new lab5.task2.ScrambledEggs();
//		scrambled.crackEggs(2);
//		scrambled.stirEggs();
//		scrambled.cooking();
//		scrambled.serve();
//
//		lab5.task2.Omelette omelette = new lab5.task2.Omelette();
//		omelette.crackingEggs(3);
//		omelette.prepareEggs();
//		omelette.cook();
//		omelette.serve();
//
//		lab5.task2.SunnySide sunny = new lab5.task2.SunnySide();
//		sunny.crackEggs(1);
//		sunny.prepare();
//		sunny.cook();
//		sunny.serve();
		System.out.println("lab5.task2.Omelette with Salt and Pepper\n-------------");
		AbstractBreakfast omelette = new Omelette();
		omelette.wantsCondiments();
		omelette.start(2);
		System.out.println("==========================");
		System.out.println("lab5.task2.ScrambledEggs with Salt and Pepper\n-------------");
		AbstractBreakfast scrambleeggs = new ScrambledEggs();
		scrambleeggs.wantsCondiments();
		scrambleeggs.start(3);
		System.out.println("==========================");
		System.out.println("lab5.task2.SunnySide\n-------------");
		AbstractBreakfast sunnyside = new SunnySide();
		sunnyside.start(5);
	}

}
