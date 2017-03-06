package controllers;

import com.andreamazzarella.http_server.middleware.controllers.BaseController;
import com.andreamazzarella.http_server.request_response.Request;
import com.andreamazzarella.http_server.request_response.Response;

import static com.andreamazzarella.http_server.request_response.Response.StatusCode._200;

public class MethodOptionsTwoController extends BaseController {

    @Override
    protected Response get(Request request) {
        return new Response(_200);
    }

}
