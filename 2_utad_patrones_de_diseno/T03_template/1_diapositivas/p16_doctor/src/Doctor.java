// Ahí debes definir el algoritmo fijo.

public abstract class Doctor
{
    protected abstract void inspectChildren();

    protected abstract void sendInvoice();

    protected abstract void sendResultInspection();

    public void applyTemplateMethod()
    {
        inspectChildren();
        sendInvoice();
        sendResultInspection();
    }
}