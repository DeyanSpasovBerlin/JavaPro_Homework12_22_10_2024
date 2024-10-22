package org.example;

public interface JobActions {
    void doTask(Task task);

    void haveRest();

    void haveRest(String name);

    public class Task {
        private String name;
        private String description;

        public Task(String name, String description) {
            this.name = name;
            this.description = description;
        }

        @Override
        public String toString() {
            return "Der Task " + name + "  name  und Besprechung " + description;
        }

    }
}