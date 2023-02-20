package com.shcar.demob.controller;

import com.shcar.demob.pojo.Selling;
import com.shcar.demob.service.ISellingService;
import com.shcar.demob.util.JsonResponse;
import com.shcar.demob.util.StatusCode;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

import java.io.Serializable;
import java.util.List;

@CrossOrigin()
@RestController
@RequestMapping("api/selling")
public class SellingController extends BaseController implements Serializable {

    @Autowired
    private ISellingService sellingService;

    @PostMapping(value = "", consumes = MediaType.APPLICATION_JSON_VALUE)
    public JsonResponse<Void> listingJson(@RequestBody Selling selling) {
        return listing(selling);
    }

    @PostMapping(value = "", consumes = MediaType.MULTIPART_FORM_DATA_VALUE)
    public JsonResponse<Void> listingFormData(Selling selling) {
        return listing(selling);
    }

    private JsonResponse<Void> listing(Selling selling) {
        JsonResponse<Void> response = new JsonResponse<>();
        sellingService.listing(selling);
        response.stateCode(StatusCode.OK)
                .message("Vehicle listing success.");
        logger.trace("Vehicle listing success.");

        return response;
    }


    @GetMapping(value = "remove/{id}")
    public JsonResponse<Void> remove(@PathVariable Integer id) {
        sellingService.remove(id);
        JsonResponse<Void> response = new JsonResponse<>();
        response.stateCode(StatusCode.OK)
                .message("Vehicle remove success.");
        logger.trace("Vehicle remove success.");

        return response;
    }

    @GetMapping(value = "all")
    public JsonResponse<List<Selling>> getAll() {
        return new JsonResponse<List<Selling>>()
                .stateCode(StatusCode.OK)
                .message("Get all selling info success")
                .data(sellingService.all());


    }
}
