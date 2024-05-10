import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Calc2ScannerFile {

	public static void main(String args[]){
		try{
			File file = new File("targetfile.txt");
			Scanner scan = new Scanner(file);
			scan.useDelimiter("¥¥r¥¥n");
			//fileScanner.useDelimiter(System.getProperty("line.separator"));

		 // キーボードからの入力
			Scanner keyboardScanner = new Scanner(System.in);
			System.out.print("1つ目の数字を入力してください: ");
			int num1 = keyboardScanner.nextInt();
			System.out.print("2つ目の数字を入力してください: ");
			int num2 = keyboardScanner.nextInt();

 // 合計の計算
			int sum = num1 + num2;
			System.out.println("合計: " + sum);

 // ファイルからの読み込み
			int line = 1;

			while(scan.hasNext()){
				String str = scan.next();
				System.out.println(line + ":" + str);
				line++;
			}
		}catch(FileNotFoundException e){
			System.out.println(e);
		}
	}
}

//  課題    ファイルから読み込むキーボードから2つの数字を打ち込む
//     その足し算結果を、出力する。
