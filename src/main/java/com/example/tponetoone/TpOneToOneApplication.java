package com.example.tponetoone;

import com.example.tponetoone.entities.*;
import com.example.tponetoone.repositories.*;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import java.util.Calendar;

@SpringBootApplication
public class TpOneToOneApplication {

    public static void main(String[] args) {
        SpringApplication.run(TpOneToOneApplication.class, args);
    }

    @Bean
    CommandLineRunner start(
            Client1Repository client1Repository,
            Command1Repository command1Repository,
            Client2Repository client2Repository,
            Command2Repository command2Repository,
            Client3Repository client3Repository, Command3Repository command3Repository
    )
    {return args -> {
        //Tester Navigation Commande1 vers Client1. On ne peut faire
        //dans l'autre sens
/*
			Client1 c1 = Client1.builder()
					.nom("Sara")
					.email("sara@yahoo.ma")
					.build();
			       client1Repository.save(c1);

			Client1 c2 = Client1.builder()
					.nom("Mohammed")
					.email("mohammed@fsr.ac.ma")
					.build();

			client1Repository.save(c2);

			Client1 c3 = Client1.builder()
					.nom("Naima")
					.email("naima.mechouate@um5r.ac.ma")
					.build();

			client1Repository.save(c3);

			 Calendar a = Calendar.getInstance();
			 Integer  year =  a.get(Calendar.YEAR);

			 Command1 cm1 = Command1.builder()
			    		.montant(90000.0)
			    		.creatDate(year)
			    		.client(c3)
			    		.build();

			       command1Repository.save(cm1);

			      Command1 cm2 = Command1.builder()
			       		.montant(70000.0)
			       		.creatDate(year)
			       		.client(c2)
			       		.build();

			          command1Repository.save(cm2);


			          Command1 cm3 = Command1.builder()
					       		.montant(30000.0)
					       		.creatDate(year)
					       		.client(c1)
					       		.build();
                      command1Repository.save(cm3);
                      Command1 cm= command1Repository.findById(1L).get();

		System.out.println("De commande vers client=============================");
	   System.out.println("Nom client "+cm.getClient().getNom());
		System.out.println("Montant = "+ cm.getMontant());
*/
        // ==============================================================
        //Tester Navigation dans les deux sens avec Client2 et Commande2 */
/*
        Client2 c1 = Client2.builder()
				.nom("Sara")
				.email("sara@yahoo.ma")
				.build();
		client2Repository.save(c1);

		Client2 c2 = Client2.builder()
				.nom("Mohammed")
				.email("mohammed@fsr.ac.ma")
				.build();

		client2Repository.save(c2);

		Client2 c3 = Client2.builder()
				.nom("Naima")
				.email("naima.mechouate@um5r.ac.ma")
				.build();

		client2Repository.save(c3);

		Calendar a = Calendar.getInstance();
		 Integer  year =  a.get(Calendar.YEAR);
		 Command2 cm1 = Command2.builder()
		    		.montant(90000.0)
		    		.creatDate(year)
		    		.client(c2)
		    		.build();

		       command2Repository.save(cm1);

		      Command2 cm2 = Command2.builder()
		       		.montant(70000.0)
		       		.creatDate(year)
		       		.client(c1)
		       		.build();

              command2Repository.save(cm2);


              Command2 cm3 = Command2.builder()
				       		.montant(30000.0)
				       		.creatDate(year)
				       		.client(c3)
				       		.build();
              command2Repository.save(cm3);


	 Client2 c = client2Repository.findById(1).get();
	System.out.println("Navigation de Client2 vers Commande2");

	System.out.println("Nom client " +c.getNom());
	System.out.println("Montant de sa commande "+c.getCommand().getMontant());


	Command2 cm= command2Repository.findById(1).get();
	System.out.println("Navigation de Commande2 vers Client2");
	System.out.println("Nom client " +cm.getClient().getNom());
	System.out.println("Montant de sa commande "+cm.getMontant());


 */

        /* ==========avec Table d'association Commande3 et Client3 =============== */


        Client3 c1 = Client3.builder()
                .nom("Sara")
                .email("sara@yahoo.ma")
                .build();
        client3Repository.save(c1);

        Client3 c2 = Client3.builder()
                .nom("Mohammed")
                .email("mohammed@fsr.ac.ma")
                .build();

        client3Repository.save(c2);

        Client3 c3 = Client3.builder()
                .nom("Naima")
                .email("naima.mechouate@um5r.ac.ma")
                .build();

        client3Repository.save(c3);

        Calendar a = Calendar.getInstance();
        Integer  year =  a.get(Calendar.YEAR);

        Command3 cm1 = Command3.builder()
                .montant(90000.0)
                .creatDate(year)
                .client(c2)
                .build();

        command3Repository.save(cm1);

        Command3 cm2 = Command3.builder()
                .montant(70000.0)
                .creatDate(year)
                .client(c1)
                .build();

        command3Repository.save(cm2);


        Command3 cm3 = Command3.builder()
                .montant(30000.0)
                .creatDate(year)
                .client(c3)
                .build();

        command3Repository.save(cm3);

        Client3 c = client3Repository.findById(1).get();

        Command3 cm= command3Repository.findById(1).get();
        System.out.println("Navigation de Client3 vers Commande3");

        System.out.println("Nom client " +c.getNom());
        System.out.println("Montant de sa commande "+c.getCommand().getMontant());


        System.out.println("Navigation de Commande3 vers Client3");
        System.out.println("Nom client " +cm.getClient().getNom());
        System.out.println("Montant de sa commande "+cm.getMontant());


    };

    }
}
