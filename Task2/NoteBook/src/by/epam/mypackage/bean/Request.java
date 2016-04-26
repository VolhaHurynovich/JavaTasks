package by.epam.mypackage.bean;

public class Request {
    private String command;
    private String parameter;

    public Request(String command, String parameter) {
        this.command = command;
        this.parameter = parameter;
    }

    public String getCommandName() {
        return command;
    }

    public String getParameter() {
        return parameter;
    }
}


