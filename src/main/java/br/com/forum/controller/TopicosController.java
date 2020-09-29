package br.com.forum.controller;

import java.util.Arrays;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import br.com.forum.controller.dto.TopicoDto;
import br.com.forum.model.Curso;
import br.com.forum.model.Topico;

@RestController
public class TopicosController {
	
	@RequestMapping("/topicos")
	@ResponseBody
	public List<TopicoDto> lista(){
		
		Topico topico1 = new Topico("Dúvidas", "Duvida com Spring Boot", new Curso("Spring", "Programação"));
		
		return TopicoDto.converter(Arrays.asList(topico1,topico1,topico1));
	}

}
