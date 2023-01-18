package org.greatlearning.tta;

import java.time.LocalDate;
import java.time.LocalDateTime;

import org.greatlearning.tta.entities.Ticket;
import org.greatlearning.tta.repositories.TicketRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class MyAppRunner implements CommandLineRunner{
	@Autowired
	private TicketRepository ticketRepository;
	
	@Override
	public void run(String... args) throws Exception {
		
		 Ticket t1=new Ticket(); 
		 t1.setTitle("RITM001");
		 t1.setShortDescription("Create new Study Setup");
		 t1.setCreatedOn(LocalDate.now());
		 ticketRepository.save(t1);
		 
//		 Employee e2=new Employee(); e2.setFirstName("Ramesh");
//		 e2.setLastName("Rathode"); e2.setEmail("Ramesh@gmail.com");
//		 employeeRepository.save(e1); employeeRepository.save(e2);
		 
	}

}
