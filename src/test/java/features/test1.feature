# language: ru
@smoketest
Функция: smoke test #1, go through the service to button "Купить"

  Сценарий: go through the service to button "Купить"
    * пользователь открывает страницу "http://yandex.ru"
    * пользователь проверяет, что на странице отображается элемент с xpath ".//*[@aria-label='Яндекс']"
    * пользователь вводит в поле с xpath ".//*[@class='input__control input__input']" строку "сбербанк"
    * пользователь нажимает на кнопку с xpath ".//*[@type='submit']"
    * пользователь ожидает "5" секунд

