package models;

import java.time.LocalDateTime;

public class Task {
    private String description;
    private boolean completed;
    private LocalDateTime createdAt;
    private int id;

    public Task(String description, int categoryId){
        this.description = description;
        this.completed = false;
        this.createdAt = LocalDateTime.now();

    }

    public void setDescription(String description) {
        this.description = description;
    }
    public String getDescription() {
        return description;
    }


    public boolean getCompleted(){
        return this.completed;
    }

    public LocalDateTime getCreatedAt() {
        return createdAt;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Task task = (Task) o;

        if (completed != task.completed) return false;
        if (id != task.id) return false;
        return description != null ? description.equals(task.description) : task.description == null;
    }

    @Override
    public int hashCode() {
        int result = description.hashCode();
        result = 31 * result + (completed ? 1 : 0);
        result = 31 * result + (createdAt != null ? createdAt.hashCode() : 0);
        result = 31 * result + id;
        return result;
    }

    public int getCategoryId() {
        return id;
    }
}
