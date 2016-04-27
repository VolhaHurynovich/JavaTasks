package by.epam.mypackage.command.impl;

import by.epam.mypackage.bean.Request;
import by.epam.mypackage.bean.Response;
import by.epam.mypackage.command.Command;
import by.epam.mypackage.service.ServiceFactory;

public class CreateNoteBookCommand implements Command{
    @Override
    public Response execute(Request request) {
        Response response = new Response();
        ServiceFactory.getInstance().getNoteBookService().createNoteBook();
        response.setMessage("Notebook is successfully created");
        return response;
    }
}
