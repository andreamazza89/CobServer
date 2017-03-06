package controllers;

import com.andreamazzarella.http_server.middleware.controllers.BaseController;
import com.andreamazzarella.http_server.request_response.Header;
import com.andreamazzarella.http_server.request_response.Request;
import com.andreamazzarella.http_server.request_response.Response;

import java.util.Optional;

import static com.andreamazzarella.http_server.request_response.Response.StatusCode._200;

public class EatCookieController extends BaseController {

    @Override
    protected Response get(Request request) {
        Optional<Header> cookieData = request.getCookieHeader();
        String cookieValue = cookieData.isPresent() ? cookieData.get().getValue() : "";
        byte[] body = ("mmmm " + cookieValue).getBytes();
        return new Response(_200).setBody(body);
    }

}
