package by.epam.mypackage.controller;

import by.epam.mypackage.bean.Request;
import by.epam.mypackage.bean.Response;
import by.epam.mypackage.command.Command;

public class Controller {
    private final CommandHelper helper = new CommandHelper();

    public Controller(){}


    public Response doAction(Request request){
        String commandName = request.getCommandName();
        Command command = helper.getCommand(commandName);
        Response response = command.execute(request);
        return response;
    }

}
