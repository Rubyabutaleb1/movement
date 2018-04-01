import java.io.Serializable;

public class Organization implements Serializable{
    private String orgName;
    private String orgPurpose;

    public Organization() {
        orgName = "";
        orgPurpose = "";
    }

    public Organization(String orgName, String orgPurpose){
        this.orgName = orgName;
        this.orgPurpose = orgPurpose;
    }

    public String getOrgName(){
        return orgName;
    }

    public void setOrgName(String orgName){
        this.orgName = orgName;
    }

    public String getOrgPurpose(){
        return orgPurpose;
    }

    public void setOrgPurpose(String orgPurpose){
        this.orgPurpose = orgPurpose;
    }
}

