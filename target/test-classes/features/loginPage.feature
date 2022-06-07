Feature: US005 HotelMyCap Login sayfasi testi

  Scenario: TC01 sayfadaki  webelementlerin visibled ve enabled oldugu test edilir

    Given kullanici login sayfasina gider
    And Login basliginin gorunur oldugu test edilir
    And Username ve Password type attribute’larinin text ve password oldugu test edilir
    And Login ve Create a new account butonlarinin enable oldugu test edilir
    Then sayfayi kapatir