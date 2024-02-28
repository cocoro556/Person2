
public class Test {

	public static void main(String[] args) {

		// コンストラクタ1を使ってインスタンス化
		Person taro = new Person();
		taro.name = "taro";
		taro.age = 18;
		System.out.println(taro.name);
		System.out.println(taro.age);

		// コンストラクタ2を使ってインスタンス化
		Person jiro = new Person("jiro", 20);
		System.out.println(jiro.name);
		System.out.println(jiro.age);

		// コンストラクタ3を使ってインスタンス化
		Person saburo = new Person("saburo");
		System.out.println(saburo.name);
		System.out.println(saburo.age);

		// コンストラクタ4を使ってインスタンス化
		Person unknown = new Person(25);
		System.out.println(unknown.name);
		System.out.println(unknown.age);

		// コンストラクタ5を使ってインスタンス化
		Person hanako = new Person(17, "hanako");
		System.out.println(hanako.name);
		System.out.println(hanako.age);

	}

}
