package Com.masai;

public class Tajhotel implements Hotel{
    public void welcomeDrink(){
        System.out.println("Welcome Drink from the TajHotel");
    }

    @Override
    public void chickenBiryani() {
        System.out.println("bioriyani in Taj");
    }

    @Override
    public void masalaDosa() {
        System.out.println("masala dosa in Taj");
    }
}
