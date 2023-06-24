# JAVA 101 
## 1.Hafta 
### 1- ATM Projesi
Java döngüler ile kullanıcının banka hesabını yönetebildiği bir ATM projesi yapma
### 2- Armstrong Sayıları Bulan Program
N haneli bir sayının basamaklarının n’inci üstlerinin toplamı, sayının kendisine eşitse, böyle sayılara Armstrong sayı denir.
Örneğin; 407 sayısını ele alalım. (4^3)+ (0^3)+(7^3) = 64+0+343 = 407 sonucunu verir. Bu da 407 sayısının armstrong bir sayı olduğunu gösterir.
### 3- Vücut Kitle İndeksi Hesaplama
Java ile kullanıcıdan boy ve kilo değerlerini alıp bir değişkene atayın. Aşağıdaki formüle göre kullanıcının "Vücut Kitle İndeks" değerini hesaplayıp ekrana yazdırın.
Formül :  Kilo (kg) / Boy(m) * Boy(m)
### 4- Kombinasyon
### 5- Dairenin Alanını ve Çevresini Hesaplayan Program
Java ile yarı çapını kullanıcıdan aldığınız dairenin alanını ve çevresini hesaplayan programı yazın.
Alan Formülü : π * r * r;
Çevre Formülü : 2 * π * r;
### 6- Yıldızlarla Elmas Yapımı
### 7- Tek Sayıların Toplamını Bulan Program
Java döngüler ile negatif bir değer girilene kadar kullanıcıdan girişleri kabul eden ve girilen değerlerden tek sayıları toplayıp ekrana basan programı yazma
### 8- EBOB EKOK Bulan Program
EBOB : İki ya da daha fazla doğal sayının ortak bölenlerinin en büyüğüne bu sayıların en büyük ortak böleni, kısaca EBOB‘u denir.
ÖRNEK: 18 ve 24 sayılarının en büyük ortak bölenini adım adım bulalım.
18’in bölenleri : 1, 2, 3, 6, 9, 18
24’ün bölenleri : 1, 2, 3, 4, 6, 8, 12, 24
Bu ortak bölenlerin en büyüğü 6 sayısı EBOB’tur.

