class HelloWorldPrinter implements Runnable {
    public void run() {
        for (int i = 0; i < 5; i++) {
            System.out.println("Hello, World!");
        }
    }

    public static void main(String[] args) {
        Thread thread = new Thread(new HelloWorldPrinter());
        thread.start();
    }
}
