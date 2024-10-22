package org.example;

public class Manager implements JobActions{
    String name;

    public Manager(String name) {
        this.name = name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public void doTask(Task task) {
        System.out.println(task);
    }

    @Override
    public void haveRest() {
        System.out.println("I am "+this.name+" and I drink Capucino in Rest Pause!");
    }

    @Override
    public void haveRest(String name) {


    }


}
