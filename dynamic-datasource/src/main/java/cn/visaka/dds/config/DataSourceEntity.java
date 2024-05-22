package cn.visaka.dds.config;

public class DataSourceEntity {

    private String url;
    /**
     * 数据库用户名
     */
    private String userName;
    /**
     * 密码
     */
    private String passWord;
    /**
     * 数据库驱动
     */
    private String driverClassName;
    /**
     * 数据库key，即保存Map中的key
     */
    private String key;

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getPassWord() {
        return passWord;
    }

    public void setPassWord(String passWord) {
        this.passWord = passWord;
    }

    public String getDriverClassName() {
        return driverClassName;
    }

    public void setDriverClassName(String driverClassName) {
        this.driverClassName = driverClassName;
    }

    public String getKey() {
        return key;
    }

    public void setKey(String key) {
        this.key = key;
    }
}
