
public class ImpatientStrategy implements OrderingStrategy {

    @Override
    public void wants(StringDrink drink, StringRecipe recipe, StringBar bar) {
        bar.order(drink, recipe);
    }

    //this seems like a violation of the Liskov Substitution Pattern
    @Override
    public void happyHourStarted(StringBar bar) {
    }

    @Override
    public void happyHourEnded(StringBar bar) {
    }
}
