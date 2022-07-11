import java.util.Scanner;
public class Main {
    public static  void main(String[] args) {
        int n1, n2;
        int ekok = 1;
        int ebob = 1;
        int i = 1;
        Scanner scanner = new Scanner(System.in);
        System.out.print("Birinci Sayýyý Giriniz:");
        n1 = scanner.nextInt();
        System.out.print("Ýkinci Sayýyý Giriniz:");
        n2 = scanner.nextInt();
        if (n1<n2) {
            while (i<=n1){
                if(n1%i==0 && n2%i==0){
                    ebob=i;
                }else {

                }
                i++;
            }
        }else {
            System.out.println("Hatalý giriþ yaptýnýz birinci sayý ikinci sayýdan küçük olmalý");
        } System.out.println(ebob);
    }
}