package co.com.castor.spv.ui.quotetravelassistance;

import co.com.castor.spv.utils.CalculateDate;
import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class QuoteTravelAssistanceUI {
    public static final Target LIST_ORIGIN =Target.the ("List Origin").located(By.xpath("//*[@id=\"select-country-origin\"]"));
    public static final Target OPT_ORIGIN =Target.the ("Select Origin").located(By.xpath("//*[@id=\"origin-14\"]"));
    public static final Target LIST_DESTINY =Target.the ("List destiny").located(By.xpath("//*[@id=\"select-country-destiny\"]"));
    public static final Target OPT_DESTINY =Target.the ("Select Destiny").located(By.xpath("//*[@id=\"origin-1\"]"));
    public static final Target BTN_EXIT_CALENDAR =Target.the ("Calendar Exit").located(By.xpath("//*[@id=\"departureDate\"]"));
    public static final Target BTN_DAY_EXIT =Target.the ("Select departure day").located(By.xpath(new CalculateDate().Calculate_d1(0)));
    public static final Target BTN_ARRIVAL_CALENDAR =Target.the ("Arrival Calendar").located(By.xpath("//*[@id=\"arrivalDate\"]"));
    public static final Target BTN_DAY_ARRIVAL =Target.the ("Select arrival day").located(By.xpath(new CalculateDate().Calculate_d2(3)));
    public static final Target BTN_ADD_PERSON =Target.the ("Add person Button").located(By.xpath("//*[@id=\"mat-menu-panel-0\"]/div/div/div/div[2]/button[2]/i"));
    public static final Target BTN_CONTINUE =Target.the ("Continue Button").located(By.xpath("//*[@id=\"mat-menu-panel-0\"]/div/div/div/div[9]/button"));
    public static final Target TXT_FULL_NAME =Target.the ("Full Name Input Field").located(By.xpath("//*[@id=\"fullName\"]"));
    public static final Target TXT_EMAIL =Target.the ("Email Input Field").located(By.xpath("//*[@id=\"email\"]"));
    public static final Target TXT_MOBILE =Target.the ("Mobile Input Field").located(By.xpath("//*[@id=\"phone\"]"));
    public static final Target BTN_MOBILE =Target.the ("Cotiza Gratis Button").located(By.xpath("//*[@id=\"submit-quote\" and contains(text(),'Cotiza Gratis')]"));







}
