class ThreadMain{
    public static void main(String[] args) {
        Thread thread = Thread.currentThread();
        System.out.println("Class: " + thread.getClass());
        System.out.println("Name: " + thread.getName());
        System.out.println("Priority: " + thread.getPriority());
        System.out.println("Group name: " + thread.getThreadGroup().getName());
    }
}