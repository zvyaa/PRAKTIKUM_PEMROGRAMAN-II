package Soal1;
public class CommandFactory {
    private InventoryRepository repository;

    public CommandFactory(InventoryRepository repository) {
        this.repository = repository;
    }

    public Command createCommand(String option) {
        switch (option) {
            case "1":
                return new AddCommand(repository);
            case "2":
                return new RemoveCommand(repository);
            case "3":
                return new ShowCommand(repository);
            default:
                return null;
        }
    }
}

