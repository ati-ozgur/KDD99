public class RuntimeInformationHelper
{

    public static RuntimeInformation getRuntimeInformation()
    {
        RuntimeInformation inf = new RuntimeInformation();
        inf.FreeMemory = Runtime.getRuntime().freeMemory();    
        inf.TotalMemory = Runtime.getRuntime().totalMemory();
        inf.MaxMemory = Runtime.getRuntime().maxMemory();
        inf.UsedMemory = inf.TotalMemory - inf.FreeMemory;

        inf.JavaVersion= System.getProperty("java.version");

        return inf;

    }

}

public class RuntimeInformation
{
    long FreeMemory;    
    long TotalMemory;
    long MaxMemory;
    long UsedMemory;
    String MachineName;
    String JavaVersion;
    String OsArchitecture;
    String UserName;
    String JavaVmName;
    String OsName;
    String OsVersion;
}
