package controllers;

import com.andreamazzarella.http_server.middleware.controllers.BaseController;
import com.andreamazzarella.http_server.request_response.Request;
import com.andreamazzarella.http_server.request_response.Response;

import static com.andreamazzarella.http_server.request_response.Response.StatusCode._200;

public class MethodOptionsController extends BaseController {

    @Override
    protected Response get(Request request) {
        return new Response(_200);
    }

    @Override
    protected Response head(Request request) {
        return new Response(_200);
    }

    @Override
    protected Response post(Request request) {
        return new Response(_200);
    }

    protected Response put(Request request) {
        return new Response(_200);
    }

}
