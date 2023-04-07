package ch.zhaw.iwi.devops.demo;

public class ToDo {

    private int id;
    private String title;
    private String description;
    private String color;
    
    public ToDo(int id, String title, String description, String color) {
        this.id = id;
        this.title = title;
        this.description = description;
        this.color = color;
    }

    public int getId() {
        return id;
    }    

    public void setId(int id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public String getDescription() {
        return description;
    }
    
    public String getColor() {
        return color;
    }
    
}
