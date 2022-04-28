NAVİGATİON COMPONENT KULLANIMI VE ÖRNEK SORU CEVAP UYGULAMASI

Merhabalar bu yazımda sizlere Navigation Componenet nedir ve nasıl kullanılabilir bunu anlatmaya çalışacağım ve bu konuyla ilgili örnek bir soru -cevap uygulaması yapacağım umarım öğrenmenize yardımcı olabilirim. İyi okumalar dilerim.
Öncelikle Navigation Componenet ile ilgili terimlerin ne işe yaradıklarından bahsedelim;
Navigation ; Uygulama içerisinde bir sayfadan diğer bir sayfaya geçmek veya geri dönmek için kullanılan bir yapıdır.
Bu yapı üç ana parçadan oluşmaktadır ;
1.NavHost : Bir kullanıcı uygulamada gezinirken hedeflerin değiştirildiği boş bir kapsayıcıdır.
2.NavController : NavHost içinde uygulama navigasyonunu yöneten bir nesnedir. Her bir NavHost'un kendisine karşılık gelen kendi NavConroller'i vardır.
3.NavigationGraph : Navigasyonla ilgili tüm bilgileri tek bir merkezi konumda içeren xml kaynağı, bu grafik uygulamamızın tüm gezinme yollarını temsil eder.
Navigation Component'in Bize Sağladığı Avantajlar ;
· Fragment geçiş işlemlerini handle etmektedir.
· İleri ve geri işlemlerini varsayılanlara göre düzenler.
· Animasyonlar ve geçişler için standartlaştırılmış kaynaklar sağlar.
· Deep linking bağlantılarını handle eder.
· Navigation IU kalıpları içerir (navigation drawers, bottom navigation vs.).
· Navigation Editör sayesinde hazırladığımız Nav Graph'ı kolaylıkla görüntüleyebilir ve düzenleyebiliriz.
Şimdi Uygulamamızı Yapmaya Başlayalım ;
İlk olarak boş bir proje açalım. Daha sonra proje kısmında ki Gradle Scripts içinde ki build.gradle(Module:ÖrnekProje.app)bölümünü açalım. Daha sonra burada bulunana ;
android {
 compileSdk 31
altına aşağıda ki kodumuzu yazalım;
buildFeatures {
    viewBinding true
}
Kodumuzu ekledikten sonra "Sync Now" diyerek gerekli güncellemeleri yapamalım.
Bu işlemleri bitirdikten sonra aşağıda ki görselde gösterilen şekilde gerekli olan fragmentleri açalım.
Bu fragmenler bizim uygulamamız içerisinde ki sayfalar olacaktır. Bizim uygulamamız için gerekli toplam adet fragment gerekli siz isterseniz bu sayıyı azaltabilir veya arttırabilirsiniz. Her bir fragment için ;
· FirstFragment
· SecondFragment
· ThirdFragment
· FourthFragment
· FifthFragment
· SixthFragment
Ben her bir fragmenti kendime kolay olacağından bu şekilde yaptım siz değiştirebilirsiniz.
Bu işlemleri tamamladıktan sonra "Android Studio" içerisinde bulunan "Resource Manager" kısmını açalım ardından Navigation sekmesine gelip yeni bir "Navigation Resource File" oluşturalım.
Ben oluşturduğum dosyanın ismini nav_graph koydum ve dosyamızı oluşturmuş oldum.
Bu işlemleri de tamamladıktan sonra her bir fragment sayfalarını düzenleyelim. Bunun için açtığımız her bir fragment için açılan xml dosyalarını açalım. Bu tasarımları düzenlemek için gerekli olan background dosyalarımızı Ctrl-C ile kopyalayalım ardından;
Res klasörünün altında bulunan drawable kısmına gelip Ctrl-V ile yapıştıralım burada dikkat etmemiz gereken husus görsellerimizi drawable-24 kısmına değil drawable kısmına yükleyelim.
Fragmentlerin Tasarımı
1. First Fragment : İmageView / TextView /Button
2. Second Fragment : İmageView / TextView / Button / Button
3. Third Fragment : İmageView / TextView / Button / Button
4. Fourth Fragment : İmageView / TextView / Button / Button
5. Fifth Fragment : İmageView / TextView / Button
6. Sixth Fragment : İmageView / TextView / Button
Her bir fragment tasarımı için yukarıda ki tasarım araçlarını ekleyelim. First ve Fourth Fragment xml kodlarını örnek olarak aşağıda paylaşıyorum:
First Fragment
<ImageView
    android:id="@+id/imageView2"
    android:layout_width="0dp"
    android:layout_height="0dp"
    android:src="@drawable/a5"
    app:layout_constraintBottom_toBottomOf="parent"
    app:layout_constraintEnd_toEndOf="parent"
    app:layout_constraintHorizontal_bias="0.0"
    app:layout_constraintStart_toStartOf="parent"
    app:layout_constraintTop_toTopOf="parent"
    app:layout_constraintVertical_bias="1.0" />

<TextView
    android:id="@+id/text"
    android:layout_width="match_parent"
    android:layout_height="wrap_content"
    android:layout_marginStart="8dp"
    android:layout_marginTop="148dp"
    android:text="@string/sorular_g_rmek_ster_misiniz"
    android:textAlignment="center"
    android:textColor="#E16D6D"
    android:textSize="25dp"
    android:textStyle="bold"
    app:layout_constraintStart_toStartOf="@id/imageView2"
    app:layout_constraintTop_toTopOf="parent" />

<Button
    android:id="@+id/button1"
    android:layout_width="wrap_content"
    android:layout_height="wrap_content"
    android:layout_margin="50sp"
    android:layout_marginStart="172dp"
    android:layout_marginTop="80dp"
    android:layout_marginEnd="273dp"
    android:layout_marginBottom="411dp"
    android:backgroundTint="#E16D6D"
    android:text="@string/evet"
    android:textStyle="bold"
    app:layout_constraintBottom_toBottomOf="@+id/imageView2"
    app:layout_constraintEnd_toEndOf="@+id/imageView2"
    app:layout_constraintStart_toStartOf="parent"
    app:layout_constraintTop_toBottomOf="@id/text" />

Fourth Fragment
<ImageView
    android:id="@+id/imageView3"
    android:layout_width="wrap_content"
    android:layout_height="wrap_content"
    android:src="@drawable/a4"
    app:layout_constraintBottom_toBottomOf="parent"
    app:layout_constraintEnd_toEndOf="parent"
    app:layout_constraintStart_toStartOf="parent"
    app:layout_constraintTop_toTopOf="parent" />
<TextView
    android:id="@+id/text"
    android:layout_width="match_parent"
    android:layout_height="wrap_content"
    android:layout_marginStart="8dp"
    android:layout_marginTop="148dp"
    android:text="@string/daha_nce_hi_aldat_ld_n_m"
    android:textAlignment="center"
    android:textColor="#E16D6D"
    android:textSize="25dp"
    android:textStyle="bold"
    app:layout_constraintStart_toStartOf="@id/imageView3"
    app:layout_constraintTop_toTopOf="parent"
    tools:ignore="NotSibling" />

<Button
    android:id="@+id/button6"
    android:layout_width="wrap_content"
    android:layout_height="wrap_content"
    android:layout_margin="50sp"
    android:layout_marginStart="108dp"
    android:layout_marginTop="176dp"
    android:layout_marginEnd="273dp"
    android:layout_marginBottom="411dp"
    android:backgroundTint="#E16D6D"
    android:text="EVET"
    android:textStyle="bold"
    app:layout_constraintBottom_toBottomOf="@+id/imageView3"
    app:layout_constraintEnd_toEndOf="@+id/imageView3"
    app:layout_constraintHorizontal_bias="0.155"
    app:layout_constraintStart_toStartOf="parent"
    app:layout_constraintTop_toBottomOf="@id/text"
    app:layout_constraintVertical_bias="0.453" />

<Button
    android:id="@+id/button7"
    android:layout_width="wrap_content"
    android:layout_height="wrap_content"
    android:layout_margin="50sp"
    android:layout_marginStart="40dp"
    android:layout_marginTop="168dp"
    android:layout_marginEnd="273dp"
    android:layout_marginBottom="411dp"
    android:backgroundTint="#E16D6D"
    android:text="Hayır"
    android:textStyle="bold"
    app:layout_constraintBottom_toBottomOf="@+id/imageView3"
    app:layout_constraintEnd_toEndOf="@+id/imageView3"
    app:layout_constraintHorizontal_bias="0.879"
    app:layout_constraintStart_toStartOf="parent"
    app:layout_constraintTop_toBottomOf="@id/text"
    app:layout_constraintVertical_bias="0.453" />
Tasarımlarımızı oluşturduk ve son halleri aşağıda ki gibi oldu;
Şimdi sırada fragment geçişleri için grafiğimizi ayarlama işlemi bulunmakta. Bu işlem çok basit hangi fragmentler arası geçiş yapılacak ise açtığımız Navigation Resource File ile gelen nav_graph.xml dosyasını açalım
Burada bulunan New Direction kısmına tıklayalım ve başlangıçta açtığımız fragmentleri grafik üzerine ekleyelim.
Burada yüklediğimiz fragmentleri hangi yönde gideceğini belirleriz. Burada her bir direction bir action oluşturur. Örneğin birinci fragmentten ikinci fragment'te geçiş için bir action oluşur bu action aşağıda ki gibidir;
" action_firstFragment_to_secondFragment" olarak oluşur.
Uygulamamız içerisinde ki action grafiğini ben aşağıda ki şekilde oluşturdum siz farklı direction'lar ile farklı action'lar oluşturabilirsiniz.
Buraya kadar olan kısmı tamamladıktan sonra uygulamamız içerisinde ki kodlarımızı yazmaya başlayalım. Her bir fragment için aynı kodlar yazılsa da farklı actionlar gerekmektedir.
İlk olarak First Fragment için kodumuzu yazmaya başlayalım;
class FirstFragment : Fragment() {
Bu kodun altına aşağıda ki kodu ekleyelim ;
private lateinit var sorum: FragmentFirstBinding
Bu kodumuzu bizi fragment viewların'a erişim sağlamak için bir öğe oluşturmaktadır. Daha sonra binding tanıtımı için "onCreateView" altına aşağıda ki kodumuzu ekleyelim ;
sorum = FragmentFirstBinding.inflate(inflater,container,false)
Bu iki kısmı tamamladıktan sonra butonumuza bir onClick metodu atayalım bu metodu her bir buton id'sine göre yazmaya dikkat edelim;
sorum.button1.setOnClickListener {
Daha sonra grafik üzerinde butonumuza karşılık gelen action için bir Navigation Componenet geçiş kodu yazalım. Bu kod butona tıkladığımız anda gitmesini istediğimiz fragment için kullandığımız koddur.
Navigation.findNavController(it).navigate(R.id.action_firstFragment_to_secondFragment)
}
Ardından oluşturduğumuz öğeyi return ediyoruz ve First Fragment için gerekli kod işlemlerini bitirmiş oluyoruz;
return sorum.root
}
Second Fragment , Third Fragment ve Fourth Fragment için kodlar aynı fakat actionlar farklıdır.Bu actionlar nav_graph üzerinde oluşturduğumuz directionlardır. Buraya örnek olarak Second Fragment kodunu paylaşacağım siz diğer fragmentler için bu kodları değiştirebilirsiniz.
Second Fragment
package com.serdar.sorucevap
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.Navigation
import com.serdar.sorucevap.databinding.FragmentFirstBinding
import com.serdar.sorucevap.databinding.FragmentSecondBinding
class SecondFragment : Fragment() {
    private lateinit var cevap: FragmentSecondBinding
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        cevap = FragmentSecondBinding.inflate(inflater,container,false)
            cevap.button2.setOnClickListener {
               Navigation.findNavController(it).navigate(R.id.action_secondFragment_to_thirdFragment)
            }
            cevap.button3.setOnClickListener {               Navigation.findNavController(it).navigate(R.id.action_secondFragment_to_fourthFragment)
            }
        return cevap.root
    }
}
First Fragment ,Fifth Fragment ve Sixth Fragment için de aynı kodlar ve farklı actionlar mevcuttur.Örnek olması için Sixth Fragment kodumuzu aşağıda paylaşacağım ;
Sixth Fragment
package com.serdar.sorucevap
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.Navigation
import com.serdar.sorucevap.databinding.FragmentFourthBinding
import com.serdar.sorucevap.databinding.FragmentSixthBinding
class SixthFragment : Fragment() {
    private lateinit var cevap: FragmentSixthBinding
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        cevap = FragmentSixthBinding.inflate(inflater,container,false)
        cevap.button8.setOnClickListener {            Navigation.findNavController(it).navigate(R.id.action_sixthFragment_to_firstFragment)

        }
        return cevap.root
    }
}
