package hhPage;

import com.codeborne.selenide.ElementsCollection;
import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Selenide.$$x;
import static com.codeborne.selenide.Selenide.$x;

public class HhPage {

//    Основные элементы отклика
    public SelenideElement findButton403 = $x("//a[@href='/search/vacancy']");
    public ElementsCollection replyButton = $$x("//a[@class='bloko-button bloko-button_kind-primary bloko-button_scale-small']");
    public SelenideElement replyModalButton = $x("(//button[@class='bloko-button bloko-button_kind-primary'])[2]");
    public SelenideElement showAll = $x("//a[@data-qa='recommended-vacancies__show-all']");

    //    Фильтры
    public SelenideElement filter50more = $x("(//span[@data-qa='serp__novafilter-item-text'])[1]");
    public SelenideElement filterRegionMoscow = $x("(//span[@data-qa='serp__novafilter-item-text'])[10]");
    public SelenideElement filterButtonMoreSpecs = $x("(//button[@class='bloko-link bloko-link_pseudo'][.='Выбрать ещё'])[1]");
    public SelenideElement filterCheckBoxAdmins = $x("//span[@data-qa='bloko-tree-selector-item-text bloko-tree-selector-item-text-category-5']");
    public SelenideElement filterCheckBoxProcurement = $x("//span[@data-qa='bloko-tree-selector-item-text bloko-tree-selector-item-text-category-14']");
    public SelenideElement filterCheckBoxArtOfEntertainment = $x("//span[@data-qa='bloko-tree-selector-item-text bloko-tree-selector-item-text-category-24']");
    public SelenideElement filterCheckBoxTrade = $x("//span[@data-qa='bloko-tree-selector-item-text bloko-tree-selector-item-text-category-2']");
    public SelenideElement filterCheckBoxFinance = $x("//span[@data-qa='bloko-tree-selector-item-text bloko-tree-selector-item-text-category-3']");
    public SelenideElement filterButtonSubmitSpecs = $x("//button[@data-qa='bloko-tree-selector-popup-submit']");
    public SelenideElement filterCheckBoxTimetableDistanceWork = $x("(//div[@class='novafilters-group-wrapper'])[10]//span[.='Удаленная работа']");
    public SelenideElement filterCheckBoxTimetableFullTimeWork = $x("(//div[@class='novafilters-group-wrapper'])[10]//span[.='Полный день']");

//    Модальное окно
    public SelenideElement modalWindow = $x("//div[@class='bloko-modal']");
    public SelenideElement modalReplyButton = $x("(//button[@class='bloko-button bloko-button_kind-primary'])[2]");
    public SelenideElement modalInput = $x("//textarea[@data-qa='vacancy-response-popup-form-letter-input']");

//    Авторизация
    public SelenideElement entireButton = $x("//a[@class='supernova-button']");
    public SelenideElement authInput = $x("//input[@data-qa='account-signup-email']");
    public SelenideElement authButton = $x("//button[@data-qa='account-signup-submit']");

}
