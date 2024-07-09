import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        int[] dizi = {1, 5, 4, 6, 7, 3, 4, 2, 1, 7, 8, 20, 10};
        int[] tekrarEdenler=new int[(dizi.length+1)/2];
        int tekrar=0;

        for (int i = 0; i < dizi.length - 1; i++) {
            for (int j = i + 1; j < dizi.length; j++) {
                if(dizi[i]==dizi[j]){
                    tekrarEdenler[tekrar]=dizi[i];
                    tekrar++;
                }
            }
        }
        tekrarEdenler=Arrays.copyOf(tekrarEdenler,tekrar);
        System.out.println(Arrays.toString(tekrarEdenler));
    }
}
