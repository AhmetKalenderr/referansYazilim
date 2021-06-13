package com.ahmetkalender.referansyazilimproje.api.controllers;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.validation.FieldError;
import org.springframework.web.bind.MethodArgumentNotValidException;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import com.ahmetkalender.referansyazilimproje.Entities.concretes.Personal;
import com.ahmetkalender.referansyazilimproje.business.abstracts.PersonalService;
import com.ahmetkalender.referansyazilimproje.core.utilities.results.DataResult;
import com.ahmetkalender.referansyazilimproje.core.utilities.results.ErrorDataResult;
import com.ahmetkalender.referansyazilimproje.core.utilities.results.Result;


@RestController
@CrossOrigin
@RequestMapping("api/personals")
public class personalControllers {

	private PersonalService personalService;

	@Autowired
	public personalControllers(PersonalService personalService) {
		super();
		this.personalService = personalService;
	}
	
	@GetMapping("/getall")
	public DataResult<List<Personal>>getAll() {
		return this.personalService.getAll();
	}
	
	@PostMapping("/add")
	public Result add(Personal personal) {
	     return this.personalService.add(personal);
	}
	
	@ExceptionHandler(MethodArgumentNotValidException.class)
	@ResponseStatus(HttpStatus.BAD_REQUEST)
	public ErrorDataResult<Object>
	handleValidationException(MethodArgumentNotValidException  exceptions) {
		Map<String,String> validationErrors = new HashMap<String, String>();
		for(FieldError fieldError : exceptions.getBindingResult().getFieldErrors()) {
			validationErrors.put(fieldError.getField(),fieldError.getDefaultMessage());
		}
		
		ErrorDataResult<Object> errors =
				new ErrorDataResult<Object>("Doğrulama Hatası",validationErrors);
				return errors;
	}
}
