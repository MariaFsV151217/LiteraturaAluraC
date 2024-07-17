package Util;

import principal.MenuService;
import principal.Principal;

@SpringBootApplication
public class LiteraturaApplication implements CommandLineRunner {

    public static void main(String[] args) {
        SpringApplication.run(LiteraturaApplication.class, args);
    }

    @Autowired
    private MenuService menuService;

    @Override
    public void run(String... args) throws Exception {
        Principal principal = new Principal(menuService);
        principal.EjecutarAplicacion();
    }
}
