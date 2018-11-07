package az.shafag.testapp.controller;

import az.shafag.testapp.dto.FuelTypeDTO;
import az.shafag.testapp.model.FuelType;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Set;

@RestController
@RequestMapping("/fuelType")
public class FuelTypeService {


    @Autowired
    private FuelTypeService fuelTypeService;


    @PostMapping
    public void save(@RequestBody FuelType fuelType){
        fuelTypeService.save(fuelType);
    }

    @GetMapping("/all")
    public Set<FuelTypeDTO> getAll(){
        return fuelTypeService.getAll();
    }

    @GetMapping("/{id}")
    public FuelTypeDTO getById(@PathVariable Long id){
        return fuelTypeService.getById(id);
    }

    @DeleteMapping("/{id}")
    public void deleteById(@PathVariable Long id){
        fuelTypeService.deleteById(id);
    }

}
