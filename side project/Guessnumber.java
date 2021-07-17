import java.util.*; 
public class GuessX{
	public static void main(String[] args){
		Random random = new Random();//建立random
		int x = random.nextInt(100)+1;//生成一個1-100之間的隨機數 random.nextInt(100)的範圍為0-99，所以+1，範圍為1-100
		System.out.println("系統已自動為您生成了一個隨機數（範圍為1-100），遊戲開始！");
		System.out.print("猜猜這個數字是多少吧：");
		Scanner in = new Scanner(System.in);//建立scanner
		int y = in.nextInt(); //輸入數字
		int count = 1; //次數
		
		
		while(y != x){
			
			count ++;
			
			if(y<1 || y>100){
			System.out.print("Sorry,你猜的數字不在範圍之內（範圍為1-100），請再重新猜一次吧：");
			y = in.nextInt();
			}
			
			else if (y>x){
				System.out.print("Sorry,你輸入的數字太大了，請再重新猜一次吧：");
				y = in.nextInt();

			}
			else if (y<x){
				System.out.print("Sorry,你輸入的數字太小了，請再重新猜一次吧：");
				y = in.nextInt();
			}
		}
		System.out.println("恭喜你，猜對了！你猜的數字是" + y + "你總共猜了" + count + "次！");
	}
	
}
