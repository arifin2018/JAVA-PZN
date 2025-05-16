package arifin.entity;

public class Todolist {
    private int id;
    private String todo;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Override
    public String toString() {
        return "Todolist [id=" + id + ", todo=" + todo + "]";
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + id;
        result = prime * result + ((todo == null) ? 0 : todo.hashCode());
        return result;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        Todolist other = (Todolist) obj;
        if (id != other.id)
            return false;
        if (todo == null) {
            if (other.todo != null)
                return false;
        } else if (!todo.equals(other.todo))
            return false;
        return true;
    }

    public Todolist(int id, String todo) {
        this.id = id;
        this.todo = todo;
    }

    public Todolist() {
    }

    public Todolist(String todo) {
        this.todo = todo;
    }

    public String getTodo() {
        return this.todo;
    }

    public void setTodo(String todo) {
        this.todo = todo;
    }
}