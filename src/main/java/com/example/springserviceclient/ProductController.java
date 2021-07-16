package com.example.springserviceclient;


import com.example.springserviceclient.client.service.ClientService;
import com.example.springserviceclient.service.Product;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
@RequestMapping("/products")
public class ProductController {

    @RequestMapping(method = RequestMethod.GET, value = "/add")
    public String add(Product product, BindingResult result, Model model) {
        ClientService clientService = new ClientService();
        if (result.hasErrors()) {
            model.addAttribute("products", clientService.productService().getAllProducts());
            model.addAttribute("product", product);
            return "list";
        }
        model.addAttribute("products", clientService.productService().getAllProducts());
        clientService.productService().addProduct(product);
        return "list";
    }

    @RequestMapping(method = RequestMethod.GET, value = "/add")
    public String sell(Product product, int quantity, BindingResult result, Model model) {
        ClientService clientService = new ClientService();
        if (result.hasErrors()) {
            model.addAttribute("products", clientService.productService().getAllProducts());
            model.addAttribute("product", product);
            return "list";
        }
        model.addAttribute("products", clientService.productService().getAllProducts());
        clientService.productService().sellProduct(product.getId(), quantity);
        return "list";
    }

    @RequestMapping(method = RequestMethod.GET, value = "/index")
    public String showProductList(Model model) {
        ClientService clientService = new ClientService();
        model.addAttribute("products", clientService.productService().getAllProducts());
        model.addAttribute("product", new Product());
        return "list";
    }

}
