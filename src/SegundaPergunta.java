import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class SegundaPergunta {
	// SEQUENCIA DE FIBONACCI :D

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("digite um número: ");
		int num = sc.nextInt();
		fibonacci(num);
		sc.close();
	}

	public static void fibonacci(Integer num) {
		List<Integer> list = new ArrayList<>();
		int firstTerm = 0, secondTerm = 1;

		System.out.println("Checando se o número está na sequência " + num + ": ");

		while (firstTerm <= num) {
			System.out.print(firstTerm + ", ");

			int nextTerm = firstTerm + secondTerm;
			firstTerm = secondTerm;
			secondTerm = nextTerm;
			list.add(nextTerm);
		}
		if (list.contains(num)) {
			System.out.println("está!!!!");
		} 
		else {
			System.out.println("não está :(");
		}
	}
}
