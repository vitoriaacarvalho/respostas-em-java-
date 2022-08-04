import java.util.Scanner;

public class QuintaPergunta {
		public static void main(String[] args) {
			Scanner sc=new Scanner(System.in);
			System.out.println("digite algo para ser a string invertida: ");
			String str = sc.nextLine();
			char[] ch = str.toCharArray();
			int inicio = 0;
			int fim = ch.length-1;
			char temp;
			while (fim>inicio) {
				temp = ch[inicio];
				ch[inicio] = ch[fim];
				ch[fim] = temp;
				fim--;
				inicio++;
			}
			str = new String(ch);
			System.out.println(str);
			sc.close();
		}
		
}
