package steps;

import com.codeborne.selenide.Condition;
import cucumber.api.java.en.Given;
import cucumber.api.java.ru.Дано;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Selenide.*;

public class MyStepdefs
{
    @Дано("^пользователь открывает страницу \"([^\"]*)\"$")
    public void open_page(String link) {
        open(link);
    }

    @Дано("^пользователь ожидает \"([^\"]*)\" секунд$")
    public void пользователь_ожидает_секунд(String arg1) {
        sleep(Integer.parseInt(arg1)*1000);
    }

    @Дано("^пользователь проверяет, что на странице отображается элемент с xpath \"([^\"]*)\"$")
    public void пользователь_проверяет_что_на_странице_отображается_элемент_с_xpath(String arg1) {
        $(By.xpath(arg1)).shouldBe(Condition.visible);
    }

    @Дано("^пользователь вводит в поле с xpath \"([^\"]*)\" строку \"([^\"]*)\"$")
    public void пользователь_вводит_в_поле_с_xpath_строку(String arg1, String arg2) {
        $(By.xpath(arg1)).setValue(arg2);
    }

    @Дано("^пользователь нажимает на кнопку с xpath \"([^\"]*)\"$")
    public void пользователь_нажимает_на_кнопку_с_xpath(String arg1) {
        $(By.xpath(arg1)).click();
    }
}