# cift_yonlu_arama_algoritmasi
 çift yönlü arama algoritması 

**Çift yönlü arama algoritmasının amacı nedir?**

Çift yönlü arama algoritması, bir metin dizisi ve bir arama dizisi verildiğinde, arama dizisini metin dizisinde aramak için kullanılan bir algoritmadır.Arama işlemini iki yönde gerçekleştirir, hem metnin başından hem de sonundan arama yapar bunun sayesinde arama işlemi daha hızlı gerçekleşir.

**Çift yönlü arama algoritmasının kullanımı nasıldır?**

Öncelikle, algoritma arama dizisinin uzunluğunu hesaplar ve arama dizisini iki parçaya böler. Ardından, metnin başından ilk parçayı arar ve eşleşme bulduğu takdirde ikinci parçayı aramaya devam eder. Eşleşme bulunamadığı durumda ise, aynı işlemi metnin sonundan başlatarak arama işlemine devam eder.

**Çift yönlü arama algoritmasının çalışma zamanı analizi**
Metin dizisinin uzunluğu olarak ifade edilen n değeri ve arama dizisinin uzunluğu olarak ifade edilen m değeri üzerinden yapılır.

**En iyi durumda**, aranan öğe metnin ortasında yer alır ve arama işlemi n/2 adımda tamamlanır. Bu durumda, algoritmanın çalışma zamanı O(n/2) olarak ifade edilir.

**En kötü durumda**, arama dizisi metin dizisinin sonundadır ve algoritma tüm metni tarar. Bu durumda, algoritmanın çalışma zamanı O(n*m) olarak ifade edilir.

**Ortalama durumda**, arama dizisi metin dizisi içinde rastgele bir konumda yer alır ve algoritma ortalama olarak n/2 + m/2 adımda arama işlemini tamamlar. Bu durumda, algoritmanın çalışma zamanı O(n+m) olarak ifade edilir.

Çift yönlü arama algoritması, metnin ortasından başlayarak iki yönde arama yaptığı için arama süresi genellikle daha kısa olacaktır. Ancak, en kötü durumda algoritmanın çalışma zamanı diğer arama algoritmalarına kıyasla daha yavaş olabilir.

Bu nedenle, algoritmanın performansı özellikle arama dizisinin uzunluğu m'ye bağlıdır. Eğer arama dizisi çok uzunsa, algoritmanın çalışma zamanı da o kadar uzayacaktır.
