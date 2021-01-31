class Main {
    public static void main(String args[]) {
        csvReader reader = new csvReader("data.csv");
        Backend backend = new Backend(reader);
        UI ui = new UI(backend);

    }
}