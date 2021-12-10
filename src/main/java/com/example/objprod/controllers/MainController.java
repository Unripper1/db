package com.example.objprod.controllers;


import com.example.objprod.entities.*;
import com.example.objprod.repos.*;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

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
    public String tables2(Model model,@RequestParam(defaultValue="test") String id,@RequestParam(defaultValue="test") String table){
        model.addAttribute("Customers", customerRepository.findAll());
        model.addAttribute("DeliveryProcess", deliveryProcessRepository.findAll());
        model.addAttribute("Lens", lensRepository.findAll());
        model.addAttribute("ManufacturingProcess", manufacturingProcessRepository.findAll());
        model.addAttribute("Material", materialRepository.findAll());
        model.addAttribute("OrderForObj",orderForObjRepository.findAll());
        model.addAttribute("Users", userRepository.findAll());
        model.addAttribute("Worker", workerRepository.findAll());
        model.addAttribute("Workplace", workplaceRepository.findAll());
        model.addAttribute("Tools", toolRepository.findAll());
        model.addAttribute("WorkShift", workShiftRepository.findAll());
        try {
            switch (table) {
                case "Customer":
                    model.addAttribute("ans", customerRepository.findById(Integer.parseInt(id)).orElse(new Customer()));
                    break;
                case "DeliveryProcess":
                    model.addAttribute("ans", deliveryProcessRepository.findById(Integer.parseInt(id)).orElse(new DeliveryProcess()));
                    break;
                case "Lens":
                    model.addAttribute("ans", lensRepository.findById(Integer.parseInt(id)).orElse(new Lens()));
                    break;
                case "ManufacturingProcess":
                    model.addAttribute("ans", manufacturingProcessRepository.findById(Integer.parseInt(id)).orElse(new ManufacturingProcess()));
                    break;
                case "Material":
                    model.addAttribute("ans", materialRepository.findById(Integer.parseInt(id)).orElse(new Material()));
                    break;

                case "OrderForObj":
                    model.addAttribute("ans", orderForObjRepository.findById(Integer.parseInt(id)).orElse(new OrderForObj()));
                    break;
                case "Worker":
                    model.addAttribute("ans", workerRepository.findById(Integer.parseInt(id)).orElse(new Worker()));
                    break;
                case "Workplace":
                    model.addAttribute("ans", workplaceRepository.findById(Integer.parseInt(id)).orElse(new Workplace()));
                    break;
                case "Tools":
                    model.addAttribute("ans", toolRepository.findById(Integer.parseInt(id)).orElse(new Tool()));
                    break;
                case "WorkShift":
                    model.addAttribute("ans", workShiftRepository.findById(Integer.parseInt(id)).orElse(new WorkShift()));
                    break;

            }
        }
        catch (Exception e){
            if(!(id.equals("test") && table.equals("test")))
            model.addAttribute("ans","Такого id не существует");
        }
        return "tables";
    }
    @PostMapping("/tables")
    public String tablesR(Model model, Long id,String table){
        System.out.println(id+" "+table);
        return "tables";
    }

}
