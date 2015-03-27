package testBench.ids.kdd99.modelHelpers;

public class ArffFileFromDatabase {
    
    
    public ArffFileFromDatabase(String pSql,String pFilenameForCombined)
    {
        sql = pSql;
        filenameForCombined = pFilenameForCombined;
    }
    
    private String sql;
    public String getSql() {
        return sql;
    }

    public void setSql(String sql) {
        this.sql = sql;
    }


    public String getFilenameForCombined() {
        return filenameForCombined;
    }

    public void setFilenameForCombined(String filenameForCombined) {
        this.filenameForCombined = filenameForCombined;
    }


    private String filenameForDatabase;
    private String filenameForCombined;
}

