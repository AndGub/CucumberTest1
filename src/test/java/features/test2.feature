# language: ru
@smoketest2
Функция: smoke test #2, отправка поискового запроса в google

  Сценарий: отправка поискового запроса в google
    * шаг "1"
    * пользователь открывает страницу "http://google.com"
    * пользователь проверяет, что на странице отображается элемент с xpath ".//*[@id='lga']"

    * шаг "2"
    * пользователь вводит в поле с xpath ".//*[@name='q']" строку "сбербанк"
    * пользователь нажимает на кнопку с xpath ".//*[@type='submit']"

    * шаг "3"
    * пользователь ожидает "5" секунд

  Сценарий: отправка пустого поискового запроса в google (должен быть failed)
    * шаг "1"
    * пользователь открывает страницу "http://google.com"
    * пользователь проверяет, что на странице отображается элемент с xpath ".//*[@id='lga']"

    * шаг "2"
    * пользователь нажимает на кнопку с xpath ".//*[@type='submit']"
    * пользователь проверяет, что на странице отображается элемент с xpath ".//*[@id='lga1']"

    * шаг "3"
    * пользователь ожидает "5" секунд

