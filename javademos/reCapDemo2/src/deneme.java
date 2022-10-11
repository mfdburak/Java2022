public class deneme {
    public static void main(String[] args) {
        double[] myList={3.6,16.4,2.8,11.2};
        double toplam=0;
        double max=myList[0];
            for(double number:myList){
                if(max<number){
                    max=number;
                }
                toplam=toplam+number;
                System.out.println(number);
        }
                System.out.println("Toplam:"+toplam);
                System.out.println("EnBüyük:"+max);
    }

}
