package by.epam.mypackage.controller;

import by.epam.mypackage.command.Command;
import by.epam.mypackage.command.impl.AddNoteCommand;
import by.epam.mypackage.command.impl.CreateNoteBookCommand;

import java.util.HashMap;
import java.util.Map;

public class CommandHelper {
    private Map<CommandName, Command> commands = new HashMap<>();

    public CommandHelper(){
        commands.put(CommandName.CREATE_NOTEBOOK, new CreateNoteBookCommand());
        commands.put(CommandName.ADD_NOTE, new AddNoteCommand());
        commands.put("SEARCH_BY_DATE", new SearchByDateCommand());
        commands.put("SEARCH_BY_CONTENT", new SearchByTextCommand());
        commands.put("SHOW_NOTEBOOK", new GetNoteBookCommand());
        commands.put("READ_FROM_FILE", new ReadFileCommand());
        commands.put("WRITE_TO_FILE", new WriteFileCommand());
    }

    public Command getCommand(String commandName){
        CommandName command = CommandName.valueOf(commandName);
        Command executeCommand = commands.get(command);
        return executeCommand;
    }
}
