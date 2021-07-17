
import java.util.Random;
import java.util.Scanner;

public class RandomDemo {
    public static void main(String[] args) {
        Random qq = new Random();
        Scanner oo = new Scanner(System.in);
        int diannao = qq.nextInt(10);
        int wanjiashengli = 0;
        int diannaoshengli = 0;
        int pingju = 0;

        System.out.println("剪刀石頭步遊戲");
        System.out.println("輸入您想要遊戲的局數：");
        int wanjia = oo.nextInt();  //玩家輸入的遊戲  局數
        System.out.println("遊戲開始：\n請注意1代表石頭，2代表剪刀，3代表布");
        for (int i = 1;i <= wanjia;i++){
            int nao = qq.nextInt(2);
            int wo = nao + 1;
            System.out.println("第"+i+"局！！！！！");
            System.out.println("輸入你的猜拳：");
            int ni = oo.nextInt();  //玩家數字

            String dian = "電腦";
            String ren = "使用者";

            //玩家
            switch (ni){
                case 1:
                    ren = "石頭";
                    break;

                case 2:
                    ren = "剪刀";
                    break;

                case 3:
                    ren = "布";
                    break;

            }

                //電腦
                switch (wo){
                    case 1:
                        dian = "石頭";
                        break;

                    case 2:
                        dian = "剪刀";
                        break;

                    case 3:
                        dian = "布";
                        break;


            }
            //1石頭，2剪刀，3布

            if (ni == wo){
                System.out.println("你出的"+ren+"，我出的"+dian+"平局啊！！！");
                System.out.println("");
                pingju++;
            }
            if (ni == 1&&wo == 2 || ni == 2&&wo == 3 || ni == 3&&wo == 1){
                System.out.println("你出的"+ren+"，我出的"+dian+"\n你贏了，真厲害啊！！！");
                System.out.println("");
                wanjiashengli++;
            }
            if (ni == 1&&wo == 3 || ni == 2&&wo == 1 || ni == 3&&wo == 2){
                System.out.println("你出的"+ren+"，我出的"+dian+"\n你輸了，真垃圾啊！！！");
                System.out.println("");
                diannaoshengli++;
            }

        }
        if (wanjiashengli == diannaoshengli){
            System.out.println("最終比分為:\n您的總勝場:"+wanjiashengli+"\n電腦的總勝場:"+diannaoshengli+"\n平局場:"+pingju+"\n平局，再來一盤吧");
        }
        if (wanjiashengli > diannaoshengli){
            System.out.println("最終比分為:\n您的總勝場:"+wanjiashengli+"\n電腦的總勝場:"+diannaoshengli+"\n平局場:"+pingju+"\n你獲得了勝利，獎勵一個??");
        }
        if (wanjiashengli < diannaoshengli){
            System.out.println("最終比分為:\n您的總勝場:"+wanjiashengli+"\n電腦的總勝場:"+diannaoshengli+"\n平局場:"+pingju+"\n電腦獲得了勝利，獎勵一個????");
        }


    }
}
