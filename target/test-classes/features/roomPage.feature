Feature:
  Scenario: US02 RoomPage web elementleri test edilir
    Given Kullanici Rooms sayfasina gider
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

  Scenario: US03 Secilen oda sayfasi test edilir
    Given Kullanici Rooms sayfasina gider
    And "Queen room" secer
    And Oda resminin visibled oldugunu gorur
    And Aciklama bolumu yazilarinin visibled oldugunu gorur
    And Onerilen odalarin tiklanir oldugunu gorur
    And Categories bolumu altindaki linklerin tiklanir oldugunu gorur
