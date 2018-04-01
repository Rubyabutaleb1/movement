import java.io.Serializable;

public class Organization implements Serializable{
    private String orgName;
    private String purpose;
    private String heroClass;
    private String partyName;
    private Integer level;
    private Integer hoursPlayed;
    private Integer gamesWon;
    private Double kdRatio;

    public User() {
        userName = "";
        heroName = "";
        heroClass = "";
        partyName = "";
        level = null;
        hoursPlayed = null;
        gamesWon = null;
        kdRatio = null;

    }

    public User(String userName, String heroName, String heroClass, String partyName, Integer level, Integer hoursPlayed, Integer gamesWon, Double kdRatio){
        this.userName = userName;
        this.heroName = heroName;
        this.heroClass = heroClass;
        this.partyName = partyName;
        this.level = level;
        this.hoursPlayed = hoursPlayed;
        this.gamesWon = gamesWon;
        this.kdRatio = kdRatio;
    }

    public String getUserName(){
        return userName;
    }

    public void setUserName(String userName){
        this.userName = userName;
    }

    public String getHeroName(){
        return heroName;
    }

    public void setHeroName(String heroName){
        this.heroName = heroName;
    }

    public String getHeroClass(){
        return heroClass;
    }

    public void setHeroClass(String heroClass){
        this.heroClass = heroClass;
    }

    public String getPartyName(){
        return partyName;
    }

    public void setPartyName(String partyName){
        this.partyName = partyName;
    }

    public Integer getLevel(){
        return level;
    }

    public void setLevel(Integer level){
        this.level = level;
    }

    public Integer getHoursPlayed(){
        return hoursPlayed;
    }

    public void setHoursPlayed(Integer gamesPlayed){
        this.hoursPlayed = gamesPlayed;
    }

    public Integer getGamesWon(){
        return gamesWon;
    }

    public void setGamesWon(Integer gamesWon){
        this.gamesWon = gamesWon;
    }

    public Double getkdRatio (){
        return kdRatio;
    }

    public void setkdRatio (Double kdRatio){
        this.kdRatio = kdRatio;
    }
}

