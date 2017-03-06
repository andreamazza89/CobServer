package controllers;

import com.andreamazzarella.http_server.middleware.controllers.BaseController;
import com.andreamazzarella.http_server.request_response.Request;
import com.andreamazzarella.http_server.request_response.Response;
import com.andreamazzarella.http_server.utilities.DirectoryExplorer;

import static com.andreamazzarella.http_server.request_response.Response.StatusCode._200;

public class RootController extends BaseController {

    private final DirectoryExplorer directoryExplorer;

    public RootController(DirectoryExplorer directoryExplorer) {
        this.directoryExplorer = directoryExplorer;
    }

    @Override
    protected Response get(Request request) {
        byte[] directoryListing = directoryExplorer.generateHTMLListing().getBytes();
        return new Response(_200).setBody(directoryListing);
    }

    @Override
    protected Response head(Request request) {
        Response response = this.get(request);
        return response.setBody("".getBytes());
    }

}
