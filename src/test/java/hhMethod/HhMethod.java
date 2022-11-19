package hhMethod;

import hhPage.HhPage;

import static com.codeborne.selenide.Condition.visible;
import static com.codeborne.selenide.Selenide.*;

public class HhMethod {

    public HhPage hhPage = new HhPage();

    public void openApp() {
        open("https://hh.ru/");
    }

    public void auth() {
        hhPage.entireButton.should(visible).click();
        hhPage.authInput.should(visible).sendKeys("zaurchik.ogurchik2002" + "@gmail.com");
        hhPage.authButton.should(visible).click();
    }

    public void reply() throws InterruptedException {
        hhPage.showAll.should(visible).click();
        for (int i = 0; i < 1000; i++) {
            hhPage.replyButton.get(i).should(visible).click();
//            if (hhPage.modalWindow.isDisplayed()) {
//                Thread.sleep(1000);
//                hhPage.modalInput.val("Я самый сильный и крутой, именно поэтому я вам нужен!");
//                hhPage.modalReplyButton.should(visible).click();
//            }
            Thread.sleep(500);
            if (i == 30) {
                i = 1;
            }
            if (!hhPage.replyButton.get(i + 1).isDisplayed()) {
                Thread.sleep(1000);
                back();
            }
            if (hhPage.showAll.isDisplayed()) {
                hhPage.showAll.click();
            }
        }
    }

    public void setFilters() throws InterruptedException {
        hhPage.findButton403.should(visible).click();

        hhPage.filter50more.should(visible).click();
        hhPage.filterRegionMoscow.should(visible).click();

        hhPage.filterButtonMoreSpecs.should(visible).click();
        hhPage.filterCheckBoxAdmins.should(visible).click();
        hhPage.filterCheckBoxProcurement.should(visible).click();
        hhPage.filterCheckBoxArtOfEntertainment.should(visible).click();
        hhPage.filterCheckBoxTrade.should(visible).click();
        hhPage.filterCheckBoxFinance.should(visible).click();
        hhPage.filterButtonSubmitSpecs.should(visible).click();

        Thread.sleep(2000);
//        hhPage.filterCheckBoxTimetableDistanceWork.should(visible).click();
//        hhPage.filterCheckBoxTimetableFullTimeWork.should(visible).click();
    }
}
