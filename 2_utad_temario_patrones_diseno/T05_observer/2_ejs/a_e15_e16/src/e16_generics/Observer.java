package e16_generics;

public interface Observer<T>
{
    public void update(Subject<T> subject, T valor);
}
