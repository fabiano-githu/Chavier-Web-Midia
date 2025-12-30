package com.chavier.chavierWebMidia.controller.padscontroller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model; // Importante para enviar dados para o HTML
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class WebMidiaPadsController {

    // A ligação: Quando o usuário digita /webmidia-pads
    @GetMapping("/webmidia-pads")
    public String webmidiaPads(Model model) {

        // Exemplo de como enviar dados do Back para o Front (FreeMarker)
        model.addAttribute("titulo", "Bem-vindo ao WebMidia Pads");
        model.addAttribute("status", "Ativo");

        // O Spring procura em: src/main/resources/templates/section/webmidia-pads.html
        return "section/webmidia-pads";
    }
}