package com.wsl.mycat.controller;

import com.wsl.mycat.error.ResponseMessage;
import com.wsl.mycat.service.DeleteServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@CrossOrigin
@RestController
@RequestMapping("delete")
public class DeleteDataController {
    @Autowired
    private DeleteServiceImpl deleteService;

    @GetMapping(value = "")
    public ResponseMessage<String> clearAllData() {
        return new ResponseMessage.Success<>(deleteService.deleteData());
    }
}