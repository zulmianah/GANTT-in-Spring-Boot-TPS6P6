/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.example;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

/**
 *
 * @author Komun
 */
@RestController
@CrossOrigin(origins = "*")
public class ClientController {

    @RequestMapping(value = "/", method = RequestMethod.GET)
    public ModelAndView index(Model model) {
        model.addAttribute("page", "fragments/index");
        return new ModelAndView("page");
    }

    @RequestMapping("/article")
    public ModelAndView article(Model model) {
        model.addAttribute("page", "fragments/article");
        return new ModelAndView("page");
    }

    @RequestMapping("/connection")
    public ModelAndView connection(Model model) {
        model.addAttribute("page", "fragments/connection");
        return new ModelAndView("page");
    }

    @RequestMapping("/inscription")
    public ModelAndView inscription(Model model) {
        model.addAttribute("page", "fragments/inscription");
        return new ModelAndView("page");
    }

    @RequestMapping("/deconnection")
    public ModelAndView deconnection(Model model) {
        model.addAttribute("page", "fragments/deconnection");
        return new ModelAndView("page");
    }

    @RequestMapping("/liste/article")
    public ModelAndView listeArticle(Model model) {
        model.addAttribute("page", "fragments/liste-article");
        return new ModelAndView("page");
    }

    @RequestMapping("/recherche/article")
    public ModelAndView rechercheArticle(Model model) {
        model.addAttribute("page", "fragments/recherche-article");
        return new ModelAndView("page");
    }

}
