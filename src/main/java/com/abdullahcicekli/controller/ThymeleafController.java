package com.abdullahcicekli.controller;

import com.abdullahcicekli.dto.ProductDto;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.ArrayList;
import java.util.List;

@Controller
public class ThymeleafController {

    @GetMapping("/thymeleaf1")
    //@ResponseBody
    public String getThymeleaf1() {
        return "thymeleaf1";
    }

    @GetMapping("thymeleaf2")
    public String getModel(Model model) {
        model.addAttribute("isim", "Sueda");
        model.addAttribute("isim", "Aminenur");

        return "thymeleaf1";
    }

    // birden fazla model göndermek
    @GetMapping("thymeleaf3")
    public String getModel2(Model model) {
        model.addAttribute("isim1", "Sueda");
        model.addAttribute("isim", "Aminenur");

        return "/thymeleaf_file/thymeleaf2";
    }

    @GetMapping("thymeleaf4")
    public String getModel4(Model model) {
        model.addAttribute("isim", "Sueda");

        return "thymeleaf4";
    }

    /// modelde object gönderme
    @GetMapping("/thymeleaf5")
    public String thymeleafObject(Model model){
        model.addAttribute("key","value");
        ProductDto productDto = ProductDto.builder()
                .productName("Iphone")
                .productPrice(23599.9)
                .id(0L).build();

        model.addAttribute("key2",productDto);
        return "thymeleaf5";
    }

    /// modelde object list gönderme
    @GetMapping("/thymeleaf6")
    public String thymeleafObjectList(Model model){
        List<ProductDto> listem = new ArrayList<>();
        listem.add(ProductDto.builder().productName("Iphone").productPrice(23599.9).id(0L).build());
        listem.add(ProductDto.builder().productName("Samsung").productPrice(16999.9).id(1L).build());
        listem.add(ProductDto.builder().productName("Xiomi").productPrice(14999.9).id(2L).build());

        model.addAttribute("productListe",listem);
        return "thymeleaf6";
    }

    // PathVariable kullanımı. (url'den değğer alma)
    @GetMapping({"/thymeleaf7", "/thymeleaf7/{id}"})
    public String thymeleafObjectList(Model model, @PathVariable(name="id", required = false) Long id){
        if(id!=null){
            model.addAttribute("id",id);
        }else{
            model.addAttribute("id","id bulunamadı");
        }
        return "thymeleaf7";
    }


}
