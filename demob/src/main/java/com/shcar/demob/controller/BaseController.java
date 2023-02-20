package com.shcar.demob.controller;
import com.shcar.demob.service.ex.ServiceException;
import com.shcar.demob.util.JsonResponse;
import com.shcar.demob.util.StatusCode;
import jakarta.servlet.http.HttpSession;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.ExceptionHandler;


/**
 * Base class for all controller.
 */
public class BaseController {
    protected static final Logger logger = LoggerFactory.getLogger(BaseController.class);

    // Exceptions Interceptors
    @ExceptionHandler(ServiceException.class)
    public JsonResponse<Void> handleException(Throwable e) {
        JsonResponse<Void> response = new JsonResponse<>();

        if (e instanceof ServiceException) {
            return ((ServiceException) e).errorResponse();
        }

        response.stateCode(StatusCode.InternalServerError)
                .message("Unregistered error");
        logger.warn("Unregistered error");
        e.printStackTrace();
        return response;
    }


}

