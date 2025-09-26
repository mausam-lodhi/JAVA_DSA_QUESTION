class MultipleInheritance{
	public static void main(String[] args) {
		bear b = new bear();
		b.eats1();
		b.eats2();
	}
}
interface herbivores {
	void eats1();
}
interface  carnivores {
	void eats2();
}
class bear implements herbivores, carnivores {
	public void eats1() {
		System.out.println("Eats grass ");
	}
	public void eats2() {
		System.out.println("Eats meat ");
	}
}




