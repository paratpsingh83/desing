package Creational.prototype_design_pattern;

import java.util.ArrayList;
import java.util.List;

public class NetworkConnection implements Cloneable {

    private String ip;
    private String importantData;
    private List<String> domains = new ArrayList<>();

    public void loadVeryImportantData() throws InterruptedException {
        this.importantData = "Very very important data";
        domains.add("www.titu.com");
        domains.add("www.pratap.com");
        domains.add("www.singh.com");
        domains.add("www.google.com");
        Thread.sleep(2000);
    }

    public String getIp() {
        return ip;
    }

    public void setIp(String ip) {
        this.ip = ip;
    }

    public String getImportantData() {
        return importantData;
    }

    public void setImportantData(String importantData) {
        this.importantData = importantData;
    }

    public List<String> getDomains() {
        return domains;
    }

    public void setDomains(List<String> domains) {
        this.domains = domains;
    }

    @Override
    public String toString() {
        return "NetworkConnection{" +
                "ip='" + ip + '\'' +
                ", importantData='" + importantData + '\'' +
                ", domains=" + domains +
                '}';
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {

        //logic for deep cloning
        NetworkConnection networkConnection = new NetworkConnection();
        networkConnection.setIp(this.getIp());
        networkConnection.setImportantData(this.getImportantData());
        for (String d : this.getDomains()) {
            networkConnection.getDomains().add(d);
        }
        return networkConnection;
    }
}
