public class Main {
    public static void main(String[] args) {
        boolean durum;

        System.out.println("1 ile 100 Arasındaki Asal Sayılar:");

//Değer kontrolü
        for (int i = 2; i <= 100; i++) {
            durum = true;

//Asal Değer kontrolü
            for (int j = 2; j * j <= i; j++) {
                if (i % j == 0) {
                    durum = false;
                    break;
                }
            }

// Asal Sayılar
            if (durum) {
                System.out.print(i + " ");
            }
        }
    }
}