package SdaLab9.task2;

public interface BuySellMediator {
    public abstract void registerAmericanSeller(AmericanSeller a);
    public abstract void registerDollarConverter(DollarConverter a);
    public abstract void registerFrenchBuyer(FrenchBuyer a);
    public abstract void registerSwedishBuyer(SwedishBuyer a);
    public abstract boolean placeBid(float bit, String unitOfCurrency);

}
