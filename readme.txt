Sinema Kayıt Sistemi
Bu proje, bir sinema için film tanımlama, müşteri kaydı ve bilet satış işlemlerini yönetmek amacıyla yazılmıştır. Program, müşteri bilgilerini ve bilet kayıtlarını saklayarak hangi müşterinin hangi filmi izlediğini takip eder.

📌 Çalıştırma Bilgileri
Kod, online bir Java derleyicisinde başarıyla çalıştırılmıştır.

Çalıştırılan ortam: [Online Java Compiler (Örneğin: Replit, JDoodle, OnlineGDB vb.)]

Kodun düzgün çalışması için Java 8 ve üstü sürümler gereklidir.

🛠️ Nasıl Çalışır?
Bu program Java kullanılarak geliştirilmiş olup, aşağıdaki ana işlevleri içermektedir:

1 Film Tanımlama
Kullanıcı, film adı, süresi ve türünü girerek yeni filmler ekleyebilir.

En fazla 10 film eklenebilir.

2️ Müşteri Kaydı
Kullanıcı, müşteri adı ve e-posta adresini girerek yeni bir müşteri ekleyebilir.

Aynı e-posta ile tekrar müşteri eklenemez.

Maksimum 20 müşteri kaydedilebilir.

3️ Bilet Satın Alma
Kullanıcı, bir müşteri seçerek ona bir film bileti atayabilir.

Aynı müşteri aynı filmi birden fazla kez alamaz.

4️ Bilet Listeleme
Kayıtlı müşteriler ve onların aldığı biletler listelenir.

Eğer bir müşteri henüz bilet almadıysa "Hiç film izlenmedi" mesajı gösterilir.

🔄 Kullanım Adımları
Kodunuzu derleyin ve çalıştırın:

javac SinemaKayitSistemi.java
java SinemaKayitSistemi
Ana menüden işlem seçin:

1: Film ekleyin.

2: Yeni müşteri kaydedin.

3: Bilet satın alın.

4: Mevcut biletleri görüntüleyin.

5: Programdan çıkın.

🎯 Çalışma Mantığı
Program, ArrayList veri yapısını kullanarak verileri saklar.
Diziler yerine ArrayList kullanılmıştır, böylece esneklik sağlanmıştır.
Menü içindeki switch-case yapısı ile kullanıcıdan alınan girişe göre işlemler gerçekleştirilir.

Bu program, temel nesne yönelimli programlama (OOP) prensiplerine uygun olarak geliştirilmiş olup, dizi yönetimi ve kullanıcı etkileşimi konularında pratik yapmaya yöneliktir.

📌 Not: Kod online bir derleyicide çalıştırılmış ve başarıyla test edilmiştir. Kullanıcı girdileri yanlış formatta olursa hata mesajları gösterilir ve yeni giriş yapması istenir.

📅 Proje Tarihi: Nisan 2025

