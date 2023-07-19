package j11_Loops_Donguler.While_Loops.Tasks;

public class Task04 {

	public static void main(String[] args) {
		/*
		task->  3 basamakli 4 ve 6 ya tam bolunebilen tam sayilari buyukten kucuge ve
		kaç tane oldugunu print eden code create ediniz.

		 */



		int counter = 0;
		int numberIndex=999;

		while (numberIndex > 120) {

			if (numberIndex % 24 == 0) {
				System.out.print(numberIndex + " > ");
				counter++;
			}

			numberIndex--;
		}
		System.out.print(numberIndex);
		System.out.println();
		System.out.println(counter+1+ " adet 4 ve 6 ya bölünebilen tam sayı vardır.");






	}

}
