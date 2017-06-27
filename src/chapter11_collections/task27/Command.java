package chapter11_collections.task27;

class Command {
    private String comandName;

    Command(String commandName) {
        this.comandName = commandName;
    }

    void operation() {
        System.out.println(comandName);
    }

    @Override
    public String toString() {
        return comandName;
    }
}
