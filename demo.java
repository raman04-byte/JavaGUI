public enum demo
{
    raman("cute","19"),
    Gargi("onii chaa", "19"),
    chutki("small","18");
    
    private final String desc;
    private final String year;
    
    demo(String description, String age)
    {
        desc = description;
        year = age;
    }

    public String getDesc()
    {
        return desc;
    }
    public String getage()
    {
        return year;
    }
}
