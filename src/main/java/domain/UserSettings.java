package domain;

import domain.settings.ISetting;

import java.util.Dictionary;

public class UserSettings {
    private String id;
    private String username;
    private Dictionary<String, ISetting> settings;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public Dictionary<String, ISetting> getSettings() {
        return settings;
    }

    public void setSettings(Dictionary<String, ISetting> settings) {
        this.settings = settings;
    }
}
