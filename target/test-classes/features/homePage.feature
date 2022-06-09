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
<<<<<<< HEAD
    And dort hizmetin yanyana ve gorunur oldugunu test eder
=======

  Scenario: TC02 Birinci adimdaki ilgili sayfalara gidildiği test edilir
    And Home linkinin gittigi sayfanın title'ının Concort Hotel - Home oldugunu test eder
    And Rooms linkinin gittigi sayfanın title'ının Concort Hotel - Rooms oldugunu test eder
    And Resturant linkinin gittigi sayfanın Concort Hotel - Content : Our Restaurant oldugunu test eder
    And About linkinin gittigi sayfanın Concort Hotel - Content : About oldugunu test eder
    And Blog linkinin gittigi sayfanın Concort Hotel - Blog oldugunu test eder
    And Contact linkinin gittigi sayfanın Concort Hotel - Contact Form oldugunu test eder
    And Login linkinin gittigi sayfanın Hotelmycamp - Log in oldugunu test eder

  Scenario: TC03 Check-in date, Check-out date, Room, Customer elementlerinin gorunur olduğu ve enable olduğu test edilir
    Given Kullanici HotelMyCap website gider
    And CheckinDate webelementinin visibled and enabled oldugunu test eder
    And CheckoutDate webelementinin visibled and enabled oldugunu test eder
    And Room webelementinin visibled and enabled oldugunu test eder
    And Customer webelementinin visibled and enabled oldugunu test eder

  Scenario: Check-in date, Check-out date, Room, Customer bilgileri girilerek Check Availability butonuna tiklanir
  Cikan ilk odanin isminin kaydedilen room bilgisini içerdiği test edilir
  Categories altindaki seçeneğin, seçilen room bilgisi olduğu test edilir
    Given Kullanici HotelMyCap website gider
    And checkinDate girer checkoutDate Girer
    And room bilgisi girer
    And customer bilgisi girer
    Then checkAvailability butonuna tiklar
    And Cikan ilk odanin isminin kaydedilen room bilgisini icerdiği test edilir
    And Categories altindaki secenegin room bilgisi icerdigi test edilir

  Scenario: Anasayfaya geri donup anasayfadaki webElemenlerin dogru calisip calismadigi kontrol edilir
    Given Kullanici HotelMyCap website gider
    And Anasayfa slider’da iki adet Carousel oldugunu,ilkinde Welcome To Hotelmycamp ve ikincisinde Enjoy A Luxury Experience yadigi test edilir
    And Sliderda yönlendirme butonlarinin calisip calismadigi test edilir
    And YirmiBes Front Desk Restaurant Bar Transfer Services Spa Suites textlerin gorunur ve yan yana olduğu test edilir
    And Anasayfa Our Rooms bolumunde gösterilen seçeneklere tiklanir ve gidilen sayfa URL’sinin RoomDetail içerdiği test edilir
    #And Guests sliderinda bes adet Carousel olduğu ve hepsinin isminin Nathan Smith olduğu test edilir
    And Recent Blog bolumunun gorunur olduğu ve tiklanir olduğu test edilir
    And Instagram yazisinin gorunur olduğu ve resimlerin tiklanir olduğu test edilir
    And Footer bolumunde dort adet kolon olduğu ve basliklarinin Hotelmycamp, Useful Links, Privacy, Have Questions olduğu test edilir
>>>>>>> eb71088ae63be17ad39b93a180eb5eb8ab0f98f0
