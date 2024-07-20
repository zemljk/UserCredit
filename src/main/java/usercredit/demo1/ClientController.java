package usercredit.demo1;



import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import service.ClientService;

import java.sql.SQLException;

@Controller
@RequiredArgsConstructor
public class ClientController {

    
    private ClientService clientService;

        @GetMapping("/")
        public String clients (@RequestParam(name = "name", required = false) String name, Model model) throws SQLException {
            model.addAttribute("clients", clientService.getAllClients());
            return "clients";
        }

}
