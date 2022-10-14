public class Main {
    public static void main(String[] args) {
        double sayi = 21;

int toplam = 0;
int toplamii =0;

        for (int i =1;i<=sayi;i++){

                if(i%3==0&&i%4==0){

                    toplam +=i;
                    toplamii++;
                }

        }
        System.out.println(toplam/toplamii);







    }
}