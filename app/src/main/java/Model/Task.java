package Model;

public class Task {

    private String Id;
    private String Name;
    private String Description;
    private Boolean piority;

    public Task() {
    }

    public Task(String id, String name, String description, Boolean piority) {
        Id = id;
        Name = name;
        Description = description;
        this.piority = piority;
    }

    public String getId() {
        return Id;
    }

    public void setId(String id) {
        Id = id;
    }

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }

    public String getDescription() {
        return Description;
    }

    public void setDescription(String description) {
        Description = description;
    }

    public Boolean getPiority() {
        return piority;
    }

    public void setPiority(Boolean piority) {
        this.piority = piority;
    }

    @Override
    public String toString() {
        return "Task{" +
                "Id='" + Id + '\'' +
                ", Name='" + Name + '\'' +
                ", Description='" + Description + '\'' +
                ", piority=" + piority +
                '}';
    }
}
