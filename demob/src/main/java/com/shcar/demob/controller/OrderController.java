package com.shcar.demob.controller;

import com.shcar.demob.pojo.Order;
import com.shcar.demob.pojo.Selling;
import com.shcar.demob.service.IOrderService;
import com.shcar.demob.util.JsonResponse;
import com.shcar.demob.util.StatusCode;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

import java.io.Serializable;

@CrossOrigin()
@RestController
@RequestMapping("api/order")
public class OrderController extends BaseController implements Serializable {

    @Autowired
    private IOrderService orderService;

    @PostMapping(value = "", consumes = MediaType.APPLICATION_JSON_VALUE)
    public JsonResponse<Void> addJson(@RequestBody Order order) {
        return add(order);
    }

    @PostMapping(value = "", consumes = MediaType.MULTIPART_FORM_DATA_VALUE)
    public JsonResponse<Void> addFormData(Order order) {
        return add(order);
    }

    private JsonResponse<Void> add(Order order) {
        JsonResponse<Void> response = new JsonResponse<>();
        orderService.add(order);
        response.stateCode(StatusCode.OK)
                .message("Order create success.");
        logger.trace("Order create success.");

        return response;
    }
}
