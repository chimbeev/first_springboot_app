package ru.esstu.first_springboot_app;
//простейший пример реализации MVC  (Model - View - Controller) на примере Spring-MVC. Для этого напишем небольшое Hello World приложение на spring-boot.
// При создании проекта необходимо выбрать компоненты Spring Framework, который мы будем использовать. Нам достаточно двух:
// Spring Web - компонента, которая позволит нам создавать Web приложения. Данная компонента включает в себя Spring MVC.
// Thymeleaf - Так называемый движок шаблонов. Штука, которая позволит нам передавать данные из Java в HTML страницы
//У нас будет главная страница - index.html, внутри которого будет располагаться ссылка на страницу приветствия - greeting.html.
//На странице greeting мы отобразим приветствие.
// Реализуем возможность передачи имени для приветствия на страницу greeting.html через параметры url.
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class FirstSpringbootAppApplication {

	public static void main(String[] args) {
		SpringApplication.run(FirstSpringbootAppApplication.class, args);
	}

}
