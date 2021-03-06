package br.com.albergue.controller.dto;

import java.time.LocalDate;

import org.springframework.data.domain.Page;

import br.com.albergue.domain.Address;
import br.com.albergue.domain.Customer;

public class CustomerDto {
	
	private Long id;
	private String title;
	private String name;
	private String lastname;
	private LocalDate birthday;
	private Address address;
	private String email;
	private String password;
	
	public CustomerDto(Customer customer) {
		this.id = customer.getId();
		this.title = customer.getTitle();
		this.name = customer.getName();
		this.lastname = customer.getLastName();
		this.birthday = customer.getBirthday();
		this.address = customer.getAddress();
		this.email = customer.getEmail();
		this.password = customer.getPassword();
	}
	
	public Long getId() {
		return id;
	}

	public String getTitle() {
		return title;
	}

	public String getName() {
		return name;
	}

	public String getLastname() {
		return lastname;
	}

	public LocalDate getBirthday() {
		return birthday;
	}

	public Address getAddress() {
		return address;
	}

	public String getEmail() {
		return email;
	}
	
	public String getPassword() {
		return password;
	}

	public static Page<CustomerDto> converter(Page<Customer> customer) {
		//fazendo um map de topico para topicoDto
		//TopicoDto::new -> recebe o proprio construtor que recebe um topico como parametro
		//collect() -> transforma essa saida em uma lista
//		return topicos.stream().map(TopicoDto::new).collect(Collectors.toList());
	
		return customer.map(CustomerDto::new);
	}
}