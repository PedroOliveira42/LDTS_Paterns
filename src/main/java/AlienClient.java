public abstract class AlienClient implements Client {
    //I believe this helps the Dependency Inversion
    private OrderingStrategy strategy;
    public AlienClient() {this.strategy = createOrderingStrategy();
    }
    @Override
    public void happyHourStarted(Bar bar) {
        strategy.happyHourStarted((StringBar) bar);
    }
    @Override
    public void happyHourEnded(Bar bar) {
        strategy.happyHourEnded((StringBar) bar);
    }
    @Override
    public void wants(StringDrink drink, StringRecipe recipe,
                      StringBar bar) {
        strategy.wants(drink, recipe, bar);
    }
    protected abstract OrderingStrategy
    createOrderingStrategy();
}