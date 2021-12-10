package com.example.objprod.controllers;


import com.example.objprod.entities.*;
import com.example.objprod.repos.*;
import lombok.RequiredArgsConstructor;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.lang.reflect.Field;
import java.util.Arrays;
import java.util.Optional;

@Controller
@RequiredArgsConstructor
public class MainController {
    private final CustomerRepository customerRepository;
    private final DeliveryProcessRepository deliveryProcessRepository;
    private final LensRepository lensRepository;
    private final ManufacturingProcessRepository manufacturingProcessRepository;
    private final MaterialRepository materialRepository;
    private final OrderForObjRepository orderForObjRepository;
    private final ToolRepository toolRepository;
    private final UserRepository userRepository;
    private final WorkerRepository workerRepository;
    private final WorkplaceRepository workplaceRepository;
    private final WorkShiftRepository workShiftRepository;

    //    @GetMapping("/tables")
//     public String tables(Model model){
//        model.addAttribute("Customers", customerRepository.findAll());
//        model.addAttribute("DeliveryProcess", deliveryProcessRepository.findAll());
//        model.addAttribute("Lens", lensRepository.findAll());
//        model.addAttribute("ManufacturingProcess", manufacturingProcessRepository.findAll());
//        model.addAttribute("Material", materialRepository.findAll());
//        model.addAttribute("OrderForObj",orderForObjRepository.findAll());
//        model.addAttribute("Users", userRepository.findAll());
//        model.addAttribute("Worker", workerRepository.findAll());
//        model.addAttribute("Workplace", workplaceRepository.findAll());
//        model.addAttribute("Tools", toolRepository.findAll());
//        model.addAttribute("WorkShift", workShiftRepository.findAll());
//        return "tables";
//    }
    @GetMapping("/tables")
    public String tables2(Model model, @RequestParam(defaultValue = "test") String id, @RequestParam(defaultValue = "test") String table, @RequestParam(defaultValue = "test") String action) {
        model.addAttribute("Customers", customerRepository.findAll());
        model.addAttribute("DeliveryProcess", deliveryProcessRepository.findAll());
        model.addAttribute("Lens", lensRepository.findAll());
        model.addAttribute("ManufacturingProcess", manufacturingProcessRepository.findAll());
        model.addAttribute("Material", materialRepository.findAll());
        model.addAttribute("OrderForObj", orderForObjRepository.findAll());
        model.addAttribute("Users", userRepository.findAll());
        model.addAttribute("Worker", workerRepository.findAll());
        model.addAttribute("Workplace", workplaceRepository.findAll());
        model.addAttribute("Tools", toolRepository.findAll());
        model.addAttribute("WorkShift", workShiftRepository.findAll());
        JpaRepository repository;
        System.out.println(id + action);
        try {
            switch (table) {
                case "Customer":
                    repository = customerRepository;
                    break;
                case "DeliveryProcess":
                    repository = deliveryProcessRepository;
                    break;
                case "Lens":
                    repository = lensRepository;
                    break;
                case "ManufacturingProcess":
                    repository = manufacturingProcessRepository;
                    break;
                case "Material":
                    repository = materialRepository;
                    break;

                case "OrderForObj":
                    repository = orderForObjRepository;
                    break;
                case "Worker":
                    repository = workerRepository;
                    break;
                case "Workplace":
                    repository = workplaceRepository;
                    break;
                case "Tools":
                    repository = toolRepository;
                    break;
                case "WorkShift":
                    repository = workShiftRepository;
                    break;
                default:
                    throw new IllegalStateException("Unexpected value: " + table);
            }
            switch (action) {
                case "sel":
                    System.out.println("1");
                    model.addAttribute("ans", repository.findById(Integer.parseInt(id)));
                    break;
                case "del":
                    repository.deleteById(id);
                    model.addAttribute("ans", "запись удалена");
                    break;
                case "upd":

//                    System.out.println(Arrays.stream(repository.findById(Integer.parseInt(id)).get().getClass().getDeclaredFields()).count());
//                    for(Field f:repository.findById(Integer.parseInt(id)).get().getClass().getDeclaredFields()){
//                        System.out.println(f.getName());
//                    }
                    model.addAttribute("fields", repository.findById(Integer.parseInt(id)).get().getClass().getDeclaredFields());
                    model.addAttribute("ans", "запись удалена");
                    break;
            }

//            }
        } catch (Exception e) {
            System.out.println("error");
            if (!(id.equals("test") && table.equals("test")))
                model.addAttribute("ans", "Такого id не существует");
        }
        return "tables";
//        }
    }
    @PostMapping("/tables")
    public String tablesR( @RequestParam(defaultValue = "test") String id, @RequestParam(defaultValue = "test") String workplace, @RequestParam(defaultValue = "test") String type){
        System.out.println(id+" "+workplace+" "+type);
        return "tables";
    }
}
