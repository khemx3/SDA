package SdaLab9.task2;

public class Mediator implements BuySellMediator {
    private AmericanSeller american_seller;
    private DollarConverter dollar_convert;
    private FrenchBuyer french_buyer;
    private SwedishBuyer swedish_buyer;

    @Override
    public void registerAmericanSeller(AmericanSeller a) {
        american_seller = a;
    }

    @Override
    public void registerDollarConverter(DollarConverter a) {
        dollar_convert = a;
    }

    @Override
    public void registerFrenchBuyer(FrenchBuyer a) {
        french_buyer = a;
    }

    @Override
    public void registerSwedishBuyer(SwedishBuyer a) {
        swedish_buyer = a;
    }

    @Override
    public boolean placeBid(float bit, String unitOfCurrency) {
        if(unitOfCurrency == "euro"){
            dollar_convert = new DollarConverter(french_buyer.mediator);
            float temp = dollar_convert.convertCurrencyToDollars(bit,unitOfCurrency);
            return american_seller.isBidAccepted(temp);
        }
        if(unitOfCurrency == "krona"){
            dollar_convert = new DollarConverter(swedish_buyer.mediator);
            float temp = dollar_convert.convertCurrencyToDollars(bit,unitOfCurrency);
            return american_seller.isBidAccepted(temp);
        }
        return false;
    }
}
