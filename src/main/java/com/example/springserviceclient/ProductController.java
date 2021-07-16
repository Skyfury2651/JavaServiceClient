package com.example.springserviceclient;


import com.example.springserviceclient.client.service.ClientService;
import com.example.springserviceclient.service.Product;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
@RequestMapping("/products")
public class ProductController {

    @RequestMapping(method = RequestMethod.GET, value = "/add")
    public String addOrUpdate(Product product, BindingResult result, Model model) {
        ClientService clientService = new ClientService();
        if (result.hasErrors()) {
            model.addAttribute("products", clientService.productService().all());
            model.addAttribute("product", product);
            return "list";
        }
        model.addAttribute("products", clientService.productService().all());
        clientService.productService().updateOrUpdate(product);
        return "list";
    }

    @RequestMapping(method = RequestMethod.GET, value = "/index")
    public String showProductList(Model model) {
        ClientService clientService = new ClientService();
        model.addAttribute("products", clientService.productService().all());
        model.addAttribute("product", new Product());
        return "list";
    }

}
