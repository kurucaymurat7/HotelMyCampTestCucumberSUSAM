Feature: US01 HotelMyCap Homepage sayfasi tesi

  Scenario: TC01 Header webelementlerinin visibled ve enabled oldugu test edilir
    Given Kullanici HotelMyCap website gider
    And Home linkinin visibled and enabled oldugunu gorur
    And Rooms linkinin visibled and enabled oldugunu gorur
    And Resturant linkinin visibled and enabled oldugunu gorur
    And About linkinin visibled and enabled oldugunu gorur
    And Blog linkinin visibled and enabled oldugunu gorur
    And Contact linkinin visibled and enabled oldugunu gorur
    And Login linkinin visibled and enabled oldugunu gorur

  Scenario: TC02 Birinci adimdaki ilgili sayfalara gidildiği test edilir
    Given Kullanici HotelMyCap website gider
    And Home linkinin gittigi sayfanın title'ının Concort Hotel - Home oldugunu test eder
    And Rooms linkinin gittigi sayfanın title'ının Concort Hotel - Rooms oldugunu test eder
    And Resturant linkinin gittigi sayfanın Concort Hotel - Content : Our Restaurant oldugunu test eder
    And About linkinin gittigi sayfanın Concort Hotel - Content : About oldugunu test eder
    And Blog linkinin gittigi sayfanın Concort Hotel - Blog oldugunu test eder
    And Contact linkinin gittigi sayfanın Concort Hotel - Contact Form oldugunu test eder
    And Login linkinin gittigi sayfanın Hotelmycamp - Log in oldugunu test eder

  Scenario: TC03 Check-in date, Check-out date, Room, Customer elementlerinin gorunur olduğu ve enable olduğu test edilir
    Given Kullanici HotelMyCap Home sekmesine gider
    And CheckinDate webelementinin visibled and enabled oldugunu test eder
    And CheckoutDate webelementinin visibled and enabled oldugunu test eder
    And Room webelementinin visibled and enabled oldugunu test eder
    And Customer webelementinin visibled and enabled oldugunu test eder