package com.thescribble.HateoasExample;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.hateoas.EntityModel;
import org.springframework.hateoas.server.mvc.WebMvcLinkBuilder;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
public class OrderController {

    IOrderService iOrderService;

    @Autowired
    public OrderController(IOrderService iOrderService) {
        this.iOrderService = iOrderService;
    }

    @GetMapping("order/{id}")
    public EntityModel<Order> getOrder(@PathVariable String id){
        Order order=iOrderService.getOrder(id);
        return getEnityModel(order);
    }

    @PostMapping
    public EntityModel<Order> createOrder(@RequestParam String item,@RequestParam String quantity){
        Order request=new Order(item,Integer.valueOf(quantity),"PROCESSING");
        Order order=iOrderService.createOrder(request);
        return getEnityModel(order);
    }

    @PutMapping("order/{id}")
    public EntityModel<Order> updateOrder(@RequestBody Order request,@PathVariable String id){
        Order order=iOrderService.updateOrder(request,id);
        return getEnityModel(order);
    }

    @DeleteMapping("order/{id}")
    public ResponseEntity<String> updateOrder(@RequestParam String id){
        iOrderService.deleteOrder(id);
        return ResponseEntity.ok("Done");
    }

    private EntityModel<Order> getEnityModel(Order order) {
        EntityModel<Order> entityModel=EntityModel.of(order);
        entityModel.add(WebMvcLinkBuilder.linkTo(WebMvcLinkBuilder.methodOn(OrderController.class).getOrder(String.valueOf(order.getId()))).withSelfRel());

        // can put other condition and linkbuilder
        return entityModel;
    }


}
