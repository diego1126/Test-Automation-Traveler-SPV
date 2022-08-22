package co.com.castor.spv.ui.traveler;

import co.com.castor.spv.utils.CalculateDate;
import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class TravelerUI {
    public static final Target TXT_TARVELER_1_NAME =Target.the ("Traveler 1 Name").located(By.xpath("//*[@formcontrolname=\"name\"]"));
    public static final Target TXT_TARVELER_1_LAST_NAME =Target.the ("Traveler 1 Last Name").located(By.xpath("//*[@formcontrolname=\"lastName\"]"));
    public static final Target BTN_TARVELER_1_BIRTH_DATE =Target.the ("Birth Date Calendar").located(By.xpath("//*[@formcontrolname=\"birthDate\"]"));
    public static final Target BTN_TARVELER_1_BIRTH_MONTH_YEAR =Target.the ("Select Month Year Birth").located(By.xpath(new CalculateDate().MonthYearCal()));
    public static final Target BTN_TARVELER_1_BIRTH_YEAR =Target.the ("Select Year Birth").located(By.xpath(new CalculateDate().CurrentYearValue(20)));
    public static final Target BTN_TARVELER_1_BIRTH_MONTH =Target.the ("Select Month Birth").located(By.xpath(new CalculateDate().MonthCal()));
    public static final Target BTN_TARVELER_1_BIRTH_DAY =Target.the ("Select Day Birth").located(By.xpath(new CalculateDate().DayCal()));
    public static final Target BTN_TARVELER_1_OFFICIAL_DOC =Target.the ("Official Document").located(By.xpath("//*[@formcontrolname=\"officialDocument\"]"));

    public static final Target BTN_TARVELER_1_BAGGAGE =Target.the ("Baggage Check Box").located(By.xpath("//*[text()='Equipaje']"));
    public static final Target BTN_TARVELER_1_FLIGHT_DELAY =Target.the ("Flight delay Check Box").located(By.xpath("//*[text()='Retraso de vuelo']"));
    public static final Target BTN_TARVELER_1_MY_TRIP =Target.the ("My trip Check Box").located(By.xpath("//*[contains(text(),'Mi viaje')]"));
    public static final Target BTN_TARVELER_1_PTOMOTIONS =Target.the ("Promotions Check Box").located(By.xpath("/html/body/app-root/app-checkout/div/div/div[2]/div[2]/div/div/form/mat-horizontal-stepper/div[2]/div[2]/checkout-second-step/div/div/div[1]/div[1]/div/input"));





}

