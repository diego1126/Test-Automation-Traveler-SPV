package co.com.castor.spv.ui.requote;

import co.com.castor.spv.utils.CalculateDate;
import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class RequoteUI {
    public static final Target LIST_NEW_DESTINY =Target.the ("List new destiny").located(By.xpath("//*[@id=\"select-country-destiny\"]"));
    public static final Target BTN_EXIT_CALENDAR =Target.the ("Calendar Exit").located(By.xpath("//*[@id=\"departureDate\"]"));
    public static final Target BTN_DAY_EXIT =Target.the ("Select departure day").located(By.xpath(new CalculateDate().Calculate_d1(1)));
    public static final Target BTN_ARRIVAL_CALENDAR =Target.the ("Arrival Calendar").located(By.xpath("//*[@id=\"arrivalDate\"]"));
    public static final Target BTN_DAY_ARRIVAL =Target.the ("Select arrival day").located(By.xpath(new CalculateDate().Calculate_d2(4)));
    public static final Target BTN_CONTINUE =Target.the ("Continue Button").located(By.xpath("//*[@class=\"btn continue\"]"));
    public static final Target BTN_DISCOUNT_CODE =Target.the ("Discount Code Button").located(By.xpath("//*[@id=\"discountCode\"]"));
    public static final Target BTN_REQUOTE =Target.the ("Requote Button").located(By.xpath("//*[@id=\"submit-quote\"]"));


}
