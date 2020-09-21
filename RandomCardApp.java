import java.util.Random;

public class RandomCardApp {

	public static void main(String[] args) {
		
		
		String[] num = {"2", "3", "4", "5", "6", "7", "8", "9", "10", "J", "Q", "K", "A"};
		String[] shape = {"heart", "spade", "diamond", "clover"};

		
		

		
		System.out.println(num[getRandomNumberInRange(0, 12)]); // number random 0~12
		System.out.println(shape[getRandomNumberInRange(0, 3)]); // shape random heart ~ clover
		
	}
	private static int getRandomNumberInRange(int min, int max) {

		if (min >= max) {
			throw new IllegalArgumentException("max must be greater than min");
		}

		Random r = new Random();
		return r.nextInt((max - min) + 1) + min;
		
	}
	
}
