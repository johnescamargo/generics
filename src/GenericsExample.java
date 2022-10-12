import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class GenericsExample {

	public static void main(String[] args) {
		shout("Johnes");
		shout(57);
		shout(13.0);

		shout2("Johnes", 45);
		shout2(57, 12.9);
		shout2(13.0, "Hey");

		List<Integer> intList = new ArrayList<>();
		intList.add(3);
		intList.add(4);
		printList(intList);

		List<String> stringList = new ArrayList<>();
		stringList.add("32");
		stringList.add("43");
		printList(stringList);

		List<Animal> animalList = new ArrayList<>();
		Animal animal1 = new Animal();
		Animal animal2 = new Animal();
		animalList.addAll(Arrays.asList(animal1, animal2));

		printList2(animalList);

	}

	private static <T> void shout(T thingToShout) {
		System.out.println(thingToShout + " !!!!!");
	}

	private static <T, V> void shout2(T thingToShout, V otherThingToShout) {
		System.out.println(thingToShout + " !!!!! " + otherThingToShout);
	}

	// Wild card
	private static void printList(List<?> myList) {
		System.out.println(myList);
	}

	// Wild card
	private static void printList2(List<? extends Animal> myList) {
		for (Animal x : myList) {
			System.out.println(x.getMakeSound());
		}
	}

}