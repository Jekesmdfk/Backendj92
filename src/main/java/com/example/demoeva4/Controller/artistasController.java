package com.example.demoeva4.Controller;

import com.example.demoeva4.Bean.artistasBean;
import com.example.demoeva4.Service.artistasRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/artistas")
@CrossOrigin(origins = "http://localhost:4200/")
public class artistasController {



    @Autowired
    private artistasRepository artRepo;

    @GetMapping("/obtener")
    public List<artistasBean> ObtenerArtistas(){
        List<artistasBean> listaArtistas = new ArrayList<>();
        listaArtistas = (List<artistasBean>) artRepo.findAll();
        return listaArtistas;
    }

    @PostMapping("/insertar")
    public void insertarArtista(@RequestBody artistasBean artBean){artRepo.save(artBean);}

    @PutMapping("/modificar")
    public void modificarArtista(@RequestBody artistasBean artBean){
        artRepo.save(artBean);
    }

    @DeleteMapping("/eliminar")
    public void eliminarArtista (@RequestBody artistasBean artBean) { artRepo.deleteById(artBean.getIdmusico());}



    @PutMapping("/modificar/{idmusico}")
    public void modificarMusicoUnico (@PathVariable("idmusico") Integer idmusico , @RequestBody artistasBean artBean){
        artBean.setIdmusico(idmusico);
        artRepo.save(artBean);
    }

    @GetMapping("/obtener/{idmusico}")
    public ResponseEntity<artistasBean> ObtenerArtistaUnico (@PathVariable("idmusico") Integer idmusico) {
        artistasBean listArtistaEncontrado = artRepo.findById(idmusico).orElseThrow();
        return ResponseEntity.ok(listArtistaEncontrado);
    }

    @DeleteMapping("/eliminar/{idmusico}")
    public void eliminar (@PathVariable("idmusico") Integer idmusico){
        artRepo.deleteById(idmusico);
    }

}
