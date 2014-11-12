public class RuntimeInformationHelper
{

    public static RuntimeInformation getRuntimeInformation()
    {
        RuntimeInformation inf = new RuntimeInformation();
        inf.FreeMemory = Runtime.getRuntime().freeMemory();    
        inf.TotalMemory = Runtime.getRuntime().totalMemory();
        inf.MaxMemory = Runtime.getRuntime().maxMemory();
        inf.UsedMemory = inf.TotalMemory - inf.FreeMemory;
        inf.AvailableProcessors = Runtime.getRuntime().availableProcessors();

        inf.JavaVersion= System.getProperty("java.version");
        inf.OsArchitecture= System.getProperty("os.arch");
        inf.UserName= System.getProperty("user.name");
        inf.JavaVmName= System.getProperty("java.vm.name");
        inf.OsName= System.getProperty("os.name");
        inf.OsVersion= System.getProperty("os.version");

        java.net.InetAddress localMachine = java.net.InetAddress.getLocalHost();
        inf.LocalMachineHostName   = localMachine.getHostName();


        return inf;

    }

}

public class RuntimeInformation
{
    long FreeMemory;    
    long TotalMemory;
    long MaxMemory;
    long UsedMemory;
    String LocalMachineHostName;
    String JavaVersion;
    String OsArchitecture;
    String UserName;
    String JavaVmName;
    String OsName;
    String OsVersion;
    int AvailableProcessors;
}
