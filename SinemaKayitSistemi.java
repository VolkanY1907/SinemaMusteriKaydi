import java.util.ArrayList;
import java.util.Scanner;

public class SinemaKayitSistemi {

    static int maxFilmler = 10;
    static int maxMusteriler = 20;

    static ArrayList<String> filmListesi = new ArrayList<>();
    static ArrayList<Integer> filmSureleri = new ArrayList<>();
    static ArrayList<String> filmTurleri = new ArrayList<>();

    static ArrayList<String> musteriIsimleri = new ArrayList<>();
    static ArrayList<String> musteriEmailListesi = new ArrayList<>();

    static ArrayList<ArrayList<String>> musteriBiletleri = new ArrayList<>();

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int secim;

        do {
            System.out.println("\n--- Sinema Kayıt Sistemi ---");
            System.out.println("1 - Film Ekle");
            System.out.println("2 - Müşteri Ekle");
            System.out.println("3 - Bilet Satın Al");
            System.out.println("4 - Biletleri Göster");
            System.out.println("5 - Çıkış");
            System.out.print("Seçiminizi yapın: ");

            secim = input.nextInt();
            input.nextLine();

            switch (secim) {
                case 1:
                    filmEkle(input);
                    break;
                case 2:
                    musteriEkle(input);
                    break;
                case 3:
                    biletAl(input);
                    break;
                case 4:
                    biletleriGoster();
                    break;
                case 5:
                    System.out.println("Çıkış yapılıyor...");
                    break;
                default:
                    System.out.println("Geçersiz seçim! Tekrar deneyin.");
            }
        } while (secim != 5);

        input.close();
    }

    static void filmEkle(Scanner input) {
        if (filmListesi.size() < maxFilmler) {
            System.out.print("\nFilm adı: ");
            String ad = input.nextLine();
            System.out.print("Film süresi (dakika): ");
            int sure = input.nextInt();
            input.nextLine();
            System.out.print("Film türü: ");
            String tur = input.nextLine();

            filmListesi.add(ad);
            filmSureleri.add(sure);
            filmTurleri.add(tur);

            System.out.println("Film başarıyla eklendi!");
        } else {
            System.out.println("Daha fazla film ekleyemezsiniz!");
        }
    }

    static void musteriEkle(Scanner input) {
        if (musteriIsimleri.size() < maxMusteriler) {
            System.out.print("\nMüşteri adı: ");
            String ad = input.nextLine();
            System.out.print("Müşteri email adresi: ");
            String email = input.nextLine();

            // Aynı email varsa ekleme
            if (musteriEmailListesi.contains(email)) {
                System.out.println("Bu email zaten kayıtlı!");
                return;
            }

            musteriIsimleri.add(ad);
            musteriEmailListesi.add(email);
            musteriBiletleri.add(new ArrayList<>());  // Müşteri için bilet listesi oluştur

            System.out.println("Müşteri başarıyla eklendi!");
        } else {
            System.out.println("Daha fazla müşteri ekleyemezsiniz!");
        }
    }

    static void biletAl(Scanner input) {
        if (musteriIsimleri.isEmpty() || filmListesi.isEmpty()) {
            System.out.println("Önce müşteri ve film eklemelisiniz!");
            return;
        }

        System.out.println("\nMevcut müşteriler:");
        for (int i = 0; i < musteriIsimleri.size(); i++) {
            System.out.println((i + 1) + ". " + musteriIsimleri.get(i) + " - " + musteriEmailListesi.get(i));
        }

        System.out.print("\nBir müşteri seçin (1-" + musteriIsimleri.size() + "): ");
        int musteriIndex = input.nextInt() - 1;
        input.nextLine();

        if (musteriIndex < 0 || musteriIndex >= musteriIsimleri.size()) {
            System.out.println("Geçersiz seçim!");
            return;
        }

        System.out.println("\nMevcut filmler:");
        for (int i = 0; i < filmListesi.size(); i++) {
            System.out.println((i + 1) + ". " + filmListesi.get(i) + " - " + filmSureleri.get(i) + " dakika - Tür: " + filmTurleri.get(i));
        }

        System.out.print("\nBir film seçin (1-" + filmListesi.size() + "): ");
        int filmIndex = input.nextInt() - 1;
        input.nextLine();

        if (filmIndex < 0 || filmIndex >= filmListesi.size()) {
            System.out.println("Geçersiz seçim!");
            return;
        }

        String secilenFilm = filmListesi.get(filmIndex);

        // Eğer müşteri zaten bu filmi aldıysa tekrar ekleme
        if (musteriBiletleri.get(musteriIndex).contains(secilenFilm)) {
            System.out.println("Bu film için zaten bilet alındı!");
            return;
        }

        musteriBiletleri.get(musteriIndex).add(secilenFilm);
        System.out.println("Bilet başarıyla alındı!");
    }

    static void biletleriGoster() {
        for (int i = 0; i < musteriIsimleri.size(); i++) {
            System.out.println("\nMüşteri: " + musteriIsimleri.get(i));
            System.out.println("Email: " + musteriEmailListesi.get(i));
            System.out.println("İzlediği Filmler:");

            if (musteriBiletleri.get(i).isEmpty()) {
                System.out.println(" - Hiç film izlenmedi.");
            } else {
                for (String film : musteriBiletleri.get(i)) {
                    System.out.println(" - " + film);
                }
            }
        }
    }
}

