package controllers;

import com.andreamazzarella.http_server.middleware.controllers.BaseController;
import com.andreamazzarella.http_server.request_response.Request;
import com.andreamazzarella.http_server.request_response.Response;

import static com.andreamazzarella.http_server.request_response.Response.StatusCode._418;

public class TeaPotController extends BaseController {

    @Override
    protected Response get(Request request) {
        return new Response(_418).setBody("I'm a teapot");
    }

}
