package by.epam.mypackage.controller;

import MyException.CommandException;
import by.epam.mypackage.bean.Request;
import by.epam.mypackage.bean.Response;
import by.epam.mypackage.command.Command;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;


public class Controller {
    private final static Logger LOG = LogManager.getRootLogger();
    private final static Logger LOG1 = LogManager.getLogger("MyLogger");
    private final CommandHelper helper = new CommandHelper();

    public Controller() {
    }


    public Response doAction(Request request) {
        String commandName = request.getCommandName();
        Command command;
        Response response;
        try {
            command = helper.getCommand(commandName);
            response = command.execute(request);
            LOG.info(request.getCommandName() + "   is OK");
            LOG1.info(request.getCommandName() + "   is OK");
        } catch (CommandException e) {
            LOG.error("CommandException in Controller",e);
            LOG1.error("CommandException in Controller", e);
            Response responseHelp = new Response();
            responseHelp.setErrorMessage("Invalid command");
            return responseHelp;
        }
        return response;

    }
}
