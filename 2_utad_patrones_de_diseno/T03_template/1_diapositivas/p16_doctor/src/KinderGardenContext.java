// Ahí debes hacer que el contexto ejecute la estrategia.

public class KinderGardenContext
{
    private ActivityStrategy activityStrategy;

    public KinderGardenContext()
    {
    }

    public KinderGardenContext(ActivityStrategy activityStrategy)
    {
        this.activityStrategy = activityStrategy;
    }

    public ActivityStrategy getActivityStrategy()
    {
        return activityStrategy;
    }

    public void setActivityStrategy(ActivityStrategy activityStrategy)
    {
        this.activityStrategy = activityStrategy;
    }

    public void applyStrategyTemplateMethod()
    {
        // todo Aquí delegará en la estrategia
    }
}