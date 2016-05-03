package myProject.app;

import myProject.entities.EmployeeEntity;
import myProject.entities.PositionEntity;
import myProject.services.EmployeeService;
import myProject.services.PositionService;
import org.springframework.context.support.GenericXmlApplicationContext;

import java.util.List;
import java.util.Locale;

/**
 * Created by 1 on 02.05.2016.
 */
public class Main {
    public static void main(String[] args) {
        Locale.setDefault(new Locale("EN"));
        GenericXmlApplicationContext ctx = new GenericXmlApplicationContext();
        ctx.load("classpath:spring-config.xml"); //move from src.main.java to src.main.resources
        ctx.refresh();

        PositionService service = ctx.getBean("jpaPositionService", PositionService.class);
        List<PositionEntity> positions = service.findAll();
        printAll(positions);

        positions = service.findByName("Test Manager");
        printAll(positions);

        EmployeeService eService = ctx.getBean("jpaEmployeeService", EmployeeService.class);
        List<EmployeeEntity> employees = eService.findAll();
        printAll(employees);

        EmployeeEntity emp_new = new EmployeeEntity();
        emp_new.setId(1L);
        emp_new.setName("Carl Carpov");
        emp_new.setPosition_id(3L);
        emp_new.setEmail("Carpov@mail.ru");
        emp_new.setPhone("777-88-77");
        emp_new.setAge(35);
        emp_new.setStatus("single");
        emp_new.setExperience(10);
        emp_new.setSalary(33000);
        eService.save(emp_new);

        eService.delete(1L);

        ctx.close();

    }

    private static <T> void printAll(List<T> entities) {
        System.out.println("printAll: ");
        for (T entity : entities) {
            System.out.println(entity);
        }
    }
}
