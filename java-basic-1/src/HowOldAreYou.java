// C言語では、#include に相当する

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class HowOldAreYou {

	public static void main(String[] args) {
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
			// BufferedReader というのは、データ読み込みのクラス(型)
			// クラスの変数を作るには、new を使う。

			// readLine() は、入出力エラーの可能性がある。エラー処理がないとコンパイルできない。
			//  Java では、 try{ XXXXXXXX }  catch(エラーの型 変数) { XXXXXXXXXXXXXXXXXX} と書く
		try {
			while(true){
				System.out.println("何歳ですか?");
				String line = reader.readLine();
					if(line.equals("q")||line.equals("e")){
						System.out.println("終了します");
						break;
					}
			int age = Integer.parseInt(line);
					if(age>120||age<0){
						System.out.println("0以上120以下の範囲で再入力してください");
						continue;
					}

			System.out.println("あなたは" + age + "歳ですね。");
			System.out.println("あなたは2030年の時、" + (age + 6) + "歳ですね。");
			int g =2023-age;
            int d;
			if (g>=1868&g<=1911) {
                d=g-1867;
				System.out.println("あなたが誕生した元号は明治"+d+"年です");
            }else if (g>=1912&g<=1925) {
				d=g-1911;
				System.out.println("あなたが誕生した元号は大正"+d+"年です");
            }else if (g>=1926&g<=1988) {
				d=g-1925;
				System.out.println("あなたが誕生した元号は昭和"+d+"年です");
            }else if (g>=1989&g<=2018) {
                d=g-1988;
                System.out.println("あなたが誕生した元号は平成"+d+"年です");
            }else if (g>=2019&g<=2024) {
				d=g-2018;
				System.out.println("あなたが誕生した元号は令和"+d+"年です");
            }
		}
		}catch(IOException e) {
			System.out.println(e);
		}
	}
}



//  課題    キーボードから数字を打ち込む
//  その結果、 あなたは、???歳ですね、と画面に表示させる。
//  その後、あなたは10年後、????歳ですね、と画面に表示させる。

