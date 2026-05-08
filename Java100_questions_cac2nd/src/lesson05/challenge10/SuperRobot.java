package lesson05.challenge10;

import java.util.Scanner;

public class SuperRobot {

	public static void main(String[] args) {

		final String ROBOT_NAME = "TEMPURA-鍋型ロボット";

		//処理の内容：(あなたが思う)豪華な料理を作成する機能
		//天ぷらの盛り合わせ
		//天ぷらをあげる際の最適温度は170-190℃だが、30℃ほどの誤差がある場合でも自動的に調整し、サクサクに揚げてくれる鍋型ロボットである。

		Scanner scan = new Scanner(System.in);

		String[] tempura = { "えび天", "かしわ天", "かぼちゃ天", "なす天" };

		System.out.println("*** 調理ロボット " + ROBOT_NAME + " 開始 ***");
		System.out.println("\t ～高性能 天ぷら調理システム ～\n");

		int temperature;

		// 最適温度になるまで繰り返す
		while (true) {

			System.out.print("油の温度を入力してください : ");
			temperature = scan.nextInt();

			if (temperature >= 170 && temperature <= 190) {
				System.out.println("\n最適温度です！");
				break;

			} else if (temperature >= 140 && temperature <= 160) {
				System.out.println("\nやや低温ですが頑張ります!");
				break;

			} else if (temperature >= 200 && temperature <= 220) {
				System.out.println("\nやや高温ですが頑張ります!");
				break;

			} else if (temperature < 140) {
				System.out.println("\n温度が低すぎます！まだ調整が必要です\n");

			} else {
				System.out.println("\n温度が高すぎます！まだ調整が必要です\n");
			}

		}

		System.out.println("現在の温度 : " + temperature + "℃\n");
		System.out.println("えび天、かしわ天、かぼちゃ天、なす天を調理します");
		System.out.println("サクサクに揚がりました！");

		scan.close();
	}
}
