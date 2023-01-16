package amraoui_tobbal.project.entity;

public class Mercato {
    private int id;
    private String season;
    private String playerName;
    private String teamFrom;
    private String teamTo;
    private String valueTransfer;

    public Mercato() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getSeason() {
        return season;
    }

    public void setSeason(String season) {
        this.season = season;
    }

    public String getPlayerName() {
        return playerName;
    }

    public void setPlayerName(String playerName) {
        this.playerName = playerName;
    }

    public String getTeamFrom() {
        return teamFrom;
    }

    public void setTeamFrom(String teamFrom) {
        this.teamFrom = teamFrom;
    }

    public String getTeamTo() {
        return teamTo;
    }

    public void setTeamTo(String teamTo) {
        this.teamTo = teamTo;
    }

    public String getValueTransfer() {
        return valueTransfer;
    }

    public void setValueTransfer(String valueTransfer) {
        this.valueTransfer = valueTransfer;
    }
}
