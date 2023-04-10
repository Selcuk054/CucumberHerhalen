package runners;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        features = "src/test/resources/features",
        glue = "stepDefinitions",
        tags = "@zoeken ",
        dryRun = false
)
public class Runner {
    /*
    Bir frameworkte tek Runner class'i yeterli olabilir
    Runner class inda class body sinda hicbirsey olmaz
    Runner class imizi onmli yapan iki adet annotation vardir
    @RunWith(Cucumber.class) notasyonu Runner class ina calisma ozelligi katar
    Bu notasyon oldugu icin cucumber frameworkumuzda JUnit kullanmayi tercih ediyoruz.
    features : Runner dosyasinin feature dosyalarini nerden bulacagini tarif eder
    glue : step definitions dosyalarini nerde bulacagimizi gosterir
    tags : o an hangi tag i caslistirmak istiyorsak onu belli eder.
    dryRun = true : yazdigimizda testimizi calistirmadan sadece eksik adimlari bize verir
    dry = false  : yazdigimiz testimizi calistirarak adimlari bize gostererek bize verir
     */
}
