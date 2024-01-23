package com.fmi.frontendmodbdglobal.controller;

import com.fmi.frontendmodbdglobal.model.Angajat;
import com.fmi.frontendmodbdglobal.service.AngajatService;
import jakarta.transaction.Transactional;
import jakarta.validation.Valid;
import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import java.util.Optional;

@Controller
@AllArgsConstructor
@Slf4j
public class AngajatController {

    private final AngajatService angajatService;

    @GetMapping({ "/angajat/list"})
    public ModelAndView angajatList(@RequestParam("page") Optional<Integer> page,
                                     @RequestParam("size") Optional<Integer> size){
        int currentPage = page.orElse(1);
        int pageSize = size.orElse(15);
        ModelAndView modelAndView = new ModelAndView("angajati");
        Page<Angajat> angajatPage = angajatService.findPaginated(PageRequest.of(currentPage - 1, pageSize));
        modelAndView.addObject("angajatPage", angajatPage);
        return modelAndView;
    }

    @GetMapping("/angajat/add")
    public String newAngajat(Model model) {
        model.addAttribute("angajat", new Angajat());
        return "angajat-form";
    }

    @PostMapping("/angajat")
    @Transactional
    public String save(@Valid @ModelAttribute("angajat") Angajat angajat,
                       BindingResult bindingResult) {
        if (bindingResult.hasErrors()){
            return "angajat-form";
        }
        Angajat savedAngajat = angajatService.save(angajat);

        log.info("Successfully added angajat with id {} by user {}", savedAngajat.getIdAngajat());
        return "redirect:/angajat/list" ;
    }

}
