package controllers;

import com.andreamazzarella.http_server.middleware.controllers.BaseController;
import com.andreamazzarella.http_server.request_response.Request;
import com.andreamazzarella.http_server.request_response.Response;

import java.util.Optional;

import static com.andreamazzarella.http_server.request_response.Response.StatusCode._200;

public class FormController extends BaseController {

    private Optional<byte[]> formContent = Optional.empty();

    @Override
    protected Response get(Request request) {
        return new Response(_200).setBody(formContent.orElse("".getBytes()));
    }

    @Override
    protected Response post(Request request) {
        formContent = request.getBody();
        return new Response(_200);
    }

    @Override
    protected Response put(Request request) {
        return post(request);
    }

    @Override
    protected Response delete(Request request) {
        formContent = Optional.empty();
        return new Response(_200);
    }
}