# library-system
This project is a library management system developed in Java. It allows the management of books, users, and loan and reservation operations.

**Library Management System**  
**Description**  
This project is a library management system that allows the administration of books, users, and loan and reservation operations. The system is developed in Java and follows a modular architecture, divided into different packages to organize the functionalities.

**Project Structure**  
- **BibliotecaModelo:** Contains the main classes that represent the system's objects, such as *Livro* (Book), *Exemplar* (Copy), *Emprestimo* (Loan), *Reserva* (Reservation), and interfaces like *IObjeto*.  
- **Comando:** Contains the classes that implement the system's commands, such as *ConsultarLivro* (SearchBook), *FazerReserva* (MakeReservation), *RealizarEmprestimo* (PerformLoan), among others. Each command implements the *IComando* interface.  
- **Sistema:** Contains the classes that manage the system's logic, such as *Entrada* (Input), *Main*, *MensagemSistema* (SystemMessage), *Repositorio* (Repository), and *Trabalhador* (Worker).  
- **UsuarioModelo:** Contains the classes that represent the system's users, such as *AlunoGrad* (UndergraduateStudent), *AlunoPos* (GraduateStudent), *Professor*, and interfaces like *IObservador* (Observer) and *IRegra* (Rule).

**Features**  
- **Book Management:** Add, search, and manage book copies.  
- **User Management:** Add and search for users, including undergraduate students, graduate students, and professors.  
- **Loans:** Perform and manage book loans for users.  
- **Reservations:** Perform and manage book reservations.  
- **Notifications:** Notify observers (professors) when a book reaches a certain number of reservations.  
- **Commands:** Execute commands to perform system operations, such as loans, returns, reservations, searches, and observer registration.

**How to Run**  
- Clone the repository.  
- Import the project into your preferred Java IDE.  
- Run the *Sistema.Main* class to start the system.  
- Use the console to enter commands and interact with the system.

**Command Examples**  
- `emp <userCode> <bookCode>`: Perform a book loan.  
- `dev <userCode> <bookCode>`: Perform a book return.  
- `res <userCode> <bookCode>`: Make a book reservation.  
- `liv <bookCode>`: View book information.  
- `usu <userCode>`: View user information.  
- `ntf <userCode>`: Check notifications for an observer.  
- `sai`: Exit the system.  

**Dependencies**  
- Java SDK 23

**Contributing**  
Contributions are welcome! Feel free to open issues and pull requests.
