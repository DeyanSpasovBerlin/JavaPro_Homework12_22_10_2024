package org.example;

public class Office {
    public static void main(String[] args) {
        JobActions manager = new Manager("Herr Hintze");
        JobActions.Task  taskManager = new JobActions.Task(" ArbeitOrder"," Nouen Aufgang - instol " +
                "Stecher in " +
                "AufgangTreppe!");
        JobActions.Task  taskWorker= new JobActions.Task("Chief zagen: TagenOrder"," Instoll Stecher in Treppe!");
        JobActions.Task taskLazyWorker = new JobActions.Task("Chief zagen: Hide from me!"," Do not prevent others " +
                "from working!");
        manager.haveRest();
        manager.doTask(taskManager);
        System.out.println("**********");
        JobActions worker = new JobActions() {
            @Override
            public void doTask(Task task) {
                System.out.println(task);
            }

            @Override
            public void haveRest() {

            }

            @Override
            public void haveRest(String name) {

                System.out.println("Ich bin "+name+" und Ich  raushe in Rest Pause!");
            }
        };

        worker.haveRest("Jurgen");
        worker.doTask(taskWorker);
        System.out.println("**********");
        JobActions lazyWorker = new JobActions() {
            @Override
            public void doTask(Task task) {
                System.out.println(task);
            }

            @Override
            public void haveRest() {

            }

            @Override
            public void haveRest(String name) {
                System.out.println("Ich bin "+name+" und Ich schlafe den ganzen Tag!");
            }
        };
        lazyWorker.haveRest("Mustafa");
        worker.doTask(taskLazyWorker);

    }
}
