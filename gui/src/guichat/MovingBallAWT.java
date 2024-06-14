package guichat;

import java.awt.Color;
import java.awt.Frame;
import java.awt.Graphics;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

//配列で5つのボールを動かしてみよう

public class MovingBallAWT {
	public static void main(String[] args) {
		FFrame f = new FFrame();
		f.setSize(500, 500);
		f.addWindowListener(new WindowAdapter() {
			public void windowClosing(WindowEvent e) {
				System.exit(0);
			}
		});
		f.setVisible(true);
	}


	static class FFrame extends Frame implements Runnable {

		Thread th;
		Ball[] balls = new Ball[5];

		private boolean enable = true;
		private int counter = 0;

		FFrame() {
			th = new Thread(this);
			th.start();
		}

		public void run() {
			// ボールの初期化
			for (int i = 0; i < balls.length; i++) {
				balls[i] = new Ball();
				balls[i].setPosition(50 + i * 60, 50 + i * 60);
				balls[i].setR(10 + i * 5);
				balls[i].setColor(new Color((i * 50) % 255, (i * 100) % 255, (i * 150) % 255));
			}

			while (enable) {
				try {
					Thread.sleep(100);
					counter++;
					if (counter >= 200) enable = false;
				} catch (InterruptedException e) {
				}

				// 全てのボールを動かす
				for (Ball ball : balls) {
					ball.move();
				}

				repaint();  // paint()メソッドが呼び出される
			}
		}


		public void paint(Graphics g) {
			for (Ball ball : balls) {
				ball.draw(g);
			}
		}

		// Ball というインナークラスを作る
		class Ball {
			int x;
			int y;
			int r; // 半径
			Color c = Color.RED;

			int xDir = 1;  // 1:+方向  -1: -方向
			int yDir = 1;

			void setColor(Color c) {
				this.c = c;
			}

			void move() {
				if ((xDir == 1) && (x >= 400)) {
					xDir = -1;
				}
				if ((xDir == -1) && (x <= 0)) {
					xDir = 1;
				}

				if (xDir == 1) {
					x = x + 10;
				} else {
					x = x - 10;
				}

				if ((yDir == 1) && (y >= 400)) {
					yDir = -1;
				}
				if ((yDir == -1) && (y <= 0)) {
					yDir = 1;
				}

				if (yDir == 1) {
					y = y + 10;
				} else {
					y = y - 10;
				}
			}

			void setPosition(int x, int y) {
				this.x = x;
				this.y = y;
			}

			void setR(int r) {
				this.r = r;
			}

			void draw(Graphics g) {
				g.setColor(c);
				g.fillOval(x, y, 2 * r, 2 * r);  // rは半径なので2倍にする
			}

		}//innner class Ball end

	}

}
