import java.util.ArrayList;
import java.util.List;

public class StringBar extends Bar
{
    private boolean isHappyHour = false;

    public StringBar() {
        this(new ArrayList<>());
    }

    public StringBar(List<BarObserver> observers) {
        super(observers);
    }

@Override
    public void startHappyHour()
    {
        isHappyHour = true;
        notifyObservers();
    }
@Override
    public void endHappyHour()
    {
        isHappyHour = false;
        notifyObservers();
    }
@Override
    public boolean isHappyHour()
    {
        return  isHappyHour;
    }

    public void order(StringDrink drink, StringRecipe recipe) {
        recipe.mix(drink);
    }

}

