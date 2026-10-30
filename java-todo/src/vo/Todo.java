package vo;

public class Todo {

    private String name;
    private int importance;
    private boolean done;

    public Todo(String name, int importance) {
        this.name = name;
        this.importance = importance;
        this.done = false;
    }

    // 이름 getter / setter
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    // 중요도 getter / setter
    public int getImportance() {
        return importance;
    }

    public void setImportance(int importance) {
        this.importance = importance;
    }

    // 완료 여부 getter / setter
    public boolean isDone() {
        return done;
    }

    public void setDone(boolean done) {
        this.done = done;
    }

    // 완료 여부 뒤집기
    public void toggleDone() {
        this.done = !this.done;
    }

    @Override
    public String toString() {
        String status = done ? "[V]" : "[ ]";

        return status + " " + name + " / 중요도 : " + importance;
    }
}