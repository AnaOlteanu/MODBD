# Methods of Optimization and Distribution in Databases Oracle project
Master's team project of 3 members designed to showcase the configuration, implementation, management and using of a _distributed database (DDB)_ starting from an OLTP database. It consists of 3 modules: Analysis, Database 
implementation and Application development. The [documentation file](https://github.com/AnaOlteanu/MODBD/blob/main/MODBD_documentation.pdf) 
contains a summary of all the stages of the project, while the [development of the application](https://github.com/AnaOlteanu/MODBD/tree/main/front-end_module) consists of 3 Spring MVC projects 
that serve as an interface for solving the requirements needed.  
The theme chosen for this project is the management of hotel reservations. Our application starts from the premise that there is an initial database of a travel agency which is the foundation for the data 
distribution process. Following the process of _geographical data distribution_, several local databases will be obtained, two in number, depending on the country of the hotels: **Romania** or **other countries**. 
Another **global database** will be configured that will allow global management of all data stored in the system.
## Technologies used
- Oracle SQL database
- Spring Framework
## Modules summary
1. **Analysis report**
      - objective: _creating an analysis report to define the distributed DB and develop the application that will run based on it_
  - description of the chosen model, entity and conceptual diagrams for the OLTP database
  - description of the distribution (the number of the servers in the network)
  - arguing the decision to fragment relationships (primary horizontal fragmentation, derivative horizontal fragmentation, vertical fragmentation) and validate the corectness of it
  - arguing the decision to replicate certain relationships or/and store a relationship on a single server
  - defining the model constraints
2. **Database implementation**
      - objective: _defining the DDB based on the analysis report_
  - create and populate the DDB 
  - providind transparency for the entire model, ensuring data synchronization for replicated relationships, ensuring all integrity constraints
  - SQL query optimization implementation
3. **Application development**
      - objective: _creating an interface that shows all the requirements described previously_
  - add and manage data in the local databases
  - view data in the global database
  - evaluate the impact of changes on data stored in the local DB in the global DB
  - the possibility to verify at the local database level the propagation of LMD operations performed at the global database level
## Personal contribution
  - creating and populate the databases
  - describing the distribution, arguing the fragmantation of the relationships and validate the corectness of it
  - providing transparency for the model
  - application development (bd_ro, bd_other)








