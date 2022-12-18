package com.example.demoeva4.Controller;

import com.example.demoeva4.Bean.clienteDiegoBean;
import com.example.demoeva4.Service.clienteDiegoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
@CrossOrigin(origins = "http://localhost:4200/")
@RequestMapping("/cliente")

public class clienteDiegoController {
    @Autowired
    private clienteDiegoRepository cliRepo;

    @GetMapping("/obtener")
    public List<clienteDiegoBean> obtenercliente(){
        List<clienteDiegoBean> listacliente = new ArrayList<>();
        listacliente = (List<clienteDiegoBean>) cliRepo.findAll();
        return listacliente;
    }
    @PostMapping("/insertar")
    public void insertarcliente(@RequestBody clienteDiegoBean cliBean){
        cliRepo.save(cliBean);

    }
    @PutMapping("/modificar")
    public void modificarnombrecliente(@RequestBody clienteDiegoBean cliBean){
        cliRepo.save(cliBean);
    }

    @DeleteMapping("/eliminar")
    public void eliminar(@RequestBody clienteDiegoBean cliBean) {
        cliRepo.deleteById(cliBean.getIdcliente());

    }
    @PutMapping("/modificar/{idcliente}")
    public void modificarnombreclienteID (@PathVariable("idcliente") Integer idcliente, @RequestBody clienteDiegoBean cliBean){
        cliBean.setIdcliente(idcliente);
        cliRepo.save(cliBean);
    }
    @GetMapping("/obtener/{idcliente}")
    public ResponseEntity<clienteDiegoBean> obtenerclienteUnico(@PathVariable ("idcliente") Integer  idcliente){
        clienteDiegoBean ListclienteEncontrado = cliRepo.findById(idcliente).orElseThrow();
        return ResponseEntity.ok(ListclienteEncontrado);

    }
    @DeleteMapping("/eliminar/{idcliente}")
    public void eliminar (@PathVariable("idcliente") Integer  idcliente) {
        cliRepo.deleteById(idcliente);
    }



}