EKOK : İki ya da daha fazla doğal sayının ortak katlarının en küçüğüne bu sayıların en küçük ortak katı, kısaca EKOK‘u denir.
ÖRNEK: 6 ve 8 sayılarının en küçük ortak katını adım adım bulalım.
6’nın katları : 6, 12, 18, 24, 30, 36, 42, 48, …
8’in katları : 8, 16, 24, 32, 40, 48, 56, 64, …
Bu ortak katlardan en küçüğü 24 sayısı EKOK’tur.
EKOK = (n1*n2) / EBOB
### 9- Üslü Sayı Hesaplayan Program
Java ile kullanıcının girdiği değerler ile üslü sayı hesaplayan programı "For Döngüsü" kullanarak yapma.
### 10- Fibonacci Serisi 
Fibonacci serisi, her sayının kendinden önceki ile toplanması sonucu oluşan bir sayı dizisidir. Bu şekilde devam eden bu dizide sayılar birbirleriyle oranlandığında altın oran ortaya çıkar, 
yani bir sayı kendisinden önceki sayıya bölündüğünde altın orana gittikçe yaklaşan bir dizi elde edilir.
Fibonacci dizisi, 0'dan başlar ve sonsuza kadar. Her rakam, bir önceki rakamla toplanır. Elde edilen sonuç rakamın sağ tarafına yazılır. 
Fibonacci dizisinin ilk on sayısı şu şekildedir:
- 9 Elemanlı Fibonacci Serisi : 0 1 1 2 3 5 8 13 21 34
### 11- Not Ortalaması Hesaplayan Program
Java ile Matematik, Fizik, Kimya, Türkçe, Tarih, Müzik derslerinin sınav puanlarını kullanıcıdan alan ve ortalamalarını hesaplayıp ekrana bastırılan programı yazma
### 12- Harmonik Sayıları Bulan Program
Harmonik ortalama = n / (1/a + 1/b + 1/c + ...) şeklindedir.
### 13- Hesap Makinesi
Switch-case yapısı ile hesap makinesi yapma.
### 14- Burç Bulan Program
### 15- KDV Tutarı Hesaplayan Program
Java ile kullanıcıdan alınan para değerinin KDV'li fiyatını ve KDV tutarını hesaplayıp ekrana bastıran programı yazma.
KDV'siz Fiyat = 10;
KDV'li Fiyat = 11.8;
KDV tutarı = 1.8;
### 16- Sayıları Küçükten Büyüğe Sıralama
### 17- Kullanıcıdan Veri Alma
Java’da kullanıcıdan veri almak için Scanner sınıfı kullanılır. Ama bu sınıfı kullanmadan önce kodumuza Scanner sınıfını dahil etmemiz gerekir. Bunun için import deyimi kullanılır.
- import java.util.Scanner;
### 18- Artık Yıl Hesaplama
Genel bir kural olarak, artık yıllar 4 rakamının katı olan yıllardır:
1988, 1992, 1996, 2000, 2004, 2008, 2012, 2016, 2020, 2024 gibi.
### 19- Manav Kasa Programı
Java ile kullanıcıların manavdan almış oldukları ürünlerin kilogram değerlerine göre toplam tutarını ekrana yazdıran programı yazma
### 20- Uçak Bileti Fiyatı Hesaplama
Java ile mesafeye ve şartlara göre uçak bileti fiyatı hesaplayan programı yapın. Kullanıcıdan Mesafe (KM), yaşı ve yolculuk tipi (Tek Yön, Gidiş-Dönüş) bilgilerini alın. Mesafe başına ücret 0,10 TL / km olarak alın.
İlk olarak uçuşun toplam fiyatını hesaplayın ve sonrasında ki koşullara göre müşteriye aşağıdaki indirimleri uygulayın ;
Kullanıcıdan alınan değerler geçerli (mesafe ve yaş değerleri pozitif sayı, yolculuk tipi ise 1 veya 2) olmalıdır. Aksi takdirde kullanıcıya "Hatalı Veri Girdiniz !" şeklinde bir uyarı verilmelidir.
- Kişi 12 yaşından küçükse bilet fiyatı üzerinden %50 indirim uygulanır.
- Kişi 12-24 yaşları arasında ise bilet fiyatı üzerinden %10 indirim uygulanır.
- Kişi 65 yaşından büyük ise bilet fiyatı üzerinden %30 indirim uygulanır.
- Kişi "Yolculuk Tipini" gidiş dönüş seçmiş ise bilet fiyatı üzerinden %20 indirim uygulanır
### 21- Girilen Sayıdan Küçük 2'nin Kuvvetlerini Bulan Program
Java döngüler ile girilen sayıya kadar olan 4 ve 5'in kuvvetlerini ekrana yazdıran programı yazma.
### 22- 1-100 Arasındaki Asal Sayıları Bulan Program
### 23- Ters Üçgen Yapımı
Java ile basamak sayısının kullanıcıdan alınan ve döngüler kullanılarak, yıldızlar(*) ile ekrana ters üçgen çizen programı yazma.
### 24- Sınıfı Geçme Durumu
### 25- Girilen Sayıya Kadar Olan Çift Sayıları Bulan Program
Java döngüler ile kullanıcının girdiği sayıya kadar çift olan sayıları bulan programı yazma.
### 26- Taksimetre Hesaplayan Program
Java ile gidilen mesafeye (KM) göre taksimetre tutarını ekrana yazdıran programı yazma
- Taksimetre KM başına 2.20 TL tutmaktadır.
- Minimum ödenecek tutar 20 TL'dir. 20 TL altında ki ücretlerde yine 20 TL alınacaktır.
- Taksimetre açılış ücreti 10 TL'dir.
### 27- Hava Sıcaklığına Göre Etkinlik Önerme
Koşullar :
- Sıcaklık 5'dan küçük ise "Kayak" yapmayı öner.
- Sıcaklık 5 ve 15 arasında ise "Sinema" etkinliğini öner.
- Sıcaklık 15 ve 25 arasında ise "Piknik" etkinliğini öner.
- Sıcaklık 25'ten büyük ise "Yüzme" etkinliğini öner.
### 28- Üçgenin Alanını Hesaplayan Program
Formül
- Üç𝑔𝑒𝑛𝑖𝑛 ç𝑒𝑣𝑟𝑒𝑠𝑖 = 2𝑢
- 𝑢 = (a+b+c) / 2
- Alan * Alan = 𝑢 * (𝑢 − 𝑎)* (𝑢 − 𝑏) * (𝑢 − 𝑐)
### 29- 3'e 4'e Tam Bölünebilen Sayıların Ortalamasını Bulan Program
Java döngüler ile 0'dan girilen sayıya kadar olan sayılardan 3 ve 4'e tam bölünen sayıların ortalamasını hesaplayan programı yazma.
### 30- Çin Zodyağı Hesaplama
### 31- Girilen Sayılardan Min ve Max Değerleri Bulma
Java ile klavyeden girilen N tane sayma sayısından en büyük ve en küçük sayıları bulan ve bu sayıları ekrana yazan programı yazma.
### 32- Mükemmel Sayıları Bulan Program
Bir sayının kendisi hariç pozitif tam sayı çarpanları (kalansız bölen sayıların) toplamı kendisine eşit olan sayıya mükemmel sayı denir.

