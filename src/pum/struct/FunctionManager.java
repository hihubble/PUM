package pum.struct;

import java.util.HashMap;

public class FunctionManager
{
    private static final FunctionManager instance = new FunctionManager();

    public static FunctionManager Instance(){return instance;}

    private FunctionManager()
    {
        AddCT("Type");
        AddC("Type", "int", "QD");
        AddC("Type", "float", "DD");
    }

    private HashMap<String, HashMap<String, String>> c = new HashMap<>();

    public String GetC(String name, String type)
    {
        return c.get(name).get(type);
    }

    public void AddCT(String name)
    {
        c.put(name, new HashMap<>());
    }

    public void AddC(String name, String type, String value)
    {
        c.get(name).put(type, value);
    }
}
