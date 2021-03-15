package pum.struct;

import java.util.HashMap;

public class TypeManager {

    private static final TypeManager instance = new TypeManager();

    public static TypeManager Instance(){return instance;}

    private TypeManager()
    {
        AddCT("Type");
        AddC("Type", "int", "DD");
        AddC("Type", "float", "DD");

        AddCT("PrintFormat");
        AddC("PrintFormat", "int", "%d");
        AddC("PrintFormat", "string", "%s");
        AddC("PrintFormat", "float", "%.6f");
        AddC("PrintFormat", "bool", "%d");
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
