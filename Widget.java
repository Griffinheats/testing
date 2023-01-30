public class Widget
{
    private String color; 
    private String model; 
    private String serialNumber;    

    public Widget(String color, String model, String serialNumber)
    {
        this.color = color;
        this.model = model;
        this.serialNumber = serialNumber;
    }

    public String getColor()
    {
        return color;
    }

    public String getModel()
    {
        return model;
    }

    public String getSerialNumber()
    {
        return serialNumber;
    }

    public String toString()
    {
        return ("\nWidget model: " + model + "\nColor: " + color + "\nSerial number: " + serialNumber);
    }
}
