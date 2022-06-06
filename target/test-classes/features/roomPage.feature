Feature:
  Scenario: TC01 RoomPage web elementleri test edilir
    Given Kullanici HotelMyCap website gider
    Then Kullanici Rooms linkine tiklar
    And Rooms basliginin visibled oldugunu gorur
    And Advance Search basliginin visibled oldugunu gorur
    And Advance Search form elemanlarini gorur
    And RoomType seceneklerini gorur
    And AdultCount seceneklerini gorur
    And Children seceneklerini gorur
    And Location kutusunun enabled oldugunu gorur
    And Advance Search bolumunun altinda Categories bolumunu gorur
    And Categories bolumunde RoomTypelari gorur
    And Categories bolumunun altinda Recent Blog bolumunu gorur
    And Recent Blog altindaki linkleri gorur
    And Tag Cloud bolumunu gorur
    Then Tag Cloud altindaki linkleri gorur