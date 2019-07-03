Feature:Purchase
    Scenario: The one where the user moves to cart wthout adding any item in it
       
        Given Alex has Registered in to TestMeApp
        When Alex search a particular prduct like headphones
        And try to proceed to payment without adding any item in the cart
        Then TestMe doesn't display the cart icon