package by.epam.mypackage.command.impl;


import by.epam.mypackage.bean.Note;
import by.epam.mypackage.bean.Request;
import by.epam.mypackage.bean.Response;
import by.epam.mypackage.command.Command;
import by.epam.mypackage.service.ServiceFactory;
import by.epam.mypackage.view.NoteBookConsoleView;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.List;

public class WriteFileCommand implements Command {
    @Override
    public Response execute(Request request) {
        Response response = new Response();
        try {
            ServiceFactory.getInstance().getNoteBookService().writeFile(request.getParameter1());
            response.setMessage("File was written");
            return response;
        } catch (FileNotFoundException e) {
            response.setErrorMessage("File was not found");
            return response;
        } catch (IOException e) {
            response.setErrorMessage("IOException");
            return response;
        }
    }
}