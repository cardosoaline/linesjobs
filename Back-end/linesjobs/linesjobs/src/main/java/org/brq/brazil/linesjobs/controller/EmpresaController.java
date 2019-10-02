package org.brq.brazil.linesjobs.controller;



@RestController
public class EmpresaController {
	
	@Autowired
   private EmpresaRepository empresaRepository;
	
	@PostMapping("/empresa")
	public void criaEmpresa(@RequestBody Empresa empresa) {
	//empresaService.salva(empresa)

	

    }
	
	@GetMapping("/empresa")
	public String teste() {
	//empresaService.salva(empresa)
		return "Hello";
	

    }

}
