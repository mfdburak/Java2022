public class testing {
    public static void main(String[] args) {
        double[] Listem={18.6,8.7,6.9,12.3};
        double toplam=0;
        double max=Listem[0];

        for(double number:Listem){
            if(max<number){
                max=number;
            }
            toplam=toplam+number;
            System.out.println(number);
        }
        System.out.println("En büyük Sayı:"+max);
        System.out.println("Toplam sayı:"+toplam);
    }

}
