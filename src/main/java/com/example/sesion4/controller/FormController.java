/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.example.sesion4.controller;

import com.example.sesion4.model.User;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class FormController {

    @GetMapping("/form")
    public String mostrarFormulario(Model model) {
        model.addAttribute("user", new User());
        return "form";
    }

    @PostMapping("/registrar")
    public String registrarUsuario(@ModelAttribute User user, Model model) {
        model.addAttribute("user", user);
        return "success";
    }
}
