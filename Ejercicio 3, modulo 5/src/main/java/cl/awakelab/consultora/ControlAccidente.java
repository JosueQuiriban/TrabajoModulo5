package cl.awakelab.consultora;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import cl.awakelab.beans.Accidente;

@Controller
public class ControlAccidente {
    
    @RequestMapping("/formularioAccidente")
    public ModelAndView reporAccidente() {
        return new ModelAndView ("ReportarAccidente","command", new Accidente());
    }
    
    @RequestMapping(value ="/agregar", method = {RequestMethod.GET, RequestMethod.POST})
    public String agregar(Accidente a, ModelMap model) {
        model.addAttribute("rut", a.getRut_empresa());
        model.addAttribute("nombre", a.getNombre_empresa());
        model.addAttribute("tipoA", a.getTipo_accidente());
        model.addAttribute("fecha", a.getFecha_accidente());
        model.addAttribute("lugar", a.getLugar_accidente());
        model.addAttribute("detalle", a.getDetalle_accidente());
        return "ReporteAccidente";
    }
}
