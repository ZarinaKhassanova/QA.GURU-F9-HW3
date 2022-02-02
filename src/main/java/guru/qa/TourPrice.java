package guru.qa;

/**
 * Подбор тур-пакета для путешествия
 */
public class TourPrice {

    public static void main(String[] args){

        Variations priceTour = new Variations();

        //Sri Lanka
        priceTour.country = "Sri Lanka";
        priceTour.city = "Hikkaduwa";
        priceTour.airline = "AirAstana";
        priceTour.priceInDay = 50;
        priceTour.days = 7;
        priceTour.person = 1;
        priceTour.printInfoTour();
        priceTour.printPriceInfoOnePerson();
        priceTour.person = 2;
        priceTour.printPriceInfoTwoPerson();
        priceTour.child = true;
        priceTour.printPriceInfoTwoPersonWithChild();

        //Thailand
        priceTour.insurance = false;
        priceTour.country = "Thailand";
        priceTour.city = "Phuket";
        priceTour.days = 10;
        priceTour.person = 1;
        priceTour.printInfoTour();
        priceTour.child = false;
        priceTour.printPriceInfoOnePerson();
        priceTour.person = 2;
        priceTour.printPriceInfoTwoPerson();
        priceTour.child = true;
        priceTour.printPriceInfoTwoPersonWithChild();

        //Turkie
        priceTour.insurance = true;
        priceTour.country = "Turkie";
        priceTour.city = "Kemer";
        priceTour.airline = "Scat";
        priceTour.person = 1;
        priceTour.printInfoTour();
        priceTour.child = false;
        priceTour.printPriceInfoOnePerson();
        priceTour.person = 2;
        priceTour.printPriceInfoTwoPerson();
        priceTour.child = true;
        priceTour.printPriceInfoTwoPersonWithChild();

        //Egipt
        priceTour.insurance = true;
        priceTour.country = "Egipt";
        priceTour.city = "Hurgada";
        priceTour.days = 13;
        priceTour.person = 1;
        priceTour.printInfoTour();
        priceTour.child = false;
        priceTour.printPriceInfoOnePerson();
        priceTour.person = 2;
        priceTour.printPriceInfoTwoPerson();
        priceTour.child = true;
        priceTour.printPriceInfoTwoPersonWithChild();

    }

}
