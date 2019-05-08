/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.example;

import com.zulmianah.dao.AuteurDAO;
import com.zulmianah.dao.HelperDAO;
import com.zulmianah.dao.SouscategorieDAO;
import java.sql.Connection;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

/**
 *
 * @author Komun
 */
@RestController
@CrossOrigin(origins = "*")
@RequestMapping("/admin")
public class AdminController {

    @RequestMapping("/nouvel/article")
    public ModelAndView nouvelArticle(Model model) throws Exception {
        model.addAttribute("page", "fragments/admin/nouvel-article");
        HelperDAO h = new HelperDAO();
        SouscategorieDAO scDAO = new SouscategorieDAO();
        AuteurDAO aDAO = new AuteurDAO();
        Connection c = null;
        try {
            c = h.getConnection();
            model.addAttribute("listeSousCategorie", scDAO.listeSousCategorie(c));
            model.addAttribute("listeAuteur", aDAO.listeAuteur(c));
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            if (c != null) {
                c.close();
            }
        }
        return new ModelAndView("admin");
    }

    @RequestMapping("/connection")
    public ModelAndView connection(Model model) {
        model.addAttribute("page", "fragments/admin/connection");
        return new ModelAndView("admin");
    }

    @RequestMapping("/index")
    public ModelAndView index(Model model) {
        model.addAttribute("page", "fragments/admin/index");
        return new ModelAndView("admin");
    }

    @RequestMapping("/article")
    public ModelAndView article(Model model) {
        model.addAttribute("page", "fragments/admin/article");
        return new ModelAndView("admin");
    }

    @RequestMapping("/liste/article")
    public ModelAndView listeArticle(Model model) {
        model.addAttribute("page", "fragments/admin/liste-article");
        return new ModelAndView("admin");
    }

    @RequestMapping(value = "/creer/article", method = RequestMethod.POST)
    public ModelAndView creerArticle(Model model,
            @RequestParam("titre") String titre,
            @RequestParam("listeAuteur") String listeAuteur) {
        System.out.println(titre);
        System.out.println(listeAuteur);
        model.addAttribute("page", "fragments/admin/liste-article");
        return new ModelAndView("redirect:/admin/liste/article");
    }

}
