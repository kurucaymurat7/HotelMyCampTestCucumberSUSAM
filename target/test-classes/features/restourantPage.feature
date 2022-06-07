Feature: US004 HotelMyCap Restourant sayfasi tesi

  Scenario: TC01 sayfadaki  webelementlerin visibled ve enabled oldugu test edilir
    Given Kullanici HotelMyCap website gider
    And Restourant sayfasina gider
    And “OurRestaurant” basliginin gorunur oldugu test edilir
    And Sol tarafta resmin gorunur oldugu test edilir
    And Resmin saginda aciklamalar bolumunun yer aldigi test edilir
    And Menu altinda iki sutun bulundugunu ve her sutun altinda dorder element oldugu test edilir
    And “Ultimate Overload” altinda “Ham & Pineapple” ustunde “Grilled Beef with potatoes” oldugu test edilir
    And Yemek resimleri sliderinin gorundugu test edilir
    And sag ve sol yon tuslarinin enable oldugu test edilir
    And resimlerin altinda dort adet butonun enable oldugu test edilir
    