public class deneme2 {
    public static void main(String[] args) {
         double[] Listem={7.6,8.6,9.7,25.8,58.8,36.1};
         double toplam=0;
         double enBuyuk=Listem[0];
            for(double number : Listem){
                if(enBuyuk<number){
                    enBuyuk=number;
                }
                toplam=toplam+number;

                System.out.println("Sayılar:"+number);

            }
                System.out.println("Toplam:"+toplam);
                System.out.println("En Büyük:"+enBuyuk);


    }
}
