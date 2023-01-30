public class Package 
{
    private String packageNumber;
    private Widget widgets[];
    private int nextWidget;

    public Package(String packageNumber, int size)
    {
        this.packageNumber = packageNumber;
        widgets = new Widget[size];
    }

    public String getPackageNumber()
    {
        return packageNumber;
    }

    public Widget[] getWidgets()
    {
        return widgets;
    }

    private boolean hasRoom()
    {
        boolean room = false;
        for(int i = widgets.length-1; i >= 0; i--)
        {
            if(widgets[i] == null)
            {
                room = true;
            }
        }
        return room;
    }

    public boolean addWidget(Widget newWidget)
    {
        boolean added = false;
        if(hasRoom() == true)
        {
            added = true;
            for(int i = 0; i < widgets.length; i++)
            {
                if(widgets[i] == null)
                {
                    widgets[i] = newWidget;
                    i = widgets.length;
                }
            }
        }
        return added;
    }

    public boolean canShip()
    {
        boolean ship = true;
        for(Widget i : widgets)
        {
            if(i == null)
            {
                ship = false;
                return ship;
            }
        }
        return ship;
    }

    public String toString()
    {
        String result = ("Package Number: " + packageNumber);
        for(Widget i : widgets)
        {
            result += i.toString();
        }
        return result;
    }
}
