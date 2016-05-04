package by.epam.mypackage.controller;

import MyException.CommandException;
import by.epam.mypackage.command.Command;
import by.epam.mypackage.command.impl.*;

import java.util.HashMap;
import java.util.Map;

public class CommandHelper {
    private Map<CommandName, Command> commands = new HashMap<>();

    public CommandHelper() {
        commands.put(CommandName.CREATE_NOTEBOOK, new CreateNoteBookCommand());
        commands.put(CommandName.ADD_NOTE, new AddNoteCommand());
        commands.put(CommandName.SEARCH_BY_DATE, new SearchByDateCommand());
        commands.put(CommandName.SEARCH_BY_TEXT, new SearchByTextCommand());
        commands.put(CommandName.SHOW_NOTEBOOK, new GetNoteBookCommand());
        commands.put(CommandName.READ_FILE, new ReadFileCommand());
        commands.put(CommandName.WRITE_FILE, new WriteFileCommand());
    }

    public Command getCommand(String commandName) throws CommandException {
        Command executeCommand;
        try {
            CommandName command = CommandName.valueOf(commandName);
            executeCommand = commands.get(command);
        } catch (IllegalArgumentException e) {
            throw new CommandException("IllegalArgumentException - Invalid command");
        } catch (Exception e) {
            throw new CommandException("Exception - Invalid command");
        }
        return executeCommand;
    }
}
