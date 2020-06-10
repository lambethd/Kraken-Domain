package domain;

public class User implements IDocument{
    private String id;
    private String username;
    private String password;
    private String firstName;
    private String lastName;
    private AuthScope scope;

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

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public AuthScope getScope() {
        return scope;
    }

    public void setScope(AuthScope scope) {
        this.scope = scope;
    }
}
