package lesson04.challenge15;

import java.util.Scanner;

public class Yamanotesen {

	public static void main(String[] args) {
		String[] stations = { "東京", "神田", "秋葉原", "御徒町", "上野", "鴬谷", "日暮里", "西日暮里", "田端", "駒込", "巣鴨", "大塚", "池袋", "目白",
				"高田馬場", "新大久保", "新宿", "代々木", "原宿", "渋谷", "恵比寿", "目黒", "五反田", "大崎", "品川", "高輪ゲートウェイ", "田町", "浜松町", "新橋",
				"有楽町" };

		boolean[] stationFlag = new boolean[stations.length];
		int gameCount = 0;

		Scanner sc = new Scanner(System.in);

		System.out.println("※※※ 山手線ゲーム ※※※\n");
		System.out.println("      ゲームスタート！    \n");

		do {
			String input = sc.nextLine();
			int foundIndex = -1;

			for (int i = 0; i < stations.length; i++) {
				if (stations[i].equals(input)) {
					foundIndex = i;
					break;
				}
			}

			if (foundIndex == -1 || stationFlag[foundIndex]) {
				System.out.println("あなたの負けです！");
				return;
			}

			stationFlag[foundIndex] = true;
			gameCount++;

			if (gameCount == stations.length)
				break;

			for (int i = 0; i < stations.length; i++) {
				if (!stationFlag[i]) {
					System.out.println(stations[i]);
					stationFlag[i] = true;
					gameCount++;
					break;
				}
			}

			if (gameCount == stations.length)
				break;

		} while (true);

		System.out.println("あなたの勝ちです！");
		sc.close();

	}

}
