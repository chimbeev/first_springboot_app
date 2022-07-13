package ru.esstu.first_springboot_app.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

//Аннотация @Controller - говорит о том, что данный класс является контроллером. Контроллеры в Spring обрабатывают HTTP запросы на определенный адреса.
@Controller
public class HelloWorldController {
    //Данная аннотация говорит нам о том, что данный метод обрабатывает HTTP GET запросы на адрес /greeting. Иными словами, данный метод сработает, если кто-то перейдет по адресу /greeting.
    @RequestMapping(value = "/greeting")
    public String helloWorldController(@RequestParam(name = "name", required = false, defaultValue = "World") String name, Model model) {
        model.addAttribute("name", name);
        //Здесь мы создаем новый атрибут с именем name и присваиваем ему значение параметра name.
        return "greeting";
    }

}
//Наш метод принимает 2 аргумента. Разберем их:
//
//Параметр 1:
//@RequestParam(name = "name", required = false, defaultValue = "World") String name. Аннотация @RequestParam говорит о том, что параметр String name - является параметром url. В скобках аннотации
// указано, что данный параметр в url является не обязательным (required = false), в случае его отсутствия, значением параметра String name будет World (defaultValue = "World"), а если он будет
// присутствовать, то данный параметр в url будет именоваться name (name = "name")
//Параметр 2:
//Вторым параметром является Model model. Данный параметр является некоторой моделью. Данная модель состоит внутри из различных атрибутов. Каждый атрибут имеет имя и значение. Что-то вроде пар
// ключ-значение. С помощью данного параметра мы можем передавать данные из Java кода в html страницы. Или же, говоря терминологией MVC, передавать данные из Модели (Model) в Представление (View).