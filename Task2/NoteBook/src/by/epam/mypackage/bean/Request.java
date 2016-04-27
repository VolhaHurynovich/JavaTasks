package by.epam.mypackage.bean;

public class Request {
    private String command;
    private String parameter;
    private String date;

    public Request(String command, String text, String date) {
        this.command = command;
        this.parameter = text;
        this.date = date;
    }

    public String getCommandName() {
        return command;
    }

    public void setCommand(String command) {
        this.command = command;
    }

    public String getParameter() {
        return parameter;
    }

    public void setParameter(String parameter1) {
        this.parameter = parameter;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }


}


