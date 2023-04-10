package stepDefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.junit.Assert;
import org.openqa.selenium.Keys;
import pages.AmazonPage;
import utilities.ConfigReader;
import utilities.Driver;

public class AmazonStepDefinitions {
    AmazonPage amazonPage=new AmazonPage();
    @Given("gebruiker gaat naar amazonwebsite")
    public void gebruiker_gaat_naar_amazonwebsite() {
        Driver.getDriver().get(ConfigReader.getProperty("AmazonUrl"));
    }
    @Then("gebruiker zoekt monitor")
    public void gebruiker_zoekt_monitor() {
    amazonPage.aramaKutusu.sendKeys("Monitor"+ Keys.ENTER);
    }
    @And("test de resultaten heeft Monitor")
    public void test_de_resultaten_heeft_nutella() {
    Assert.assertTrue(amazonPage.sonucYazisiElementi.getText().contains("Monitor"));
    }
    @And("sluit de pagina")
    public void sluit_de_pagina() {
       Driver.closeDriver();
    }
    @Then("gebruiker zoekt curved monitor")
    public void gebruiker_zoekt_curved_monitor() {
     amazonPage.aramaKutusu.sendKeys("curved monitor" , Keys.ENTER);
    }
    @And("test de resultataen hebben Curved Monitor")
    public void test_de_resultataen_hebben_curved_monitor() {
    String curvedWoord="curved monitor";
    String actualWoord=amazonPage.sonucYazisiElementi.getText();
    Assert.assertTrue(actualWoord.contains(curvedWoord));
    }
    @Then("gebruiker zoekt telefoon hoesjes")
    public void gebruiker_zoekt_telefoon_hoesjes() {
        amazonPage.aramaKutusu.sendKeys("telefoon hoesjes", Keys.ENTER);
    }
    @And("test de resultaten hebben telefoon hoesjes")
    public void test_de_resultaten_hebben_telefoon_hoesjes() {
        String telefoonWoord="telefono hoesjes";
        String actualTelefoonWoord=amazonPage.sonucYazisiElementi.getText();
        Assert.assertTrue(actualTelefoonWoord.contains(telefoonWoord));
    }
    @And("arama sonucunu yazdir")
    public void arama_sonucunu_yazdir() {
        System.out.println(amazonPage.sonucYazisiElementi.getText());
    }
    @Given("gebruiker zoekt een verstelbarebureau")
    public void gebruiker_zoekt_een_verstelbarebureau() {
    amazonPage.aramaKutusu.sendKeys("verstelbare bureau", Keys.ENTER);
    }
    @Then("test de resultaten hebben verstelbare bureau")
    public void test_de_resultaten_hebben_verstelbare_bureau() {
        String bureauWoord="verstelbare bureau";
        String actualBureau=amazonPage.sonucYazisiElementi.getText();
        Assert.assertTrue(actualBureau.contains(bureauWoord));
    }
    @Given("gebruiker zoekt kaarsen")
    public void gebruiker_zoekt_kaarsen() {
       amazonPage.aramaKutusu.sendKeys("kaarsen",Keys.ENTER);

    }
    @Then("test de resultataen hebben kaarsen")
    public void test_de_resultataen_hebben_kaarsen() {
        String kaarsWoord="kaarsen";
        String actualKaars = amazonPage.sonucYazisiElementi.getText();
        Assert.assertTrue(actualKaars.contains(kaarsWoord));
    }




}
