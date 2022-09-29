public class TeamMate {
    private String userId;
    private String name;
    private Boolean online;

    public TeamMate(){
    }

    public TeamMate(String userId, String name, Boolean online) {
        this.userId = userId;
        this.name = name;
        this.online = online;
    }

    public TeamMate(String userId, String name){
        this.userId=userId;
        this.name = name;
        this.online = false;
    }


    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Boolean getOnline() {
        return online;
    }

    public void setOnline(Boolean online) {
        this.online = online;
    }
}
