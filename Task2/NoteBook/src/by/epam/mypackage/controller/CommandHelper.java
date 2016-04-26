package by.epam.mypackage.controller;

import by.epam.mypackage.command.Command;
import by.epam.mypackage.command.impl.AddNote;
import by.epam.mypackage.command.impl.CreateNoteBook;

import java.util.HashMap;
import java.util.Map;

public class CommandHelper {
    private Map<CommandName, Command> commands = new HashMap<>();

    public CommandHelper(){
        commands.put(CommandName.CREATE_NOTEBOOK, new CreateNoteBook());
        commands.put(CommandName.ADD_NOTE, new AddNote());
        // TODO: 4/26/2016
    }

    public Command getCommand(String commandName){
        CommandName command = CommandName.valueOf(commandName);
        Command executeCommand = commands.get(command);
        return executeCommand;
    }
}
