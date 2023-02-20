package com.shcar.demob.service.ex;
import com.shcar.demob.util.JsonResponse;
import com.shcar.demob.util.StatusCode;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class ServiceException extends RuntimeException{

    protected static final Logger logger = LoggerFactory.getLogger(ServiceException.class);
    public ServiceException() {
    }

    public ServiceException(String message) {
        super(message);
    }

    public ServiceException(String message, Throwable cause) {
        super(message, cause);
    }

    public ServiceException(Throwable cause) {
        super(cause);
    }

    public ServiceException(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
        super(message, cause, enableSuppression, writableStackTrace);
    }

    public JsonResponse<Void> errorResponse() {
        JsonResponse<Void> response = new JsonResponse<Void>()
                .stateCode(StatusCode.NotAcceptable)
                .message(this.getMessage());
        logger.debug("The format of the parameter is incorrect.");
        logger.debug(this.getMessage());
        return response;
    }
}
