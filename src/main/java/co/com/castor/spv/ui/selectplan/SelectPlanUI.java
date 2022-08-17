package co.com.castor.spv.ui.selectplan;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class SelectPlanUI {
    public static final Target BTN_VIEW_DETAIL =Target.the ("View Detail Plan").located(By.xpath("//*[text()='Ver detalle']"));
    public static final Target BTN_VIEW_DETAIL_TRAVEL_ASSISTANCE =Target.the ("Travel Assistance").located(By.xpath("//*[text()='Asistencia de viaje']"));
    public static final Target BTN_VIEW_DETAIL_REPATRIATION_EMERGENCY =Target.the ("Repatriation and Emergency Transfer").located(By.xpath("//*[text()='Repatriacion y traslado de Emergencia']"));
    public static final Target BTN_VIEW_DETAIL_CLOSE =Target.the ("View Detail Close Window").located(By.xpath("//*[@class=\"close-modal btn f-30 p-0 pr-4 text-white btn-mt\"]"));

    public static final Target BTN_BUY_PLAN =Target.the ("Buy plan button").located(By.xpath("//*[text()='Comprar']"));



}
