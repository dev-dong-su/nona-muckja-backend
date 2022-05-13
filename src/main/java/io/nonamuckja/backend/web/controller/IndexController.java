package io.nonamuckja.backend.web.controller;

import java.io.IOException;

import javax.servlet.http.HttpServletResponse;

import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import io.nonamuckja.backend.security.AuthUserDTO;
import io.nonamuckja.backend.web.dto.UserDTO;
import lombok.RequiredArgsConstructor;

@RestController
@RequiredArgsConstructor
public class IndexController {

	@GetMapping("/")
	public void index(HttpServletResponse response) throws IOException {
		response.sendRedirect("/swagger-ui/");
	}

	@PreAuthorize("hasRole('USER')")
	@GetMapping("/auth")
	public String auth(@AuthUserDTO UserDTO userDTO) {
		return userDTO.getUsername();
	}
}
