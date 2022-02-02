package guru.qa;

/**
 * Варианты тур-пакетов
 */
public class Variations {

    protected boolean insurance = true;
    protected boolean child = false;
    protected int priceInDay;
    protected int days;
    protected int person;
    protected String country;
    protected String city;
    protected String airline;

    //region PriceCalculation
    public double setPriceTour() {
        double cost;
        int childCount = 0;

        if (child) {
            childCount = 1;
        }

        cost = (childCount * days * priceInDay * 0.5) + (person * days * priceInDay);
        return cost;
    }
    //endregion

    //region setNight
    public int setNight() {
        return days - 1;
    }

    //endregion

    //region PrintInfo
    public void printInfoTour() {
        System.out.println("\n[Страна - " + country + "/г. " + city + " (" + airline
                + "). Кол-во дней: " + days + "/ночей " + setNight()
                + ". Страховка: " + ((insurance) ? "есть" : "нет") +"]");
    }

    public void printPriceInfoOnePerson() {
        System.out.println("[1 взр.] [Стоимость - $" + setPriceTour() + "]");
    }

    public void printPriceInfoTwoPerson() {
        System.out.println("[2 взр.] [Стоимость - $" + setPriceTour() + "]");
    }

    public void printPriceInfoTwoPersonWithChild() {
        System.out.println("[2 взр. + 1 реб.] [Стоимость - $" + setPriceTour() + "]");
    }
    //endregion

}
